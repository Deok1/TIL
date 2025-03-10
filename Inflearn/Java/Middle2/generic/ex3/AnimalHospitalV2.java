package generic.ex3;

public class AnimalHospitalV2<T> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        // T의 타입을 메서드를 정의하는 시점에는 알 수 없다. Object의 기능만 사용 가능
        // getName(), getSize(), sound() 사용 불가
        //System.out.println("동물 이름: " + animal.getName()); //컴파일 오류
        //System.out.println("동물 크기: " + animal.getSize()); //컴파일 오류
        //animal.sound();   //컴파일 오류
        animal.toString();
        animal.equals(null);
    }

    public T getBigger(T target) {
        //return animal.getSize() > target.getSize() ? animal : target; // 컴파일 오류
        return null;
    }
}
