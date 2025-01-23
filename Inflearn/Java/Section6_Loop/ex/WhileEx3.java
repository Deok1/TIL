package loop.ex;

public class WhileEx3 {
    /*
    public static void main(String[] args) {
        int max = 100;
        int sum = 0;
        int i = 0;
        while (i <= max) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
     */

    public static void main(String[] args) {
        int max = 100;
        int sum = 0;
        for (int i = 0; i <= max; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
