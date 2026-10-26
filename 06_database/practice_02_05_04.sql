SELECT
    a.EMP_NAME,
    c.DEPT_TITLE,
    b.EMP_NAME,
    d.DEPT_TITLE
FROM
    employee a
LEFT JOIN
    employee b
ON
    a.MANAGER_ID = b.EMP_ID
LEFT JOIN
    department c
ON
    a.DEPT_CODE = c.DEPT_ID
LEFT JOIN
    department d
ON
    b.DEPT_CODE = d.DEPT_ID
WHERE
    b.EMP_ID IS NOT NULL
ORDER BY
    a.EMP_NAME;