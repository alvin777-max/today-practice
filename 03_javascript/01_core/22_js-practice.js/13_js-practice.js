/**
function Person(name, age) {
    this.name = name;
    this.age = age;
}

Person.prototype.introduce = function() {
    return `${this.name}은 ${this.age}살입니다.`;
};

function solution() {
    const person1 = new Person('철수', 20);
    const person2 = new Person('영희', 25);

    // person1과 person2의 introduce() 결과를
    // 배열로 반환하세요.
}
*/

/**
 * solution();
*  ["철수은 20살입니다.", "영희은 25살입니다."]
*  조건
*  Person 함수는 수정하지 마세요.
*  prototype도 수정하지 마세요.
*  solution() 안에서만 코드를 작성하세요.
 */




function Person(name, age) { 
    this.name = name; 
    this.age = age; 
} 
 
Person.prototype.introduce = function() { 
    return `${this.name}은 ${this.age}살입니다.`; 
}; 
 
function solution() { 
    const person1 = new Person('철수', 20); 
    const person2 = new Person('영희', 25); 
 
    return [person1.introduce(), person2.introduce()];
}

console.log(solution());