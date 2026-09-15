const students = [
    {name: '홍길동', score: 90}, 
    {name: '권판다', score: 80}, 
    {name: '유관순', score: 95}
];    //중괄호 배열 리터럴방식

console.log(students[0].name);

for(let i = 0; i < students.length; i++) {
    console.log(students[i].name);
}

// forEach 사용 - 배열 요소 하나씩 전달받기
students.forEach(student => {
    console.log(student.name);
});  //forEach->고차함수 (함수)->콜백함수

// student => {console.log(student.name)} forEach는 students의 요소 하나씩을 student매개변수에 전달됨   {name:",score:"}에서 name값만 꺼내서 사용

/** const printName = student => {console.log(student.name);}; 
 * students.forEach(printName);    -> printName(students[0]); [2] [3]
 */ 
  
// forEach()는 콜백을 호출할 때 현재 요소와 현재 인덱스를 전달해준다.(1.student, 2.index 고정)
students.forEach((student, index) => {
    console.log((index + 1)+ '번째 이름: ' + student.name);
});
// forEach는 콜백함수의 반환값을 모아주지 않는다. forEach의 반환값은 undefined이다.  
// 학생들의 이름을 '가져만' 오는것임. 그 이름들을 모아서 새로운 배열을 생성하지 않음
// student.name을 실행해서 '철수' '영희 '민수' 라는 값이 각각 나오지만, 이 값들을 배열로 모아주는것은 아님 ->forEach 자체가 반환하는 값은 undefined
const ignoredNames = students.forEach(student => student.name); 
console.log(ignoredNames);          // undefined

// map : 각 요소를 콜백의 반환값으로 바꾼 결과를 새 배열로 만들어 준다.
// 콜백 함수의 반환값을 모아서 새로운 배열을 만들어줌
const studentNames = students.map(student => student.name);
console.log(studentNames);

// 원본 배열에 영향을 주지는 않는다
console.log(students[0]);

// 점수에 5점을 더하여 배열로 반환받기
const adjustedScores = students.map(student => {
    return student.score + 5;
})

console.log(adjustedScores);

