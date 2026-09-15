/*
======================================================================
문제 2. 타입 변환 — 문자열로 받은 금액 계산
======================================================================

가격과 배송비가 문자열로 전달되었습니다. 숫자로 변환한 뒤 합계를 구하세요.

입력
const inputPrice = '12000';
const inputDeliveryFee = '3000';

조건
- 입력 두 줄은 그대로 사용합니다.
- Number로 각각 변환한 결과를 별도 변수에 저장합니다.
- 변환한 값으로 합계를 계산합니다.
- 합계와 합계의 자료형을 출력합니다.
- 숫자 15000을 직접 출력하지 않습니다.

예상 출력
총 결제 금액: 15000
합계 타입: number

*/

// 문제 2 풀이

const inputPrice = '12000';
const inputDeliveryFee = '3000';
const inputPrice1 = (inputPrice - 0);
const inputDeliveryFee1 = (inputDeliveryFee - 0);
const total = inputPrice1 + inputDeliveryFee1;
console.log(`총 결제 금액: ${total}`);
console.log(`합계 타입: ${typeof inputPrice1}`);