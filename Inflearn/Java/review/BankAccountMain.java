package access;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        bankAccount.deposit(1000);
        bankAccount.deposit(1000);
        bankAccount.withdraw(1000);
        bankAccount.withdraw(1000);
        bankAccount.withdraw(-1000);

        System.out.println("balance = " + bankAccount.getBalance());
    }
}
