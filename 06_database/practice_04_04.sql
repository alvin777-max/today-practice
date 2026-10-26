/* 1. 부서가 영업부가 아니면서(부서명에 ‘영업’이 포함되지 않음) 직급명이 ‘대리’ 혹은 ‘차장’인 직원의 목록과 급여가 200만원 이상 300만원 이하인 직원의 목록을 합쳐 출력합니다. (이때, 직원의 사원번호, 직원명, 전화번호, 부서명, 직급명, 급여를 출력하도록 하세요.)
    - HINT
        
        UNION ALL을 활용하세요.
        
2. 1에서 출력한 목록에서 직원의 이름과 급여를 기준으로 묶어 해당 직원이 몇 번 나오는지 카운트합니다. (이때, 추출한 목록에는 직원명, 급여, 나온 횟수가 출력되도록 하세요.)
    - HINT
        
        SUBQUERY와 GROUP BY를 활용하세요
        
3. 2에서 출력한 목록을 목록에 나온 횟수가 많은 순으로 정렬한 뒤에 급여가 많은 순으로 정렬하여 최상위 3명만 출력되도록 합니다. */

/* ---- 1 ---- */
SELECT 
	t.EMP_ID,
    t.EMP_NAME,
    t.PHONE,
    t.DEPT_TITLE,
    t.JOB_NAME,
    t.SALARY
FROM
	(SELECT 
		emp.EMP_ID,
		emp.EMP_NAME,
		emp.PHONE,
		dept.DEPT_TITLE,
		j.JOB_NAME,
		emp.SALARY
	FROM
		employee emp
	INNER JOIN
		department dept
	ON
		emp.DEPT_CODE = dept.DEPT_ID
	INNER JOIN
		job j
	ON
		emp.JOB_CODE = j.JOB_CODE
	WHERE
		dept.DEPT_TITLE NOT LIKE '%영업%' 
        AND	j.JOB_NAME IN ('대리', '차장')
UNION ALL
	SELECT 
		emp.EMP_ID,
		emp.EMP_NAME,
		emp.PHONE,
		dept.DEPT_TITLE,
		j.JOB_NAME,
		emp.SALARY
	FROM
		employee emp
	INNER JOIN
		department dept
	ON
		emp.DEPT_CODE = dept.DEPT_ID
	INNER JOIN
		job j
	ON
		emp.JOB_CODE = j.JOB_CODE
	WHERE
		emp.SALARY BETWEEN 2000000 AND 3000000 ) t;
        
/*---- 2 ---- */

SELECT 
    a.EMP_NAME,
    a.SALARY,
    COUNT(a.EMP_NAME)
FROM
	(SELECT 
	t.EMP_ID,
    t.EMP_NAME,
    t.PHONE,
    t.DEPT_TITLE,
    t.JOB_NAME,
    t.SALARY
		FROM
			(SELECT 
				emp.EMP_ID,
				emp.EMP_NAME,
				emp.PHONE,
				dept.DEPT_TITLE,
				j.JOB_NAME,
				emp.SALARY
			FROM
				employee emp
			INNER JOIN
				department dept
			ON
				emp.DEPT_CODE = dept.DEPT_ID
			INNER JOIN
				job j
			ON
				emp.JOB_CODE = j.JOB_CODE
			WHERE
				dept.DEPT_TITLE NOT LIKE '%영업%' 
				AND	j.JOB_NAME IN ('대리', '차장')
		UNION ALL
			SELECT 
				emp.EMP_ID,
				emp.EMP_NAME,
				emp.PHONE,
				dept.DEPT_TITLE,
		j.JOB_NAME,
		emp.SALARY
	FROM
		employee emp
	INNER JOIN
		department dept
	ON
		emp.DEPT_CODE = dept.DEPT_ID
	INNER JOIN
		job j	
	ON
		emp.JOB_CODE = j.JOB_CODE
	WHERE
		emp.SALARY BETWEEN 2000000 AND 3000000 
        ) t 
	) a
GROUP BY
	a.EMP_NAME,
    a.SALARY;
    
/* ---- 3 ---- */

SELECT 
    a.EMP_NAME,
    a.SALARY,
    COUNT(a.EMP_NAME)
FROM
	(SELECT 
	t.EMP_ID,
    t.EMP_NAME,
    t.PHONE,
    t.DEPT_TITLE,
    t.JOB_NAME,
    t.SALARY
		FROM
			(SELECT 
				emp.EMP_ID,
				emp.EMP_NAME,
				emp.PHONE,
				dept.DEPT_TITLE,
				j.JOB_NAME,
				emp.SALARY
			FROM
				employee emp
			INNER JOIN
				department dept
			ON
				emp.DEPT_CODE = dept.DEPT_ID
			INNER JOIN
				job j
			ON
				emp.JOB_CODE = j.JOB_CODE
			WHERE
				dept.DEPT_TITLE NOT LIKE '%영업%' 
				AND	j.JOB_NAME IN ('대리', '차장')
		UNION ALL
			SELECT 
				emp.EMP_ID,
				emp.EMP_NAME,
				emp.PHONE,
				dept.DEPT_TITLE,
		j.JOB_NAME,
		emp.SALARY
	FROM
		employee emp
	INNER JOIN
		department dept
	ON
		emp.DEPT_CODE = dept.DEPT_ID
	INNER JOIN
		job j	
	ON
		emp.JOB_CODE = j.JOB_CODE
	WHERE
		emp.SALARY BETWEEN 2000000 AND 3000000 
        ) t 
	) a
GROUP BY
	a.EMP_NAME,
    a.SALARY
ORDER BY
	COUNT(a.EMP_NAME) DESC,
    a.SALARY DESC
limit 3;

	


	
		
	

		
        
		
		
    

