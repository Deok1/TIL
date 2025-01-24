package scanner;

import java.util.Scanner;

public class ScannerWhile3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;

        System.out.println("0을 입력하면 프로그램이 종료됩니다");
        while (true) {
            System.out.print("정수를 입력하세요 (0을 입력하면 종료) : ");
            int num1 = input.nextInt();

            if (num1 == 0) {
                break;
            }

            sum += num1;
        }
        System.out.println("입력한 모든 정수의 합 : " + sum);
        System.out.println("프로그램을 종료합니다");
    }
}
