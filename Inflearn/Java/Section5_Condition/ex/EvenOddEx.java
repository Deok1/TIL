package condition.ex;

public class EvenOddEx {
    public static void main(String[] args) {
        int x = 4;

        String EvenOdd = (x % 2 == 0) ? "짝수" : "홀수";
        System.out.println("x = " + x + ", " + EvenOdd);
    }
}
