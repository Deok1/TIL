package static1;

public class DecoMain2 {
    public static void main(String[] args) {
        String s = "hello java";
        String deco = DecoUtil1.deco(s);

        System.out.println("before = " + s);
        System.out.println("after = " + deco);
    }

    private static class DecoUtil1 {
        public static String deco(String s) {
            return "*" + s + "*";
        }
    }
}
