/** sort, reduce */

const numbers = [3, 1, 9, 10, 5];


/** const sorted = numbers.sort();  // [1,10,3,5,9] 문자열 비교를 하기 때문에 10이 앞에 있음 
console.log(sorted);

console.log(numbers);       // [1,10,3,5,9] 원본 배열을 정렬시킴

console.log(sorted === numbers);    // true
*/

const sorted = numbers.sort((a,b) => a - b); 

/** 
 * 반환값 음수 : a를 b보다 앞에 놓는다
 * 반환값 양수 : a를 b보다 뒤에 놓는다
 * 0 : 이 비교 기준에서 같은 순위로 취급한다.
 */
console.log(numbers);                                                                                   /*********** */

// reduce
const amounts = [1000, 2000, 3000];

let sum = 0;

for (let i = 0; i < amounts.length; i++) {
    sum + sum + amounts[i];
}

// 누적하기 - reduce 사용
//콜백 함수의 return 값이 다음 반복의 sum이 됨
// 마지막 반복에서 나온 return 값이 reduce() 자체의 최종반환값이 되고 그게 total에 저장됨
const total = amounts.reduce((sum, current) => {    
    return sum + current;
}, 0);
console.log(total);
// amounts.reduce(콜백함수, 초기값) sum + current가 sum으로 넘어가고 현재 요소가 current로 넘어감. 0은 초기값
// 1번째 요소가 돌때: current에 배열의 첫번째 요소, sum에는 0(,0 ->초기값). 2번째: current에 배열의 2번째 요소, sum에는 return 구문의 값. 3번째: current:배열의 3번째 요소, sum:return 구문의 값->최종적으로 ruduce()에 리턴값 반환
console.log('빈 배열 합계: ', [].reduce((sum, current) => sum + current, 0));

//0,1000
//1000, 2000
//3000, 3000 마지막 반환:6000;
   