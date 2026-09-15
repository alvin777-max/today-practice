/*
======================================================================
문제 3. 상품 객체를 만드는 생성자 함수
======================================================================

같은 구조의 상품 객체를 만들 수 있는 생성자 함수를 작성하세요.

조건
- Product(name, price, stock) 생성자 함수를 작성합니다.
- 전달받은 값을 name, price, stock 프로퍼티에 저장합니다.
- 생성자 함수 안에 getInfo 메서드를 작성합니다.
- getInfo는 '상품명: 가격원, 재고 stock개' 형태의 문자열을 반환합니다.
- new를 사용하여 아래 상품 객체 두 개를 만듭니다.
  - '키보드', 50000, 3
  - '마우스', 30000, 5
- 두 객체의 getInfo 반환값을 출력합니다.
- 첫 번째 상품의 stock을 2로 변경한 뒤 두 상품 정보를 다시 출력합니다.

예상 출력
키보드: 50000원, 재고 3개
마우스: 30000원, 재고 5개
키보드: 50000원, 재고 2개
마우스: 30000원, 재고 5개
*/

// 문제 3 풀이


function Product(name, price, stock) {
    this.name = name;
    this.price = price;
    this.stock = stock;
    this.getInfo = function() {
        return `${this.name}: ${this.price}원, 재고: ${this.stock}`
    }
}

const product1 = new Product('키보드', 5000, 3);
const product2 = new Product('마우스', 3000, 5);

console.log(product1.getInfo());
console.log(product2.getInfo());

product1.stock = 2;

console.log(product1.getInfo());
console.log(product2.getInfo());
