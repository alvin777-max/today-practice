/* 
러시아에서 발발한 전쟁으로 인해 정신적 피해를 입은 직원들에게 위로금을 전달하려고 합니다. 위로금은 각자의 급여에 해당 직원의 급여 등급에 해당하는 최소 금액을 더한 금액으로 정했습니다.

Q4에서 작성한 쿼리를 활용하여 해당 부서의 국가가 ‘러시아’인 직원들을 대상으로, 직원의 사원번호, 직원명, 급여, 부서명, 국가명, 위로금을 출력하세요.

단, 위로금의 결과 집합 헤더는 ‘위로금’으로 출력되도록 하고, 위로금 내림차순으로 출력되도록 하세요.
*/

SELECT
	a.EMP_ID,
    a.EMP_NAME,
    a.SALARY,
    b.DEPT_TITLE,
    d.NATIONAL_NAME,
    a.SALARY + e.MIN_SAL AS '위로금'
FROM
	employee a 
LEFT JOIN
	department b
ON
	a.DEPT_CODE = b.DEPT_ID
LEFT JOIN
	location c
ON
	b.LOCATION_ID = c.LOCAL_CODE
LEFT JOIN
	nation d
ON
	c.NATIONAL_CODE = d.NATIONAL_CODE
JOIN
	sal_grade e
ON
	a.SAL_LEVEL = e.SAL_LEVEL
WHERE
	d.NATIONAL_NAME LIKE '%러시아%'
ORDER BY
	위로금 DESC;
	