/* Q1에서 생성한 TEAM_INFO 테이블과 MEMBER_INFO 테이블에 아래와 같이 데이터를 INSERT하는 쿼리를 작성하세요.

단, 삽입 대상 컬럼명은 반드시 명시해야 합니다.
*/
INSERT INTO TEAM_INFO 
	(TEAM_CODE, TEAM_NAME, TEAM_DETAIL, USE_YN)
	VALUES
		(NULL, '음악감상부', '클래식 및 재즈 음악을 감상하는 사람들의 모임', 'Y'),
        (NULL, '맛집탐방부', '맛집을 찾아다니는 사람들의 모임', 'N'),
        (NULL, '행복찾기부', NULL, 'Y');
        
INSERT INTO MEMBER_INFO
	(MEMBER_CODE, MEMBER_NAME, BIRTH_DATE, DIVISION_CODE, DETAIL_INFO, CONTACT, TEAM_CODE, ACTIVE_STATUS)
VALUES
	(NULL, '송가인', '1990-01-30', 1, '안녕하세요 송가인입니다~', '010-9494-9494', 1, 'H'),
    (NULL, '임영웅', '1992-05-03', NULL, '국민아들 임영웅입니다~', 'hero@trot.com', 1, 'Y'),
    (NULL, '태진아', NULL, NULL, NULL, '(1급 기밀)', 3, 'Y');

SELECT * FROM TEAM_INFO;
SELECT * FROM MEMBER_INFO;





	
