// for...of와 이터러블
// 이터러블은 값을 순서대로 하나씩 꺼낼 수 있는 값이다. 배열과 문자열이 대표적이다.

const fruits = ['🍎','🍌','🍓'];

for (let i = 0; i < fruits.length; i++) {
    console.log('일반 for문:', i, fruits[i]);   //인덱스를 이용해서 받아옴
}

// for...of 문
for (const fruit of fruits) {               // fruits의 요소 하나하나를 받아옴 // fruit은 다른 이름으로 변경해도 상관없음(임시변수) // 반복마다 새로운 변수가 만들어지는것임. 재할당 x
    console.log('food...of: ', fruit);
}

const message = '안녕';                 
//배열에만 사용하는것이 아님. 값을 순서대로 꺼낼 수 있도록 정해진 규칙을 제공하는 애들 ->이터러블. 배열이든 문자든 인덱스가 있음/순서가 있다는 규칙 이용 ->값을 하나씩 전달->더 전달할 값이 없으면 중단
for (const character of message) {
    console.log('글자',character);
}

// const student = {
//     name: '홍길동',
//     score: '80'
// };


// for (const value of student) {              //TypeError: student is not iterable ->객체는 이터러블이 아님. for...of가 사용할 순서 규칙이 존재하지 않음
//     console.log(value);
// }

/**
* 배열,문자열 -> 이터러블 ->for...of 가능
*  일반 객체 -> 이터러블 x-> for...of 불가능
*/