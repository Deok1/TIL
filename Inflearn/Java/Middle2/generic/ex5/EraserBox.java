package generic.ex5;

public class EraserBox<T> {

    public boolean instanceCheck(Object param) {
        //return paraminstanceof T; //param이 T 타입이 맞니? -> 컴파일 오류
        return false;
    }

    public T create() {
        //return new T(); //컴파일 오류
        return false;
    }
}
