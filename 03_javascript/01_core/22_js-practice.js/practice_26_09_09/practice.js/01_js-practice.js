for (let i = 1; i <= 9; i++)
{
    for (let j = 1; j <=9; j++)
        console.log(`${i} * ${j} = ${i * j}`)
}

const a = true;
console.log(a && 0); // 0 ->무조건 true, false만 나오는것이 아님.
//  0이 falsy한 값이긴 하지만 출력결과에 나오는 0은 숫자 0을 그대로 반환한것이고, 만약 이 결과를 조건식에 넣는다면 false로 동작함.
