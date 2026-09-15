/**
 * continue: 현재 반복문의 나머지 코드를 건너뛰고, 다음 반복으로 넘어간다
 * break: 현재 반복문을 완전히 종료한다
 */

for (let i = 1; i <=10; i++){
    if(i % 2 === 0){    // i가 2이면 true ->
        continue;   // 이번 반복만 패스
    }
    console.log(i); // continue문 때문에 출력되지 않고 바로 다음 반복으로 넘어감 
}

for (let i = 1; i <=10; i++){
    if(i % 2 === 0){    // i가 2이면 true ->
        break;   //반복문 종료
    }
    console.log(i); // break문 때문에 반복문 바로 종료
}

// 중첩 반복문

for(let i =1; i <= 3; i++){
    for (let j = 1; j <= 3; j++) {
        if (j === 2) {
            continue;       // 가장 가까운 반복문 하나에만 영향을 준다(break문도 동일)
        }
        console.log(`i: ${i}, j : ${j}`);
    }
}

for(let i=1; i<=9; i++){
    for (let j=1; j <=9; j++){
        console.log(`${i} * ${j} = ${i*j}`);
    }
}