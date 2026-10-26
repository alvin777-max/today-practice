# CONSTRAINTS(제약 조건)

# NOT NULL
-- NULL값을 허용하지 않음

CREATE TABLE IF NOT EXISTS user_notnull (
	user_no INT NOT NULL,
    user_id VARCHAR(255) NOT NULL,
    user_pwd VARCHAR(255) NOT NULL,
    gender VARCHAR(3)
)ENGINE=INNODB;


INSERT INTO user_notnull VALUES(1, 'user01', 'pass01', '남');

SELECT * FROM user_notnull;

INSERT INTO user_notnull VALUES(2, 'user02', NULL, '여');	-- user_pwd는 NULL값이 들어갈 수 없기에 에러가 뜬다

INSERT INTO user_notnull VALUES(1, 'user01', 'pass01', NULL);	-- gender에는 NULL값이 들어갈 수 있음

DESC user_notnull;	-- gender만 YES	

-- NOT NULL은 이미 들어와있는 값과 같은 값이 들어있는것을 막을 순 없음 -> UNIQUE사용

#UNIQUE
-- 중복값 허용하지 않음

CREATE TABLE IF NOT EXISTS user_unique (
	user_no INT NOT NULL UNIQUE,		-- 회원번호는 중복될 수 없다(컬럼레벨)
    user_id VARCHAR(255) NOT NULL,
    user_pwd VARCHAR(255) NOT NULL,
    gender VARCHAR(3),
    UNIQUE(user_id)	-- id도 중복될 수 없다(테이블 레벨) - 복합도 가능
)ENGINE=INNODB;

INSERT INTO user_unique VALUES(1, 'user01', 'pass01', '남');

INSERT INTO user_unique VALUES(1, 'user02', 'pass02', '여');

INSERT INTO user_unique VALUES(3, 'user03', 'pass01', '남');

SELECT * FROM user_unique;

# PRIMARY KEY
-- 테이블에서 한 행의 정보를 찾기 위해 사용 할 컬럼을 의미
-- 테이블에 대한 식별자 역할을 한다 (한 행씩 구분하는 역할)
-- NOT NULL + UNIQUE 제약조건의 의미

CREATE TABLE IF NOT EXISTS user_primarykey (
	user_no INT,		-- 회원번호는 중복될 수 없다(컬럼레벨)
    user_id VARCHAR(255) NOT NULL,
    user_pwd VARCHAR(255) NOT NULL,
    gender VARCHAR(3),
    PRIMARY KEY (user_no)
)ENGINE=INNODB;

INSERT INTO user_primarykey VALUES(1, 'user01', 'pass01', '남');

INSERT INTO user_primarykey VALUES(1, 'user02', 'pass02', '여');		-- PK로 사용하는 값이 중복되었기에 에러 - 같은 행 식별자로 인식됨

INSERT INTO user_primarykey VALUES(3, 'user03', 'pass01', '남');

# FOREIGN KEY	
-- 두 테이블을 연결하고 관계를 맺어준다.
-- 참조된 다른 테이블에서 제공하는 값만 사용할 수 있다.
-- 제공되는 값 외에는 NULL을 사용할 수 있다.


-- 회원정보에 매번 '정회원' '준회원' '일반회원' 처럼 문자열로 저장하면 '일반 회원' 처럼 표기가 달라질 수 있고, 등급이 바뀌면 여러회원을 하나하나 바꿔줘야함 - 등급에 대한 정보를 다른 테이블에서 한번에 저장. - 실제 회원에 대한 테이블에서는 등급을 가리키는 코드만 저장
-- 1 일반회원 2 정회원/ 회원테이블: 홍길동 1, 유관순 2, 판다 1 - 이런식으로 저장할 수 있다
-- 1 일반회원 2 정회원: 부모 -> 그 등급코드를 사용하는 자식 테이블

CREATE TABLE IF NOT EXISTS user_grade (
	grade_code INT PRIMARY KEY,
    grade_name VARCHAR(255) NOT NULL
)ENGINE=INNODB;

INSERT INTO user_grade VALUES(10, '일반회원'), (20, '우수회원'), (30, '특별회원');

CREATE TABLE IF NOT EXISTS user_foreignkey1 (
	user_no INT PRIMARY KEY,
    grade_code INT,
    -- 이 테이블의 grade_code는 user_grade 테이블의 grade_code를 참조한다
    FOREIGN KEY (grade_code) REFERENCES user_grade(grade_code)
)ENGINE=INNODB;

INSERT INTO user_foreignkey1 VALUES(1, 10);
INSERT INTO user_foreignkey1 VALUES(2, 50);		-- 자식의 행을 추가하거나 업데이트 할 수 없음 - FK의 제약조건 위반 - 부모 컬럼에 있지 않은 값을 넣을려고 했기에
INSERT INTO user_foreignkey1 VALUES(2, 20);

SELECT * FROM user_foreignkey1;

-- MYSQL은 기본적으로 참조당하고 있는 부모의 변경을 막음 
-- BUT 바꿀 수도 있다

# ON UPDATE	/ ON DELETE 옵션
-- SET NULL: 부모(user_grade)가 바뀌거나 사라지면, 해당 값을 NULL로 바꾼다.
-- CASCADE: 부모가 바뀌면 자식도 따라 바뀌고, 부모가 사라지면 자식도 함께 사라진다.

CREATE TABLE IF NOT EXISTS user_foreignkey2 (
	user_no INT PRIMARY KEY,
    grade_code INT,
    -- 이 테이블의 grade_code는 user_grade 테이블의 grade_code를 참조한다
    FOREIGN KEY (grade_code) REFERENCES user_grade(grade_code)
    ON UPDATE SET NULL
    ON DELETE SET NULL
)ENGINE=INNODB;

INSERT INTO user_foreignkey2 VALUES(1,10), (2,20), (3, 30);
SELECT * FROM user_foreignkey2;

DROP TABLE IF EXISTS user_foreignkey1;

-- 부모 테이블의 grade_code 수정
UPDATE user_grade
SET grade_code = 40
WHERE grade_code = 10;

SELECT * FROM user_foreignkey2;

# CHECK
-- 들어올 수 있는 값의 범위나 조건을 직접 지정
CREATE TABLE IF NOT EXISTS user_check(
	user_no INT AUTO_INCREMENT PRIMARY KEY,
    user_name VARCHAR(255) NOT NULL,
    gender VARCHAR(3) CHECK (gender IN ('남', '여')),
    age INT	CHECK (age >= 19)
)ENGINE=INNODB;

INSERT INTO user_check VALUES(NULL, '홍길동', '남', 25);	
INSERT INTO user_check VALUES(NULL, '판다', '남', 5);	 	-- CHECK 조건 위반
INSERT INTO user_check VALUES(NULL, '홍길동', '여자', 20);		-- CHECK 조건 위반

SELECT * FROM user_check;

# DEFAULT
-- INSERT시 특정 컬럼에 값을 주지 않으면, 자동으로 채워질 기본값을 지정한다

CREATE TABLE IF NOT EXISTS tbl_country(
	country_code INt AUTO_INCREMENT PRIMARY KEY,
    country_name VARCHAR(255) DEFAULT '한국',
    add_day DATE DEFAULT(current_date),
    add_time TIME DEFAULT(current_time)
)ENGINE=INNODB;

INSERT INTO tbl_country VALUES(NULL, DEFAULT, DEFAULT, DEFAULT);
INSERT INTO tbl_country(country_name) VALUES('미국');	-- 전달하지 않은 값에 대해서만 디폴트 값으로 넣어줌

SELECT * FROM tbl_country;

















