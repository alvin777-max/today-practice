class Student {
    // new Student(..)가 실행될 때 자동으로 호출되는 초기화 메서드
    constructor(name, score) {                  // 각 student 객체에 저장
        this.name = name;
        this.score = score;
    }
    // function 없이 객체이름() {} 형식으로 작성
    // 객체마다 함수를 새로 만들지 않고 Student.prototype에 한 번 만들어 공유한다
    getInfo() {                                                 // prototype에 저장
        return this.name + ': ' + this.score + '점';
    }
}

// constructor는 class에서 생성자 역할을 하는 정해진 이름
//consturctor{}는 콜백 함수인가?

const student1 = new Student('홍길동', 80);     // 새로 생성된 student 객체들은 Student.prototype이랑 연결되어 있음
const student2 = new Student('유관순', 90);

console.log(student1);
console.log(student2);
console.log(student1.getInfo());        // 자신한테 이 메서드가 있는지 찾아봄 -> 없으면 프로토타입에서 찾아봄 // 호출한 주체가 student1이기 때문에 this가 student1을 가리킴
console.log(student2.getInfo());

student1.score = 85;

console.log(student1.getInfo());      // 호출할때마다 this.score을 읽기 때문에 프로퍼티 값들이 바뀔때마다 출력값도 달라짐
console.log(student2.getInfo());    //getInfo()는 동일한 함수 === 로 비교하면 true


// class나 생성자 함수나 기능은 동일, 작성 방법의 차이
// class -> 객체의 기능, 함수가 한곳에 있음
// 모든 기능이 동일한 것은 아님
// 생성자 함수 : new 없이 호출하면 생성자 함수가 아니라 일반함수로 인식되서 문제를 일으킴
// class 함수: new 없이 호출 시 TypeError: Class constructor Student cannot be invoked without 'new' 발생
// class 함수, 생성자 함수 -> 객체를 만들기 위한 설계도

//리엑트는 class보다 함수형 component 많이 사용
