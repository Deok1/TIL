package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {

    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("야옹이", 100);

        AnimalMethod.<Dog>checkup(dog); // 타입 추론 : <Dog>생략가능
        AnimalMethod.checkup(cat);

        Dog targetDog = new Dog("멍멍이2", 200);
        Dog bigger = AnimalMethod.getBigger(dog, targetDog);    // Dog라고 타입 추론이 되어 있어서 cat넣으면 컴파일 오류
        System.out.println("bigger = " + bigger);
    }
}
