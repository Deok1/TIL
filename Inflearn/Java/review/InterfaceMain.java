package poly.ex5;


public class InterfaceMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        soundAnimal(dog);
        moveAnimal(dog);

        soundAnimal(cat);
        moveAnimal(cat);

        soundAnimal(caw);
        moveAnimal(caw);
    }

    //동물이 추가 되어도 변하지 않는 코드
    public static void soundAnimal(InterfaceAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    //동물이 추가 되어도 변하지 않는 코드
    public static void moveAnimal(InterfaceAnimal animal) {
        System.out.println("동물 이동 테스트 시작");
        animal.move();
        System.out.println("동물 이동 테스트 종료");
    }
}
