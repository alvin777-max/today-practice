SELECT
	t.EMP_ID,
    t.EMP_NAME,
    t.DEPT_CODE,
    t.SALARY
FROM
	(SELECT
		*
        FROM
			department a
		LEFT JOIN
			employee b
		ON
			a.DEPT_ID = b.DEPT_CODE
		WHERE
			a.DEPT_TITLE LIKE '%영업%'
		ORDER BY 
			b.DEPT_CODE,
            a.DEPT_ID) t
WHERE
	t.EMP_ID IS NOT NULL;

	
	