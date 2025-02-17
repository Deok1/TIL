package poly.ex6;

import poly.ex5.InterfaceAnimal;

public class SoundFlayMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        Chicken chicken = new Chicken();

        soundAnimal(dog);
        moveAnimal(dog);

        soundAnimal(cat);
        moveAnimal(cat);

        soundAnimal(caw);
        moveAnimal(caw);

        soundAnimal(chicken);
        moveAnimal(chicken);
        flyAnimal(chicken);
    }

    //동물이 추가 되어도 변하지 않는 코드
    public static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    //동물이 추가 되어도 변하지 않는 코드
    public static void moveAnimal(AbstractAnimal animal) {
        System.out.println("동물 이동 테스트 시작");
        animal.move();
        System.out.println("동물 이동 테스트 종료");
    }

    public static void flyAnimal(Fly fly) {
        System.out.println("동물 날기 테스트 시작");
        fly.fly();
        System.out.println("동물 날기 테스트 종료");
    }
}
