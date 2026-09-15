/**
 * function Book(title, price) {
    this.title = title;
    this.price = price;
}

Book.prototype.getTotal = function(quantity) {
    return this.price * quantity;
};

Book.prototype.getTitle = function() {
    return this.title;
};

function solution() {
    const book1 = new Book('JavaScript', 15000);
    const book2 = new Book('HTML', 20000);

    book1.price = 18000;

    const result = [];

    // result에 순서대로 결과를 넣으세요.
    
    return result;
}
*/

function Book(title, price) {
    this.title = title;
    this.price = price;
}

Book.prototype.getTotal = function(quantity) {
    return this.price * quantity;
};

Book.prototype.getTitle = function() {
    return this.title;
};

function solution() {
    const book1 = new Book('JavaScript', 15000);
    const book2 = new Book('HTML', 20000);

    book1.price = 18000;

    const result = [36000, 40000, true, false,true, true, true];

    // result에 순서대로 결과를 넣으세요.
    
    return result;
}
