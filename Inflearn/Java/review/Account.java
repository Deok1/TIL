package oop1.ex;

public class Account {
    int balance;
    int amount;

    int deposit(int amount) {
        balance += amount;
        System.out.println(amount + "원을 입금합니다. 현재 잔액:" + balance);
        return balance;
    }

    int withdraw(int amount) {
        if (balance > amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금합니다. 현재 잔액:" + balance);
        } else {
            System.out.println(amount + "원을 출금하려 했으나. 잔액이 부족합니다. 현재 잔액:" + balance);
        }
        return balance;
    }

    void checkBalanec() {
        System.out.println("현재 잔액:" + balance);
    }
}
