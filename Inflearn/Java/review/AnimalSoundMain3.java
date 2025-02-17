package poly.ex2;

public class AnimalSoundMain3 {

    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Caw()};

        for (Animal animal : animals) {
            soundAnimal(animal);
        }

    }

    //동물이 추가 되어도 변하지 않는 코드
    public static void soundAnimal(Animal animal) {
        System.out.println("동물소리 테스트 시작");
        animal.sound();
        System.out.println("동물소리 테스트 종료");
    }
}
