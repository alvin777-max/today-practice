/* 단합을 위한 사내 체육대회를 위하여 팀을 꾸리는 중입니다. 기술지원부의 대리, 인사관리부의 사원, 영업부(팀명에 ‘영업’이 포함되면 영업부로 봄)의 부장을 한 팀으로 묶으려고 합니다. 이때, 이 팀의 팀원 수를 출력하세요.

단, UNION과 SUBQUERY를 활용하여 출력하세요.
*/

USE employdb;

SELECT
	COUNT(EMP_ID) AS '팀원수'
FROM
	(SELECT
		a.EMP_ID
		FROM
			employee a
		INNER JOIN
			department b
		ON 
			a.DEPT_CODE = b.DEPT_ID
		INNER JOIN 
			job c
		ON
			a.JOB_CODE = c.JOB_CODE
		WHERE
			b.DEPT_TITLE LIKE '기술지원부'AND
			c.JOB_NAME LIKE '대리'
UNION
SELECT
		A.EMP_ID
		FROM
			employee a
		INNER JOIN
			department b
		ON 
			a.DEPT_CODE = b.DEPT_ID
		INNER JOIN 
			job c
		ON
			a.JOB_CODE = c.JOB_CODE
		WHERE
			b.DEPT_TITLE LIKE '인사관리부'AND
			c.JOB_NAME LIKE '사원'
UNION
	SELECT
		a.EMP_ID
		FROM
			employee a
		INNER JOIN
			department b
		ON 
			a.DEPT_CODE = b.DEPT_ID
		INNER JOIN 
			job c
		ON
			a.JOB_CODE = c.JOB_CODE
		WHERE
			b.DEPT_TITLE LIKE '%영업%'AND
			c.JOB_NAME LIKE '부장') t;

	
	

