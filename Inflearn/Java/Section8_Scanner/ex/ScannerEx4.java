package scanner.ex;

import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mul = 0;

        System.out.print("구구단의 단 수를 입력해주세요 : ");
        int intValue = scanner.nextInt();

        for (int i = 1; i < 10; i++) {
            mul = intValue * i;
            System.out.println(intValue + " * " + i + " = " + mul);
        }
    }
}
