/** 
======================================================================
문제 6. 객체 — 상품 정보 수정하기
======================================================================

다음 상품 객체를 만들고 정보를 조회·수정·추가·삭제하세요.

초기 정보
- name: '노트'
- price: 3000
- stock: 10
- category: '문구'

조건
1. product라는 const 변수에 객체 리터럴로 저장합니다.
2. key라는 변수에 'price'를 저장하고, 대괄호 표기법으로 가격을 읽습니다.
3. 재고를 현재 값에서 2개 줄입니다.
4. isAvailable 프로퍼티를 추가하고 재고가 0보다 큰지 비교한 값을 저장합니다.
5. category 프로퍼티를 delete로 삭제합니다.
6. 아래 순서대로 결과를 출력합니다.
- 객체를 통째로 다른 객체로 재할당하지 않습니다.

예상 출력
가격: 3000
남은 재고: 8
판매 가능: true
삭제 후 카테고리: undefined

*/

// 문제 6 풀이

const product = {
    name: '노트',
    price: 3000,
    stock: 10,
    category: '문구'
}

const key = 'price'
console.log(product[key])
product.stock -= 2;
product.isAvailable = (product.stock > 0);
delete product.category;

console.log(`가격: ${product.price}`)
console.log(`남은 재고: ${product.stock}`)
console.log(`판매 가능: ${product.isAvailable}`)
console.log(`삭제 후 카테고리: ${product.category}`)




