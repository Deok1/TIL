package nested.inner;

public class InnerOuterMain {

    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter();
        // Inner에서 InnerOuter의 인스턴스를 생서하기 위해서는
        // InnerOuter의 참조값을 Inner가 알아야 한다.
        // 그래서 outer. 으로 참조값을 Inner에게 알려준다.
        InnerOuter.Inner inner = outer.new Inner();
        inner.print();

        System.out.println("innerClass = " + inner.getClass());
    }
}
