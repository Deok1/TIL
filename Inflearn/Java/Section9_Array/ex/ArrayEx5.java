package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int num = scanner.nextInt();

        System.out.println(num + "개의 정수를 입력하세요: ");

        int[] numbers = new int[num];
        int sum = 0;
        double avg = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }
        avg = sum / num;
        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + avg);
    }
}
