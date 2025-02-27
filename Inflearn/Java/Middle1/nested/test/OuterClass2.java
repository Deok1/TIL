package nested.test;

public class OuterClass2 {
    class InnerClass {
        public void hello() {
            System.out.println("InnerClass.hello");
        }
    }

    public static void main(String[] args) {
        OuterClass2 outer = new OuterClass2();
        OuterClass2.InnerClass inner = outer.new InnerClass();
        inner.hello();
    }
}
