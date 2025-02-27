package nested.test;

public class OuterClass3 {
    public void myMethod() {
        class LocalClass {
            public void hello() {
                System.out.println("LocalClass.hello");
            }
        }
        LocalClass local = new LocalClass();
        local.hello();
    }

    public static void main(String[] args) {
        OuterClass3 outer = new OuterClass3();
        outer.myMethod();
    }
}
