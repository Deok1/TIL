package generic.ex1;

public class GenericBox<T> {    //<> : '다이아몬드'라고 칭함
    // T는 타입 매개변수라고 칭함
    // 필요 시 타입이 변함
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}
