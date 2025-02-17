package poly.ex3;

public class AnimalSoundMain1 {

    public static void main(String[] args) {

        //AbstractAnimal animal = new AbstractAnimal(); //추상클래스 생성 불가

        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        cat.sound();
        cat.move();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);

    }

    //동물이 추가 되어도 변하지 않는 코드
    public static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물소리 테스트 시작");
        animal.sound();
        System.out.println("동물소리 테스트 종료");
    }
}
