// 프로토타입
const user = {
    id: 'user',
    activate: true,
    login: function() {
        console.log(`${this.id}님이 로그인 되었습니다.`);
    }
};
// user가 student의 프로토타입이다.
/**const student = {
 *  id: 'user',
 *  activate: true,
 * }
 * {
    passion: true
    }
};
*/
// create: 새로운 빈 객체를 만들고, 그 객체가 프로퍼티를 찾을 때 user도 살펴볼 수 있도록 연결한다 //최상위 object에 우리가 만드는 객체들이 있음.
// student의 프로토타입을 user로 설정 student의 부모:user user에 있는것을 상속받음
const student = Object.create(user);
student.passion = true;     //동적으로 프로퍼티 추가

console.log(student.activate);

console.log(student.passion);

// student가 프로토타입으로 연결한 객체 확인
console.log(Object.getPrototypeOf(student));    //student 객체가 프로토타입으로 연결된 user객체의 정보 출력


// student가 activate를 직접 가지고 있는가
console.log('자신의 activate:', Object.hasOwn(student, 'activate'));    //프로토타입으로는 가지고 있지만 student 객체 자기 자신이 activate를 가지고 있는것은 아님
console.log('자신의 passion:', Object.hasOwn(student, 'passion'));

console.log('activate' in student);

const greedyStudent = Object.create(student);
greedyStudent.greed = true;
greedyStudent.id = 'student01'

console.log(greedyStudent.activate);
console.log(greedyStudent.passion);
console.log(greedyStudent.missing);

console.log(greedyStudent.id);  // 자기 자신의 프로퍼티를 먼저 찾음 ->student01
console.log(user.id);           // user의 id에 영향을 미치지 않음-> 프로토타입은 수정,삭제 등 불가
// greedystudent -> student ->user

// 호출 주체인 점(.)앞의 객체의 this를 참조
greedyStudent.login();   //login 메서드의 this는 그 메서드를 호출한 주체의 것-> greedystudent의 id

delete greedyStudent.id;
console.log(greedyStudent.id);  //greedystudent의 id를 삭제해서 user 객체의 id를 가지고옴
greedyStudent.login(); //login 메서드의 호출 주체는 greedyStudent지만 id라는 프로퍼티가 내부에 존재하지 않기때문에 부모 객체인 user의 id를 참조해옴