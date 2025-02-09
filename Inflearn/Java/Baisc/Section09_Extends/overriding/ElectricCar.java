package extends1.overriding;

public class ElectricCar extends Car { //Car의 메서드를 전부 물려받음(상속)

    @Override
    public void move() {
        System.out.println("전기차를 빠르게 이동합니다.");
    }

    public void charge() {
        System.out.println("충전합니다.");
    }
}
