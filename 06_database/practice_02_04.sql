SELECT 
    EMP_NAME,
    EMP_NO, 
    PHONE, 
    DEPT_TITLE, 
    JOB_NAME
FROM
    employee AS a
INNER JOIN
    job b 
ON 
	a.JOB_CODE = b.JOB_CODE
INNER JOIN
    department AS c ON a.DEPT_CODE = c.DEPT_ID
ORDER BY
	HIRE_DATE ASC;

	
    
