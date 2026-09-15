/*
======================================================================
문제 2. 설정값에 기본값 적용하기
======================================================================

사용자가 설정한 알림 횟수와 상태 메시지에 기본값을 적용하세요.

입력
const notificationCount = 0;
const statusMessage = '';
const profileImage = null;

조건
- null 병합 연산자(??)를 사용합니다.
- 알림 횟수의 기본값은 10입니다.
- 상태 메시지의 기본값은 '상태 메시지 없음'입니다.
- 프로필 이미지의 기본값은 'default.png'입니다.
- 0과 빈 문자열은 사용자가 직접 설정한 값이므로 그대로 출력되어야 합니다.
- 논리 OR 연산자(||)와 조건문을 사용하지 않습니다.

예상 출력
알림 횟수: 0
상태 메시지:
프로필 이미지: default.png
*/

// 문제 2 풀이

const notificationCount = null;
const statusMessage = null;
const profileImage = null;

console.log(`상태 메시지: ${notificationCount ?? 10}`);
console.log(`상태 메시지: ${statusMessage ?? '상태 메시지 없음'}`);
console.log(`프로필 이미지: ${profileImage ?? 'default.png'}`);