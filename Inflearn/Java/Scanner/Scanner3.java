package scanner;

import java.util.Scanner;

public class Scanner3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 정수를 입력하세요 : ");
        int intValue1 = scanner.nextInt();

        System.out.print("두 번째 정수를 입력하세요 : ");
        int intValue2 = scanner.nextInt();

        if (intValue1 > intValue2) {
            System.out.println("더 큰 수 : " + intValue1);
        } else if (intValue1 < intValue2) {
            System.out.println("더 큰 수 : " + intValue2);
        } else {
            System.out.println("두 수가 같다 : " + intValue1 + ", " + intValue2);
        }
    }
}
