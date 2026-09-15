const dog = {
    name: '뽀삐'
}

// 이미 존재하는 프로퍼터에 값을 할당하면 프로퍼티 값 갱신
dog.name = '감자';
// dog['name'] = '감자';
console.log(dog);  //const일때 객체 자체를 바꾸는것은 안되지만 새로운 프로퍼티 추가 등은 가능.

//존재하지 않는 프로퍼티에 값을 할당한다면 프로퍼티가 동적으로 생성된다.
dog.age = 5;
console.log(dog);

// 삭제: delete 연산자 사용하여 프로퍼티를 삭제
delete dog.age;
console.log(dog);

// const 객체의 프로퍼티 내부 값을 변경, 추가, 삭제 하는것은 가능하지만
// 객체 자체를 재할당 하는것은 불가능하다.

// dog = { name: '초코' };   // TypeError: Assignment to constant variable.

// 존재 확인 : in 연산자
// 해당 객체가 특정 프로퍼티를 가지고 있는지 boolean 값으로 알려줌
console.log('name' in dog);
console.log('weight' in dog);

// 객체 순회 (for...in) :  객체의 프로퍼티 키를 하나씩 꺼내는 반복문
for(const key in dog) {
    console.log(`키: ${key}`);
    console.log(`값: ${dog[key]}`);
}



