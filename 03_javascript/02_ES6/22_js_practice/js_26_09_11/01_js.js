/*
======================================================================
문제 1. 화살표 함수로 주문 금액 계산하기
======================================================================

주문 객체 배열을 이용해 각 주문의 결제 금액을 계산하세요.

입력
const orders = [
    { product: '키보드', price: 50000, quantity: 2 },
    { product: '마우스', price: 30000, quantity: 1 },
    { product: '모니터', price: 200000, quantity: 2 }
];

조건
- map과 화살표 함수를 사용합니다.
- 콜백의 매개변수 자리에서 product, price, quantity를 객체 구조분해로 꺼냅니다.
- 각 주문을 '상품명: 결제금액원' 형태의 문자열로 바꿉니다.
- 화살표 함수의 중괄호와 return을 생략합니다.
- map이 반환한 새 배열을 orderLabels에 저장해 출력합니다.

예상 출력
[ '키보드: 100000원', '마우스: 30000원', '모니터: 400000원' ]
*/

// 문제 1 풀이


const orders = [
    { product: '키보드', price: 50000, quantity: 2 },
    { product: '마우스', price: 30000, quantity: 1 },
    { product: '모니터', price: 200000, quantity: 2 }
];

const orderLabels = orders.map( ({product,price,quantity}) => `${product}: ${price * quantity}`)
console.log(orderLabels)

