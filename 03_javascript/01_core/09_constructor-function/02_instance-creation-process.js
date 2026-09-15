'use strict';   // 엄격 모드

function Student(name, age) {  
    console.log(`this가 있는가:`, this !== undefined);    // this라는 객체가 만들어짐
    console.log(`name이 있는가:`, `name` in this);       //name이라는 프로퍼티는 없는 상태
    this.name = name;           
    this.age = age;
    this.getInfo = function() {
        return `${this.name}는 ${this.age}세 입니다.`;  
    };
    console.log(`초기화한 값:`, this.name, this.age);
}

const student = new Student('호랑이', 50);  //new 라는 키워드를 썼기 때문에 return이 없어도 값을 받아 볼 수 있음 //new를 빼면 일반함수처럼 호출됨 -> this = 'undefined', 'undefined'에서는 key를 확인할 수 없음->TypeError
console.log(`객체를 반환받았는가:`, typeof student === 'object');

function Dog(name, age) {
    // new.target: new Dog로 호출하면 Dog를 가리키고 일반 호출로 하면 undefined이다.
    if (!new.target) {              //new Dog를 쓰게 되면 target->dog를 가리키게 됨 //그냥 DOG만 써서 호출한다면 new.target(false)->!떄문에 true로 바뀌게 됨->방어코드
        console.log(`new 없이 호출했네요~ new를 붙여서 다시 실행합니다.`)
        return new Dog(name, age);
    }
    this.name = name;
    this.age = age;
}

const dog = Dog('바둑이', 3);
console.log(dog);

