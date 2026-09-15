/**생성자 함수 */

// 함수를 사용해서 같은 형식의 개체를 여러개 생성 가능

const student1 = {
    name: '판다',
    age: 5,
    getInfo: function() {
        return `${this.name}는 ${this.age}세 입니다.`;
    }
};

const student2 = {
    name: '코알라',
    age: 3,
    getInfo: function() {
        return `${this.name}는 ${this.age}세 입니다.`;
    }
};

console.log(student1.getInfo());
console.log(student2.getInfo());

function Student(name, age) {     //함수 이름 대문자 -> 생성자 함수(관례)
    this.name = name;           // 오른쪽 name: 매개변수로 받은 인수.함수가 호출될때 받은 인수  // 왼쪽 name: student3.name  this->새롭게 만들어질 객체의 이름
    this.age = age;
    this.getInfo = function() {
        return `${this.name}는 ${this.age}세 입니다.`;       // 만들어진 this 라는 객체를 리턴
    };
}

const student3 = new Student('원숭이', 40);   // 객체를 생성할 때 앞에 new 붙여야지만 생성됨.
const student4 = new Student('고릴라', 30);
console.log(student3);
console.log(student4);
console.log(student3.getInfo());
console.log(student4.getInfo());


//1.this라는 빈 객체를 만든다.
// 2. 그 객체의 프로퍼티들을 할당한다.
// 3. 완성된 this객체가 호출의 결과가 되어 student3번에 할당 된다

console.log('같은 객체인가:', student3 === student4);   // new라는 객체를 사용할때 서로 다른 공간에 생성->서로 다른 객체이기에 서로 영향주지 않음
student3.age = 31;
console.log(student3.getInfo());
console.log(student4.getInfo());



