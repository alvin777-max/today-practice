function Dog(name, age) {
    this.name = name,
        this.age = age
    this.getInfo = function () {
        return `name: ${this.name}, age: ${this.age}`
    };
}

const dog1 = new Dog('뽀삐', 3);
const dog2 = new Dog('바둑이', 5);

console.log(dog1.getInfo());
console.log(dog2.getInfo());

dog1.age = 4;



console.log(dog1.getInfo());
console.log(dog2.getInfo());