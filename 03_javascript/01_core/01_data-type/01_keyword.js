/**
 * 변수
 * 변수(variable)는 데이터를 저장할 떄 쓰이는 '이름이 붙은 저장소'이다.
 * 
 *변수를 생성할 때 우리는 변수를 선언한다고 표현한다.
 *변수 선언 방법
 *키워드 변수명;
 *
 * 키워드: 변수를 어떤 규칙으로 만들지 정함
 * 변수명: 값을 다시 사용할 때 부를 변수 이름
 */

 // var: ESS까지 사용했던 유일한 키워드(지금은 잘 사용하지 않음)
 // 단점을 보완하기 위해 ES6에서 새로운 키워드인 let, const를 도입했다.
 var number; // 변수 선언
 number = 5; // 값 할당
 console.log(number);

//  선언과 동시에 할당(초기화)
//  let : 값을 변경할 수 있는 변수 선언(코드 사용중에 값을 바꿀 필요가 있을때 사용)
//  ctrl+` 터미널 열기
 let greeting = "HEllo, Node.js";
 console.log(greeting);

 greeting = "welcome!";
 console.log(greeting)

 // const: 재할당 금지
 // 반드시 선언과 동시에 초기화 해야 한다.(const를 주로 사용하다가 필요할때 let 사용 추천!)
 // const num; -불가능
 const num = 1;
//  num = 2; 재할당 불가능
 console.log(num)

// 변수명 규칙
/**
 *  -변수 이름에는 문자, 숫자, _, $ 등을 사용할 수 있다.
 *  -변수 이름은 숫자로 시작할 수 없다.
 *  -카멜케이스(camelCase)를 사용하는 것이 일반적이다.
 *  -변수명에 의미 붙이기 중요!
 */
// const 1age = 1; // 숫자로 시작하는 변수는 선언이 안됨.
const age1 = 1;
const a1ge = 1;
// const if = true; // 예약어 사용 금지
 const userName = "panda" // 두번쨰 단어부터 첫 글자를 대문자로 쓰는 camelCase가 일반적
 const userAge = 5;

 console.log(userName);
 console.log(userAge);

 
