/** 
======================================================================
문제 7. 함수 — 주문 금액 반환하기
======================================================================

단가와 수량을 받아 주문 금액을 반환하는 함수를 작성하세요.

조건
- 함수 선언문으로 getOrderTotal(price, quantity)을 정의합니다.
- price는 양의 정수, quantity는 정수로 들어온다고 가정합니다.
- quantity가 0 이하이면 0을 즉시 반환합니다.
- 나머지 경우에는 단가 × 수량을 반환합니다.
- 함수 안에서 console.log를 사용하지 않습니다.
- 호출한 쪽에서 반환값을 출력합니다.
- 외부 변수에 계산 결과를 저장하는 방식은 사용하지 않습니다.

호출 → 예상 반환값
getOrderTotal(3000, 2) → 6000
getOrderTotal(5000, 1) → 5000
getOrderTotal(3000, 0) → 0
getOrderTotal(3000, -2) → 0

추가 확인
getOrderTotal(3000, 2)의 반환값에 배송비 2500을 더해 출력하세요.
예상 출력: 배송비 포함: 8500
*/

// 문제 7 풀이

function getOrderTotal(price, quantity) {
    if (quantity <= 0) {
        return 0;
    }
    return price * quantity;
}

console.log(`getOrderTotal(3000, 2) -> ${getOrderTotal(3000, 2)}`)
console.log(`getOrderTotal(5000, 1) -> ${getOrderTotal(5000, 1)}`)
console.log(`getOrderTotal(3000, 0) -> ${getOrderTotal(3000, 0)}`)
console.log(`getOrderTotal(3000, -2) -> ${getOrderTotal(3000, -2)}`)

