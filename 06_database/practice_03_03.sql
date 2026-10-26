-- 서브쿼리와 JOIN을 이용하여 영업부인 직원들의 사원번호, 직원명, 부서명, 급여를 출력하세요.

SELECT
	EMP_ID,
	EMP_NAME,
    DEPT_TITLE,
    SALARY
FROM (
    SELECT
		*
        FROM
			department a
		LEFT JOIN
			employee b
		ON
			a.DEPT_ID = b.DEPT_CODE
		WHERE
			a.DEPT_TITLE LIKE '%영업%') t
WHERE
	t.EMP_ID IS NOT NULL
ORDER BY
	t.DEPT_TITLE;
