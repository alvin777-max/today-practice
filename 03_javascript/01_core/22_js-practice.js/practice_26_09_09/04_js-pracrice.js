/*
======================================================================
문제 4. 프로토타입으로 메서드 공유하기
======================================================================

학생 객체마다 같은 메서드를 새로 만들지 않도록 프로토타입에 메서드를 작성하세요.

조건
- Student(name, score) 생성자 함수를 작성합니다.
- 생성자 안에서는 name과 score 프로퍼티만 저장합니다.
- Student.prototype에 getGrade 메서드를 추가합니다.
- getGrade는 score가 80 이상이면 '통과', 그렇지 않으면 '재학습'을 반환합니다.
- new를 사용하여 아래 학생 객체 두 개를 만듭니다.
  - '홍길동', 85
  - '유관순', 70
- 각 학생의 이름과 getGrade 반환값을 출력합니다.
- 두 학생의 getGrade가 같은 함수인지 ===로 비교해 출력합니다.
- student1이 getGrade를 자신의 프로퍼티로 가지고 있는지 Object.hasOwn으로 확인합니다.

예상 출력
홍길동: 통과
유관순: 재학습
같은 메서드: true
자신의 메서드: false
*/

// 문제 4 풀이

function Student(name, score) {
    this.name = name;
    this.name = score;
}

Student.prototype.getGrade = function(){
    if(this.score >= 80) {
        return `통과`;
    }
    else {
        return `재학습`;
    }
}

const student1 = new Student('홍길동', 85);
const student2 = new Student('유관순', 70);

console.log(`${student1.name} : ${student1.getGrade}`);