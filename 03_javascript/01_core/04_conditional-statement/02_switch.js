/** 
 * switch문
 * 하나의 변수에 대해 여러 경우를 처리한다.
 */

const fruit = '바나나';

switch (fruit) {
    case '사과' :
        console.log('선택한 과일은 사과이다.');
        break;
    case '바나나' :
        console.log('선택한 과일은 바나나이다.');
        break;
    case '오렌지' :
        console.log('선택한 과일은 오렌지이다.');
        break;
    default:        // 위 조건들에 해당하지 않을 때 실행
        console.log('알 수 없는 과일입니다');
}

// 하나의 변수에 대해서 여러가지 케이스를 처리할때.

/**
 * 
 * const fruit = 90;
 * 
 * switch (fruit) {
    case fruit <= 90 :   //  True가 되고 fruit와 True를 비교함 ->결과적으로 fals기 때문에 consloe구문이 출력되지 않음.
        console.log('선택한 과일은 사과이다.');
        break;
    case '바나나' :
        console.log('선택한 과일은 바나나이다.');
        break;
    case '오렌지' :
        console.log('선택한 과일은 오렌지이다.');
        break;
    default:        // 위 조건들에 해당하지 않을 때 실행
        console.log('알 수 없는 과일입니다');
}
 */