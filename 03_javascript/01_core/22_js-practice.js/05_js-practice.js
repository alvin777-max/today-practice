/*
======================================================================
문제 3. 연산자 — 무료 배송 대상 확인
======================================================================

회원이면서 주문 금액이 20000원 이상인 경우에만 무료 배송 대상입니다.

입력
const isMember = true;
const orderAmount = 18000;

조건
- 비교 연산자와 논리 AND 연산자(&&)로 결과를 계산합니다.
- 결과를 canGetFreeDelivery 변수에 저장해 출력합니다.
- if문이나 삼항 연산자는 사용하지 않습니다.
- 입력을 아래 세 경우로 하나씩 바꿔 확인합니다.

확인할 입력 → 예상 출력
true, 18000 → false
true, 20000 → true
false, 30000 → false

주의
같은 이름의 const를 아래에 반복 선언하지 말고,
처음 작성한 입력값을 바꾼 뒤 파일을 다시 실행하세요.
*/

// 문제 3 풀이

const isMember = true;
const orderAmount = 20000;
const canGetFreeDelivery = isMember && orderAmount >= 20000;
console.log(`${isMember}, ${orderAmount} -> ${canGetFreeDelivery}`);

