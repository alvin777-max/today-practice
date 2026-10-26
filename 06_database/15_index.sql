# INDEX

-- 데이터가 엄청나게 많을경우 WHERE조건에 맞는 이름 하나를 찾으려면 비용과 속도가 느림
-- 검색 경로를 제공하는 객체 - 색인추가
-- 변경이 일어나면 색인도 추가되야함
-- 특정 조건을 보고 인덱스 사용 여부 결정해야함

CREATE TABLE phone (
	phone_code INT PRIMARY KEY,				-- PK는 인덱스가 만들어짐
    phone_name VARCHAR(100) NOT NULL,
    phone_price DECIMAL(10, 2) NOT NULL
);

INSERT INTO phone
VALUES(1, 'iPhone', 2400000), (2, 'Galaxy', 2000000), (3, 'Xiaomi', 1700000);

-- EXPLAIN은 SELECT문을 MYSQL이 어떻게 실행할지 보여준다.
EXPLAIN SELECT 
			*
		FROM 
			phone
		WHERE
			phone_name = 'iPhone';
            
-- 인덱스 생성            
CREATE INDEX idx_phone_name
ON phone(phone_name);

SHOW INDEX FROM phone;

-- 인덱스 삭제
DROP INDEX idx_phone_name ON phone;

-- JDBC 
-- 자바와 DB를 연결시키는 기술
-- JPA-단순 조회나 CRUD, MYbatis-복잡한 sql문
-- 둘이 같이 사용도 가능

