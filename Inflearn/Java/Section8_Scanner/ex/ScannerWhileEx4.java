package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalPrice = 0;

        while (true) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int num = input.nextInt();

            if (num == 1) {
                input.nextLine();

                System.out.print("상품명을 입력하세요: ");
                String product = input.nextLine();

                System.out.print("상품의 가격을 입력하세요: ");
                int price = input.nextInt();

                System.out.print("구매 수량을 입력하세요: ");
                int quantity = input.nextInt();

                totalPrice += price * quantity;
                System.out.println("상품명: " + product + " 가격: " + price + " 수량: " + quantity);
            } else if (num == 2) {
                System.out.println("총 비용: " + totalPrice);
                totalPrice = 0;
            } else if (num == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("올바른 숫자를 입력해주세요.");
            }

        }
    }
}
