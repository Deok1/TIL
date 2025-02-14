package method.ex;

public class MethodEx3 {
    public static void main(String[] args) {
        int balance = 1000;

        deposit(balance, 1000);
        withdraw(balance, 2000);

        System.out.println("최종 잔액: " + balance + "원");

    }

    public static void deposit(int balance,int amount) {
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
    }

    public static void withdraw(int balance, int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
    }
}
