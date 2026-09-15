// Date는 날짜와 시간을 표현하는 객체이며 new Date()로 생성한다

const now = new Date(); // 생성 당시의 시점을 나타내는 Date 객체 생성
console.log(now);
// 실행하는 순간의 시간을 출력

// toLocaleDateString('Ko-KR') : 한국에서 익숙한 표시 형식의 문자열로 반환 // 실행한 환경의 시간을 출력
console.log('한국어 표시:', now.toLocaleString('Ko-KR', {timeZone: 'Asia/Seoul'}));

const year = now.getFullYear();
const month = now.getMonth() + 1; // 반환하는 월 번호가 0부터 시작
const date = now.getDate();

// Date라는 객체의 다양한 메서드 이용 가능
console.log(`${year}년 ${month}월 ${date}일`);