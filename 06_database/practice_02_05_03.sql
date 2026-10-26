SELECT
	a.EMP_NAME,
    b.EMP_NAME
FROM
	employee a
LEFT JOIN
	employee b
ON 
	a.MANAGER_ID = b.EMP_ID 
ORDER BY
	a.EMP_NAME;
