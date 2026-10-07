/** 
장바구니 총액 계산하기
장바구니에 담긴 상품들의 총 결제 금액을 reduce로 계산하세요.
*/

const cart = [
    { name: '노트북', price: 1200000, quantity: 1 },
    { name: '마우스', price: 30000, quantity: 2 },
    { name: '키보드', price: 80000, quantity: 1 },
    { name: '모니터', price: 300000, quantity: 2 }
];

const totalCart = cart.reduce((acc, cur) =>  acc+cur.price * cur.quantity,0)
console.log(totalCart);


/** 
 * 카테고리별 상품 개수 구하기
*/


const products = [
    { name: '노트북', category: '전자제품' },
    { name: '마우스', category: '전자제품' },
    { name: '셔츠', category: '의류' },
    { name: '바지', category: '의류' },
    { name: '키보드', category: '전자제품' },
    { name: '모자', category: '의류' },
    { name: '책', category: '도서' }
];

/**const manyProducts = products.reduce((acc, crr) => {
   if( products[acc].category == products[crr].category)
   {
    acc.push(products[crr].name);
   }
   return acc;
},[]) 

console.log(manyProducts);
*/

const cnt = products.reduce((acc,cur)=>{
    acc[cur.category] = acc[cur.category] ? acc[cur.category]+1:1;
    return acc;
},[]);

console.log(cnt);

/** reduce
최댓값 최솟값 : 초기값을 안적어주거나(배열의 첫번째 요소가 들어감) 명시적으로 아주 작은값이나 큰값 사용
배열로 받기-[]초기값
const unique = numbers.reduce((acc), ) */