# DDL(Data Definition Language)
-- 데이터 정의 언어 (CREATE, ALTER, DROP)

-- 암시적으로 커밋됨 -- 트랜잭션으로 관리 어려움ALTER

# CREATE
-- 테이블 생성 구문
/*
CREATE TABLE 테이블명 (
	컬럼명 데이터타입(길이),
    컬럼명 데이터타입(길이),
    ...) ENGINE = ...;
*/

-- IF NOT EXISTS: 존재하지 않을때만 생성하기 위한 구문
CREATE TABLE IF NOT EXISTS tb1(					-- tb1이 존재하지 않으면 생성한다 -- if문 안쓰면 존재했을경우 에러발생
	pk INT,
    fk INT,
    col1 VARCHAR(255)							-- 문자열(최대 255)
)ENGINE=INNODB;

DESC tb1;	-- DESCRIBE tb1;

INSERT INTO tb1 VALUES(1, 10, 'Y');				-- 구조에 맞는 행 추가

SELECT * FROM tb1;

-- AUTO_INCREMENT
-- INSERT시 PRIMARY KEY에 해당하는 컬럼에 자동으로 번호를 발생시켜 저장할 수 있다

-- tb2 생성
CREATE TABLE IF NOT EXISTS tb2(
	pk INT AUTO_INCREMENT PRIMARY KEY,
    fk INT,
    col1 VARCHAR(255)
)ENGINE=INNODB;

DESCRIBE tb2;

-- pk값에 NULL을 주면 자동으로 번호가 채워진다
INSERT INTO tb2 VALUES(NULL, 10, 'Y');
INSERT INTO tb2 VALUES(NULL, 20, 'N');

SELECT * FROM tb2;

# ALTER
-- 테이블에 추가/변경/수정/삭제하는 모든 것은 ALTER 명령어를 사용해 적용한다
-- ADD: 새 컬럼 추가
-- DROP COLUMN: 컬럼 삭제
-- CHANGE COLUMN: 이름을 포함한 정의 변경
-- MODIFY: 이름을 유지한 정의 변경

-- 요즘엔 모델링만 잘하면 명령어로 잘 만들어줌

ALTER TABLE tb2
ADD col2 INT;		-- 컬럼 추가

DESC tb2;
SELECT * FROM tb2;

ALTER TABLE tb2
DROP COLUMN col2;	-- 컬럼 삭제

ALTER TABLE tb2
CHANGE COLUMN fk change_fk BIGINT;	-- 이름과 데이터타입을 함께 바꿀 때

DESC tb2;

ALTER TABLE tb2
MODIFY change_fk INT;		-- 데이터 타입 변경

CREATE TABLE IF NOT EXISTS tb3 (
	pk INT AUTO_INCREMENT PRIMARY KEY,
    fk INT,
    col1 VARCHAR(255)
)ENGINE=InnoDB;

DROP TABLE IF EXISTS tb4;	-- 테이블 구조와 데이터를 영구적으로 삭제

CREATE TABLE IF NOT EXISTS tb4 (
	pk INT AUTO_INCREMENT PRIMARY KEY,
    fk INT,
    col1 VARCHAR(255)
)ENGINE=InnoDB;

INSERT INTO tb4
	VALUES (NULL, 1, 'Y'), (NULL, 20, 'N');
    
SELECT * FROM TB4;

# TRUNCATE
-- 테이블 내용물만 비우고 초기화(구조는 남겨두고, 데이터만 비우고 싶을 때 사용)		-- DELETE VS TRUNCATE -- 특정 행만 vs 전부, 롤백 가능,불가능
TRUNCATE TABLE tb4;
    