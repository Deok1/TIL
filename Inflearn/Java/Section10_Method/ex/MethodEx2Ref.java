package method.ex;

public class MethodEx2Ref {
    public static void main(String[] args) {
        printMassage("Hello Java", 3);
        printMassage("Hello World", 5);
        }

    public static void printMassage(String str, int time) {
        for (int i = 0; i < time; i++) {
            System.out.println(str);
        }
    }
}
