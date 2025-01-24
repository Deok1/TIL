package scanner;

import java.util.Scanner;

public class ScannerWhile1 {
    public static void main(String[] args) {
        Scanner scnner = new Scanner(System.in);


        while (true) {
            System.out.print("문자를 입력해주세요(exit : 종료) : ");
            String str = scnner.nextLine();
            if (str.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.println("입력한 문자열 : " + str);
        }
    }
}
