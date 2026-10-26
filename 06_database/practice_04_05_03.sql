/* 모든 직원의 직원명, 급여, 보너스, 급여에 보너스를 더한 금액을 다음과 같이 출력하세요.

단, 급여에 보너스를 더한 금액이 높은 순으로 출력되도록 하세요.

!image.png

- 출력한 결과집합 헤더의 명칭은 각각 ‘EMP_NAME’, ‘SALARY’, ‘BONUS’, ‘TOTAL_SALARY’여야 함
- 보너스를 더한 급여는 소수점이 발생할 경우 반올림 처리함
- 급여와 보너스를 더한 급여는 천 단위로 , 를 찍어 출력해야 함
- 보너스는 백분율로 출력해야 함
- HINT 1
    
    급여에 보너스를 더한 금액을 구하고자 할 때, 보너스가 0이라면 원하는 값이 나오지 않을 겁니다. 수업 시간에 다루지 않았지만 NULL 값을 다른 값으로 대체하는 내장함수가 있습니다. 해당 함수를 찾아서 사용해 보세요🙂
    
- HINT 2
    
    FORMAT
    
- HINT 3
    
    CONCAT
    
- HINT 4
    
    TRUNCATE
    
- HINT 5
    
    ROUND
*/


SELECT
	EMP_NAME,
    FORMAT(SALARY, 0) AS 'SALARY',
    CONCAT(ROUND(BONUS * 100), '%') AS 'BONUS', 
    FORMAT(ROUND(SALARY + SALARY * IFNULL(BONUS, 0)), 0) AS 'TOTAL_SALARY'
FROM
	employee
ORDER BY
	ROUND(SALARY + SALARY * IFNULL(BONUS, 0)) DESC;

    
    