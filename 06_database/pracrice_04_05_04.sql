/* 직원의 직원명과 이메일을 다음과 같이 출력하세요.

!Untitled

- 출력한 결과집합 헤더의 명칭은 각각 ‘EMP_NAME’, ‘EMAIL’이어야 함
- 이메일의 도메인 주소인 greedy.com 은 모두 동일하므로, 해당 문자열이 맞춰질 수 있도록 이메일의 앞에 공백을 두고 출력해야 함
- HINT 1
    
    LPAD
    
- HINT 2
    
    MAX
    
- HINT 3
    
    서브쿼리
    

```sql
답안
```

- +@ (심화)
    
    이메일의 도메인 주소가 모두 다르다고 가정할 때, @의 위치를 한 줄로 맞추고 싶은 경우에는 어떻게 수정할 수 있을까?
    
    ```sql
    답안
    ``` 
*/

SELECT 
	EMP_NAME,
    LPAD(EMAIL, (SELECT MAX(CHAR_LENGTH(EMAIL)) FROM employee), ' ') AS 'EMAIL'
FROM
	employee;
    
