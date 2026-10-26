SELECT
	COUNT(*)
FROM
	employee a 
INNER JOIN
	employee b
WHERE
	a.EMP_ID = b.MANAGER_ID;