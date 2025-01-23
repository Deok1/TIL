package loop.ex;

public class WhileEx2 {
    /*
    public static void main(String[] args) {
        int num = 2;
        int count = 1;
        while (count <= 10) {
            System.out.println("num = " + num);
            num += 2;
            count++;
        }
    }
     */

    public static void main(String[] args) {
        int num = 2;
        for (int count = 1; count <= 10; count++) {
            System.out.println("num = " + num);
            num += 2;
        }
    }
}
