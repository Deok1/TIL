package scanner.ex;

import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("구구단의 단 수를 입력해주세요:");
        int num1 = scanner.nextInt();

        System.out.println(num1 + "단의 구구단:");
        for (int i = 1; i <= 9; i++) {
            System.out.println(num1 + " * " + i + " = " + (num1 * i));
        }
    }
}
