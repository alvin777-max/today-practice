/*
======================================================================
문제 2. for...of로 문자열과 배열 순회하기
======================================================================

검색어의 글자와 검색 기록을 순서대로 출력하세요.

입력
const keyword = 'DOM';
const searchHistory = ['JavaScript', 'React', 'HTML'];

조건
- 일반 for문과 배열 고차함수를 사용하지 않습니다.
- 첫 번째 for...of에서는 keyword의 글자를 하나씩 출력합니다.
- 두 번째 for...of에서는 searchHistory의 값을 하나씩 출력합니다.
- 검색 기록 앞에는 1부터 시작하는 순번을 붙입니다.
- 순번은 별도의 count 변수를 선언하여 반복할 때마다 증가시킵니다.
- for...of의 반복 변수에는 인덱스가 아니라 현재 값이 들어온다는 점을 이용합니다.

예상 출력
글자: D
글자: O
글자: M
1. JavaScript
2. React
3. HTML
*/

// 문제 2 풀이

const keyword = 'DOM';
const searchHistory = ['JavaScript', 'React', 'HTML'];

for(word of keyword) {
    console.log(`글자: ${word}`);
}
let count = 1;
for(history of searchHistory) {
    
    console.log(`${count} : ${history}`);       // console.log(`${searchHistory.indexOf(history) + 1} : ${history}`); // count변수 대신 indexOf로 key위치(인덱스) 출력도 가능하긴함
    count +=1;
}