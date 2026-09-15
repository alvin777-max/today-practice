/**화살표 함수 */
'use strict'; //엄격한 기준으로 검사하게 설정

const power = function(x) {
    return x * x;
}

console.log(power(3));

const arrowPower = (x) => {
    return x * x;
}
console.log('화살표 함수', arrowPower(3));

// 받을값 => {수행할작업}

// 매개변수가 딱 하나인 경우 소괄호 생략 가능
const square = x => x * x; // 매개변수가 하나일때만 () 생략 가능, 수행할작업이 하나고 바로 반환하는 작업은 {}, return 생략 가능
console.log(square(3));

// 매개변수 없거나 여러개인 경우, 소괄호 생략 불가
const greet = () => '안녕하세요';
const add = (a, b) => a + b;

console.log(greet());
console.log(add(1,2));

const calculateSquare = x => {
    return x * x;
}

// 중괄호 본문 : return을 꼭 명시해서 반환해야 함
const wrongSquare = x => {
    x * x;
}
console.log(wrongSquare(3));        //undefined - return이 안됨. { }를 쓰게 되면 return도 써야됨

// 객체를 반환할 시, 소괄호로 감싸서 
// 실행문이 아니고 반환할 객체를 만드는 표현식임을 표시해 주어야 한다.
const createUser = (id, name) => ({id:id, name: name});    
console.log(createUser(1, '판다'));

// 화살표 함수도 다른 함수에 콜백으로 전달 가능
function caculate(value, operation) {
    return operation(value);
}
console.log(caculate(3, power));        //함수 실행문 말고 함수 자체를 전달
console.log(caculate(3, number => number * number));
