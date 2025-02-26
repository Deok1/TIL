package nested.inner.ex2;

public class Car {
    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine();
        // 자기내부에 포함되어 있으므로 this 삭제
    }

    // chargeLevel에 직접 접근할 수 있으므로 getChargeLevel 메서드 삭제

    // model에 직접 접근할 수 있으므로 getModel 메서드 삭제

    public void start() {
        engine.start();
        System.out.println(model + "시작 완료");
    }

    private class Engine {  // 외부에서 참조하지 못하게 private으로 선언
        public void start() {
            System.out.println("충전 레벨 확인: " + chargeLevel);
            System.out.println(model + "의 엔진을 구동합니다.");
        }
    }
}
