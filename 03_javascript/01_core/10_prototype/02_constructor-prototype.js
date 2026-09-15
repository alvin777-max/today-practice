/** const student1 = {
    name: '판다',
    age: 8
 };
 

const student2 = {
    name: '다람쥐',
    age: 5
    prototype: {k:v}      // -> 이 안에 들어있는 prototype의 값이 객체임->
}
*/
//생성자 함수를 선언하면 js가 prototype이라는 프로터피를 마련해줌
// Student 함수 ->(prototype 프로퍼티) Student.prototype 객체
// 객체들의 초기설정
function Student(name, age) {
    this.name = name;
    this.age = age;
}

// student1의 부모객체가 Student.prototype과 연결이 됨
const student1 = new Student('판다', 8);    //this -> Student.prototype
const student2 = new Student('다람쥐', 4); 

// 객체들이 공유할 프로퍼티, 메서드 저장
Student.prototype.activate = true;
Student.prototype.getInfo = function() {
    return `${this.name}는 ${this.age}세 입니다.`;
}

// new 키워드를 이용해서 만들면 생성자함수의 prototype 객체에 연결된다.
const student3 = new Student('홍길동', 20);
const student4 = new Student('장보고', 30);

console.log(Object.getPrototypeOf(student3) === Student.prototype);
console.log(Object.hasOwn(student3, 'getInfo')) // 공통 객체에 정의해놨기 때문에 false

console.log(student3.activate);

console.log(student3.getInfo());
console.log(student4.getInfo());

console.log(student3.getInfo === student4.getInfo); //true

student3.age = 35;
console.log(student3.getInfo());

// function Student(...) {} -> Student.prototype        // 여기에 함수를 넣으면 new로 새로 만들때마다 함수도 복사됨 -> 프로토타입에 만들면 그냥 참조로 하는거임.    
// const studnet1 = new Studnet(..);
// const sudent2 = new s
// 

// js 의 객체에는 내부 저장공간이 있음 [[Prototype]]이라는 숨김 프로퍼티가 존재. 어떤 프로토타입을 참조하는지 여기에 저장. 내부 구조

// child -> parent -> Object.prototype -> null