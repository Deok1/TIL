package poly.ex2;

public class AnimalPolyMain3 {
    public static void main(String[] args) {
        Animal[] animalArr = {new Dog(), new Cat(), new Caw()};     //Ctrl+Alt+N

        //변하지 않는 부분
        for (Animal animal : animalArr) {
            soundAnimal(animal);
        }
    }

    private static void soundAnimal(Animal animal) {                //Ctrl+Alt+M
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
