package generic.ex1;

public class StringBox {    // 문자열을 보관하고 꺼낼 수 있는 박스라고 생각

    private String value;

    public void set(String value) {
        this.value = value;
    }

    public String get() {
        return value;
    }
}
