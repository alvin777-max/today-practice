const products = [
    { name: '노트', price: 3000, stock: 5 },
    { name: '펜', price: 1000, stock: 0 },
    { name: '파일', price: 2000, stock: 3 }
];

const products1 = products.filter(products => products.stock > 0);
const products2 = products1.sort((a,b) => a.price - b.price);
const products3 = products2.map(products2 => products2.name);

console.log(products3);

const totalPrice = products2.reduce((sum,product) => {return sum + product.price},0);
console.log(totalPrice);
const pen = products.find(product => product.name === '펜');
console.log(pen);
const lostProduct = products.every(a => a.stock > 0)
console.log(!lostProduct);
 const plusPrice = products.every(a => a.price > 0)
 console.log(plusPrice);
 const productCanSell = function products.find((a,lostProduct) {
    return {`${lostProduct(a).name}, ${lostProduct(a).product}`}
 });
