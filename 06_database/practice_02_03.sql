SELECT
	a.DEPT_TITLE AS '부서명',
	COUNT(DEPT_TITLE) AS '인원',
    SUM(SALARY) AS '급여합계',
    AVG(SALARY) AS '급여평균'
FROM
	department AS a
LEFT JOIN
	employee AS b
ON 
	a.DEPT_ID = b.DEPT_CODE
WHERE
	b.ENT_YN = 'N'
GROUP BY
	a.DEPT_TITLE WITH ROLLUP;


	
	
        
        