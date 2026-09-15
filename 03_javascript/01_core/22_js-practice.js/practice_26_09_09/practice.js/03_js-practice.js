/*
======================================================================
문제 1. 변수와 자료형 — 상품 정보 출력
======================================================================

상품 하나의 정보를 변수에 저장하고 출력하세요.

조건
- 상품명 productName: '노트'
- 가격 price: 3000
- 판매 가능 여부 isAvailable: true
- 위 값을 각각 변수에 저장합니다.
- typeof로 각 값의 자료형도 출력합니다.
- 객체나 함수는 만들지 않습니다.

예상 출력
상품명: 노트
가격: 3000
판매 가능: true
상품명 타입: string
가격 타입: number
판매 가능 타입: boolean
*/

// 문제 1 풀이



const productName = '노트';
const price = 3000;
const isAvailable = true;
console.log(`상품명: ${productName}`);
console.log(`가격: ${price}`);
console.log(`판매 가능: ${isAvailable}`);
console.log(`상품명 타입: ${typeof productName}`);
console.log(`가격 타입: ${typeof price}`);
console.log(`판매 가능 타입: ${typeof isAvailable}`);
