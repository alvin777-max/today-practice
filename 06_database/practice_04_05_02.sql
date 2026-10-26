/* 근속 일수가 20년 이상인 직원의 직원명, 입사일, 급여를 다음과 같이 출력하세요.

단, 입사한 순서대로 출력하고 입사일이 같으면 급여가 높은 순서로 출력되도록 하세요.

!Untitled

- 출력한 결과집합 헤더의 명칭은 각각 ‘직원명’, ‘입사일’, ‘급여’여야 함
- 입사일은 ‘0000년 00월 00일’ 형식으로 출력해야 함
- 급여는 천 단위로 , 를 찍어 출력해야 함
- HINT 1
    
    CONCAT
    
- HINT 2
    
    FORMAT
    
- HINT 3
    
    DATE 관련 함수
    
- HING 4
    
    YEAR, MONTH, DAY
*/

SELECT
	EMP_NAME AS '직원명',
    CONCAT(SUBSTRING(HIRE_DATE, 1 , 4), '년' ,SUBSTRING(HIRE_DATE, 6, 2), '월', SUBSTRING(HIRE_DATE, 9, 2), '일') AS '입사일',
    SALARY AS '급여'
FROM
	employee
WHERE
	TIMESTAMPDIFF(YEAR, HIRE_DATE, NOW()) >= 20
ORDER BY
	HIRE_DATE;
	
    