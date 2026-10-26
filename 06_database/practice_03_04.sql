/* ( 1. JOIN을 이용하여 부서의 부서코드, 부서명, 해당 부서가 위치한 지역명, 국가명을 추출하는 쿼리를 작성하세요.
2. 위 1에서 작성한 쿼리를 서브쿼리로 활용하여 모든 직원의 사원번호, 직원명, 급여, 부서명, (부서의) 국가명을 출력하세요.

단, 국가명 내림차순으로 출력되도록 하세요.
*/

/* --- 1 --- */

SELECT 
	a.DEPT_ID,
    a.DEPT_TITLE,
    c.LOCAL_NAME,
    d.NATIONAL_NAME
FROM
	department a
LEFT JOIN
	employee b
ON
	a.DEPT_ID = b.DEPT_CODE
LEFT JOIN
	location c
ON
	a.LOCATION_ID = c.LOCAL_CODE
LEFT JOIN
	nation d
ON
	c.NATIONAL_CODE = d.NATIONAL_CODE
GROUP BY
	a.DEPT_ID;
    
/* --- 2 --- */

SELECT
	t.EMP_ID,
    t.EMP_NAME,
    t.SALARY,
    t.DEPT_TITLE,
    t.NATIONAL_NAME
FROM (
		SELECT 
			b.EMP_ID,
			b.EMP_NAME,
			b.SALARY,
			a.DEPT_TITLE,
			d.NATIONAL_NAME
		FROM
			department a
		LEFT JOIN
			employee b
		ON
			a.DEPT_ID = b.DEPT_CODE
		LEFT JOIN
			location c
		ON
			a.LOCATION_ID = c.LOCAL_CODE
		LEFT JOIN
			nation d
		ON
			c.NATIONAL_CODE = d.NATIONAL_CODE) t
WHERE
	t.EMP_ID IS NOT NULL
ORDER BY	
	t.NATIONAL_NAME DESC,
    t.DEPT_TITLE;




	
    
	