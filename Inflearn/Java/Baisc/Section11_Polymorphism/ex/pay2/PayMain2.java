package poly.ex.pay2;

import java.util.Scanner;

public class PayMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PayService payService = new PayService();

        while (true) {
            System.out.print("결제 수단을 입력하세요:");
            String payOtion = scanner.nextLine();
            if (payOtion.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                return;
            }

            System.out.print("결제 금액을 입력하세요:");
            int payAmount = scanner.nextInt();
            scanner.nextLine();

            payService.processPay(payOtion, payAmount);

        }
    }
}
