package extends1.ex3;

public class ElectricCar extends Car {   //Car의 메서드를 전부 물려받음(상속)
    public void charge() {
        System.out.println("충전합니다.");
    }
}
