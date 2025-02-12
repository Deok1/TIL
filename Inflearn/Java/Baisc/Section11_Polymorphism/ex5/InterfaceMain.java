package poly.ex5;

public class InterfaceMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);

        moveAnimal(dog);
        moveAnimal(cat);
        moveAnimal(caw);
    }

    private static void soundAnimal(InterfaceAnimal interfaceAnimal) {
        System.out.println("동물 소리 테스트 시작");
        interfaceAnimal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    private static void moveAnimal(InterfaceAnimal interfaceAnimal) {
        System.out.println("동물 소리 테스트 시작");
        interfaceAnimal.move();
        System.out.println("동물 소리 테스트 종료");
    }
}
