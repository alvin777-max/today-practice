/* 사내 행사 준비를 위해 직원 목록을 출력하려고 합니다. 직원 목록을 다음과 같이 출력하세요.

단, 관리자의 이름순으로 정렬하여 출력되도록 하세요.

!Untitled

- 직원명, 직급명, 주민등록번호, 부서가 있는 국가, 부서명, 해당 직원의 관리자 직원명을 출력해야 함
- 출력한 결과집합 헤더의 명칭은 각각 ‘NAME_TAG’, ‘EMP_NO’, ‘BELONG’, ‘MANAGER_NAME’이어야 하며 출력 형식은 각각 아래와 같아야 함
    - NAME_TAG : (직원명) (직급명)님
    - EMP_NO : (생년월일6자리)-(뒷자리 한 자리를 제외하고는 *로 표시)
    - BELONG : (부서의 국가)지사 (부서명) 소속
- HINT 1
    
    JOIN
    
- HINT 2
    
    CONCAT
    
- HINT 3
    
    RPAD
    
- HINT 4
    
    SUBSTRING
*/

SELECT
	CONCAT(a.EMP_NAME, ' ', b.JOB_NAME, '님') AS 'NAME_TAG',
    CONCAT
    (
    SUBSTRING(a.EMP_NO, 1, 8),
    RPAD('', 6, '*')) AS EMP_NO,
    CONCAT(e.NATIONAL_NAME, '지사 ', c.DEPT_TITLE, ' 소속') AS 'BELONG',
	f.EMP_NAME AS 'MANAGER_NAME'
FROM
	employee a
INNER JOIN
	job b
ON
	a.JOB_CODE = b.JOB_CODE
INNER JOIN
	department c
ON
	a.DEPT_CODE = c.DEPT_ID
INNER JOIN
	location d
ON
	c.LOCATION_ID = d.LOCAL_CODE
INNER JOIN
	nation e
ON
	d.NATIONAL_CODE = e.NATIONAL_CODE
LEFT JOIN
	employee f
ON
	a.MANAGER_ID = f.EMP_ID
ORDER BY
	f.EMP_NAME ASC;

	
    
    
