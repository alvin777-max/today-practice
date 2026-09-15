/**
 * [Spread Syntax]
 * 함수의 '인수' 자리나, 배열/객체 리터럴 안에서 사용하여
 * 배열의 요소들을 개별 값의 목록으로 펼쳐준다.
 * 
 * [Rest Parameter]
 * 함수의 '매개변수'자리에 사용하여, 정해지지 않은 개수의 인수들을 
 * 하나의 '배열'로 모아서 받는다.
 */




const scores = [80, 95, 70];

// Math.max(80, 95, 70) 처럼 숫자를 각각 받아야 한다.
console.log(Math.max(scores));

// Spread(...) : 배열을 인수로 펼친다.
console.log(Math.max(...scores)); //배열이 아니라 펼친형태 (80, 95, 70)형태로 됨

// push:원본에 추가
const frontEnd = ['HTML', 'CSS'];

const languages = [...frontEnd, 'JavaScript']; // ...(spread)문법을 사용하지 않으면 배열 그자체를 넣음 [[], '']형식으로
console.log(languages);


// 모든 요소를 새 대괄호 안에 펼치므로 모양은 같지만 서로 다른 배열이 만드어짐
const languagesCopy = [...languages]; 
console.log(languages === languagesCopy);        // false -> langues랑 languagesCopy가 같은것은 아님. 저장주소가 다름. 값만 같음

const sameLanguages = languages;
console.log(sameLanguages === languages);    //true-> 같음

const original = [
    {name: '홍길동'}
];
const copied = [...original];
console.log(copied);

//내부에 객체가 있다면 그 객체까지 새로 만드는 것은 아닌 '얕은 복사'이다.
console.log(original === copied);   // false
//바깥 [] 배열은 새로 생성된 것이지만 안의 객체는 같음 -> 객체는 주소값을 가지고 있음

console.log(original[0] === copied[0]); ///true -> 객체는 그대로 복사가 되었음: 주소값을 복사하는(참조해오는) 형태 : 떄문에 둘은 같다

// name = '안녕'->주소값을 가지지 않음. 그냥 값 자체를 변수에서 저장
// name = {name: '안녕'} ->주소값을 저장. 주소를 가지고 있는 애들을 이름을 붙여주는것이 변수
// 변수는 주소값을 가지고 있고, 복사를 했을때 주소값 자체를 복사함
//얕은 복사 -> 주소값을 복사하겠다.
//깊은 복사 -> 값을 복사하겠다. 주소값이 달라진 똑같은 값을 카피

// 객체를 펼쳐 새 객체 만들기
const student = {
    name: '홍길동',
    score: 80
};

const updatedStudent = {        // 스프레드 문법을 사용해서 사용하고 싶은 부분만 사용하고 값 변경 가능
    ...student,
    score: 90
}
console.log(student);
console.log(updatedStudent);

// Rest 파라미터 : 나머지 인수를 배열로 모으기
function sum(...numbers) {      //...Rest 파라미터 사용으로전달받은 숫자들이 배열로 만들어짐
    let total = 0;
    
    console.log('받은 인수의 배열', numbers)        // 배열이기 때문에 for of 사용해서 하나씩 전달
    for (const number of numbers) {
        total += number;        // total = total + number
    }

    return total;
}
console.log(sum(10,20));
console.log(sum(10, 20, 30, 40))

const prices = [1000, 2000, 3000];

// 함수의 매개변수 자리에는 Rest 파라미터
function printTotal(label, ...values) {         // Rest 파라미터-다시 모아주기 //Rest 파라미터는 가장 마지막에 사용 - 몇개를 받을지 모르기 때문에
    let total = 0;

    for(const value of values) {
        total += value;
    }
    console.log(label, total);
}
//호출 쪽에서 Spread 문법
printTotal('합계:', ...prices); // ('합계', 1000, 2000, 3000) //Spread 문법-펼치기

// 함수의 인수의 위치>spread
//함수의 매개변수 -> rest
