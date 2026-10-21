SELECT 
	b.EMP_NAME,
    a.JOB_NAME,
    b.SALARY,
    b.EMP_ID,
    b.EMAIL,
    b.PHONE,
    b.HIRE_DATE
FROM 
	job AS a
LEFT JOIN
	employee AS b
ON
	a.JOB_CODE = b.JOB_CODE
WHERE
	b.ENT_YN = 'N'
    AND a.JOB_NAME = '대리'
ORDER BY
	SALARY DESC;
    


