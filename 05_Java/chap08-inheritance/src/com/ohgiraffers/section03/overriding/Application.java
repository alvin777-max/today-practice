package com.ohgiraffers.section03.overriding;

public class Application {
    public static void main(String[] args) {

        // 오버라이딩(상속 - 재정의) - 이름과 매개변수가 같아야함
        // 오버로드(같은이름의 메서드) - 이름은 같고 매개변수는 달라야함

        // 결국 상속 => 다형성을 위함
        VendingMachine vendingMachine = new VendingMachine();
        CoffeeVendingMachine coffeeVendingMachine = new CoffeeVendingMachine();

        System.out.println(vendingMachine.vend());
        System.out.println(coffeeVendingMachine.vend());
        coffeeVendingMachine.clean();
        coffeeVendingMachine.powerOn();

    }
}
