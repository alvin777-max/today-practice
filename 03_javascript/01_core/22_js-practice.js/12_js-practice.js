function Book(title, price) {
    this.title = title;
    this.price = price;
}

Book.prototype.getTotal = function getTotal(quantity) {
    return this.price * quantity; 
}

const book1 = new Book('책1', 15000);
const book2 = new Book('책2', 20000);

console.log(book1.getTotal(2));
console.log(book2.getTotal(2));

console.log(book1.getTotal === book2.getTotal);
console.log(Object.hasOwn(book1,'getTotal'));
console.log(Object.hasOwn(Book.prototype, 'getTotal'));

book1.price = 18000;
console.log(book1.getTotal(2));
console.log(book2.getTotal(2));

console.log(book1.getTotal(0));
