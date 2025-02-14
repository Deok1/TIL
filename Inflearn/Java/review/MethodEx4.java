package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int balance=0;

        while (true) {
            System.out.println("-----------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("-----------------------------------");
            System.out.print("선택:");
            int number = scanner.nextInt();
            int amount;

            switch (number) {
                case 1:
                    System.out.print("입금액을 입력하세요:");
                    amount = scanner.nextInt();
                    balance = deposit(balance, amount);
                    break;
                case 2:
                    System.out.print("출금액을 입력하세요:");
                    amount = scanner.nextInt();
                    balance = withdraw(balance, amount);
                    break;
                case 3:
                    checkAmount(balance);
                    break;
                case 4:
                    exit();
                    return;
                default:
                    wrougNum();
                    break;
            }


        }
    }

    public static int deposit(int balance, int amount) {
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
        return balance;
    }

    public static int withdraw(int balance, int amount) {
        if (balance > amount) {
            balance -= amount;
            System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println(amount+"원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }

    public static void checkAmount(int balance) {
        System.out.println("현재 잔액:" + balance + "원");
    }

    public static void exit() {
        System.out.println("시스템을 종료합니다.");
    }

    public static void wrougNum() {
        System.out.println("잘못된 숫자입니다. 다시 입력해주세요.");
    }


}
