/*
======================================================================
문제 3. Rest와 Spread로 팀 명단 처리하기
======================================================================

두 팀의 명단을 합쳐 새 배열을 만들고 함수의 인수로 전달하세요.

입력
const frontTeam = ['유관순', '홍길동'];
const backTeam = ['장보고', '신사임당'];

조건
- Spread를 사용하여 두 팀과 '이순신'을 합친 새 배열 allMembers를 만듭니다.
- 원본 frontTeam과 backTeam은 변경하지 않습니다.
- printTeam(leader, ...members) 함수를 작성합니다.
- leader에는 첫 번째 인수 하나를 받습니다.
- Rest 파라미터 members에는 나머지 인수를 배열로 받습니다.
- 함수는 팀장과 팀원 배열을 각각 출력합니다.
- printTeam을 호출할 때 allMembers를 Spread로 펼쳐 전달합니다.
- 같은 점 세 개가 함수 정의에서는 값을 모으고, 함수 호출에서는 값을 펼친다는 점을 구분합니다.

예상 출력
전체 명단: [ '유관순', '홍길동', '장보고', '신사임당', '이순신']
팀장: 유관순
팀원: [ '홍길동', '장보고', '신사임당', '이순신' ]
원본 앞 팀: [ '유관순', '홍길동' ]
원본 뒤 팀: [ '장보고', '신사임당' ]
*/

const frontTeam = ['유관순', '홍길동'];
const backTeam = ['장보고', '신사임당'];

const allMembers = [...frontTeam,...backTeam, '이순신'];
function printTeam(leader, ...members) {
 console.log("팀장:", leader);       
 console.log("팀원:", members);        //``사용하시 ${}안의 내용을 문자열로 변환하기 때문에 []출력이 안됨
}
console.log("전체 명단: ",allMembers);
printTeam(...allMembers);
console.log("원본 앞 팀:", frontTeam);
console.log("원본 뒤 팀:", backTeam);




