package com.ohgiraffers.section01.polymorphism;

public class Application {
    public static void main(String[] args) {

        /*
         * [다형성]
         * 하나의 부모 타입으로 여러 자식 객체를 다룰 수 있다.
         *
         * 부모 타입 참조변수로 자식 객체를 참조할 수 있다.
         * 부모타입 변수 = new 자식클래스();
         *
         * [동적 바인딩]
         * 컴파일 시: 부모 타입의 멤버만 접근 가능
         * 실행(runtime) 시: 오버라이딩된 자식 메소드가 실행됨
         * 자식 고유 멤버 사용 시 다운캐스팅 필요
         * */

        ZooKeeper zooKeeper1 = new ZooKeeper();

//        Rabbit rabbit1 = new Rabbit();
//        zooKeeper1.feed(rabbit1);
        zooKeeper1.feed(new Rabbit());  // 위와 동일
        zooKeeper1.feed(new Tiger());

        // 다형성 적용 후
        // 업캐스팅 - 자식 객체의 참조값을 부모 타입 변수에 저장
        Animal a1 = new Rabbit();   // Rabit rabbit이 아니라 Animal rabbit으로 작성- 상속관계기에 가능. 실제 객체의 타입은 Rabbit이다.
        Animal a2 = new Tiger();

        // 참조변수 타입은 부모의 타입 but 참조된(실제 객체)는 각자의 타입
        /*
        * [동적 바인딩]
        * 컴파일 시점에는 부모의 메소드를 호출하는 것으로 보이지만,
        * 실행 시점(Runtime)에는 참조 변수가 실제로 가리키는 객체(Rabbit, Tiger)의
        * 오버라이딩 된 메소드가 실행되는 원리이다.
        * */
        a1.cry(); // ctrl + enter하면 Animal에 정의된 Cry메서드로 이동
        a2.cry();

//        a1.jump();    //  부모타입으로는 자식만의 고유 기능은 접근 불가
        // 다운캐스팅
        ((Rabbit)a1).jump(); // ->명시적 형변환
//        ((Rabbit)a2).jump(); // .ClassCastException - a2의 실제 객체는 Tiger이기 때문에 Rabbit으로 형변환 불가 - Rabbit과 Tiger은 부모자식관계가 아니기 때문

        /* 다운캐스팅 전에 instanceof 연산자로 가리키는 객체를 확인하는 것이 안전 */
        System.out.println(("a1은 Tiger 타입인가?" + (a1 instanceof Tiger)));    // false

        // 다운캐스팅 시에는 컴파일에러가 발생하지 않기에 if문으로 처리를 해줘야 코드 중단을 막을 수 있음
        if (a1 instanceof Rabbit) {
            ((Rabbit)a1).jump();
        }

        /* 다형성을 활용한 객체 배열*/
        // 원래라면 배열에는 같은 타입만 넣을 수 있음 but 다형성을 이용해서 상위 타입의 배열에 자식 타입의 객체를 넣을 수 있음
        Animal[] animals = new Animal[5];
        animals[0] = new Rabbit();
        animals[1] = new Tiger();
        animals[2] = new Rabbit();
        animals[3] = new Tiger();
        animals[4] = new Rabbit();

        for (Animal animal : animals) {
            animal.cry();   // 컴파일 시점에는 animal, Runtime 때 참조변수가 실제로 가리키는 객체 참조
        }

        for (Animal animal : animals) {
            if(animal instanceof Rabbit) {
                ((Rabbit)animal).jump();
            } else if (animal instanceof Tiger) {
                ((Tiger)animal).bite();
            }
        }

        ZooKeeper zooKeeper2 = new ZooKeeper();

        for (Animal animal : animals) {
            zooKeeper2.feed(animal);
        }

    }
}
