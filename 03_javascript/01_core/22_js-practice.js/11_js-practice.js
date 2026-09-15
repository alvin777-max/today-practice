function Book(title, price) {
    if (!new.target) {
        console.log("new를 빼먹었습니다.")
        return new Book(title, price);
    }
    this.title = title;
    this.price = price;
    this.getTotal = function(quantity) {        //getTotal이란 프로퍼티에 함수를 넣음
/**프로퍼티(property): 객체가 가지고 있는 이름(key)과 값(value)
메서드(method): 객체의 프로퍼티 중에서 값이 함수인 것 */
        if (quantity <= 0) {
            return 0;
        }
        return this.price * quantity;
    };
}

let book1 = Book('자바스크립트 인문', 15000);
const book2 = Book('객체와 함수', 20000);

book1TotalPrice = book1.getTotal(2);
const book2TotalPrice = book2.getTotal(2);

console.log(book1TotalPrice);
console.log(book2TotalPrice);

book1.price = 18000;

book1TotalPrice = book1.getTotal(2);
book2.getTotal(2);

console.log(book1TotalPrice);
console.log(book2TotalPrice);

console.log(book1.getTotal(0));


