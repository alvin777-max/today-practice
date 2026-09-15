/** String 표준 빌트인 객체
 * 문자열은 변경할 수 없는 값이므로 메서드를 실행해도 원본은 바뀌지 않고 새로운 값을 반환한다.
 */

// 1. trim - 문자열 앞뒤 공백 제거
const rawKeyword = '      JavaScript      ';
console.log(rawKeyword);
const trimmedKeyword = rawKeyword.trim();           //양 끝 공백 제거. 원본은 유지
console.log(trimmedKeyword);    

// 영문 대소문자 정리(toLowerCase(), toUpperCase())
const Keyword = trimmedKeyword.toLowerCase();
console.log(Keyword);
console.log(Keyword.toUpperCase());

// 3. 문자열 검색
//  indexOf() : 검색어가 시작하는 인덱스 반환, 찾지 못하면 -1을 반환한다.
const title = 'JavaScript 배열 수업';
const searchTitle = title.toLowerCase();
console.log(searchTitle.indexOf(Keyword)); //(Keyword)에 찾고자하는 문자 넣으면 됨
console.log(searchTitle.indexOf('python'));
// includes() : 검색어가 들어있는지를 true 또는 false로 반환
console.log(searchTitle.includes('script'));    // 일부만 일치해도 true 반환
console.log(searchTitle.includes('python'));

// 4. slice() - 필요한 부분 가져오기
const fileName = 'my-profile.jpg';
// slice(시작인덱스, 끝인덱스)는 시작 인덱스부터 끝 인덱스 바로 앞까지 잘라 반환
console.log(fileName.slice(0, 10));
// lastIndexof('.') : 문자열에서 마지막 마침표(.)의 인덱스를 찾는다.
const dotIndex = fileName.lastIndexOf('.');
console.log(dotIndex);
const extension = fileName.slice(dotIndex);
console.log(extension);

// 5. split - 문자열을 배열로 나누기
const tags = '#자바스크립트#개발자#프론트엔드';
const tagParts = tags.split('#');
console.log(tagParts);

// 6. 배열 메러드로 빈 값 제외
const tagList = tagParts.filter(tag => tag !== '');
console.log(tagList);

// 메서드 체이닝 방식
const tagList1 = tags
    .split('#')
    .filter(tag => tag !=='');
    