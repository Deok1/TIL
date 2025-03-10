package generic.ex1;

public class IntegerBox {   // 숫자를 넣어서 보관하고 꺼낼 수 있는 박스라고 생각하면 됨

    private Integer value;

    public void set(Integer value) {
        this.value = value;
    }

    public Integer get() {
        return value;
    }
}
