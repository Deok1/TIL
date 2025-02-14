package method.ex;

public class MethodEx2 {
    public static void main(String[] args) {

        message("Hello, world!", 3);
        message("Hello", 5);
        message("world!", 7);

    }

    public static void message(String message, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(message);
        }
    }
}
