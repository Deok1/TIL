package oop1.ex;

public class AcountMain {
    public static void main(String[] args) {
        Account account = new Account();

        account.deposit(1000);
        account.deposit(1000);
        account.deposit(1000);
        account.withdraw(1000);

        account.checkBalanec();
    }
}
