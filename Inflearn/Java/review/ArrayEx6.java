package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int num1 = scanner.nextInt();

        int[] numbers = new int[num1];

        System.out.println(num1 + "개의 정수를 입력하세요:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int maxnum = numbers[0];
        int minnum = numbers[0];

        for (int number : numbers) {
            if (number > maxnum) {
                maxnum = number;
            }
            if (number < minnum) {
                minnum = number;
            }
        }
        System.out.println("가장 작은 정수:" + minnum);
        System.out.println("가장 큰 정수:" + maxnum);

    }
}
