package nested.test;

public class OuterClass1 {
    static class NestedClass {
        public void hello() {
            System.out.println("NestedClass.hello");
        }
    }

    public static void main(String[] args) {
        OuterClass1.NestedClass outer = new OuterClass1.NestedClass();
        outer.hello();
    }
}
