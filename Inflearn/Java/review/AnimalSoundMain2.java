package poly.ex2;

public class AnimalSoundMain2 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        Animal[] animals = {dog, caw, cat};

        //변하지 않는 부분
        for (Animal animal : animals) {
            System.out.println("동물소리 테스트 시작");
            animal.sound();
            System.out.println("동물소리 테스트 종료");
        }

    }
}
