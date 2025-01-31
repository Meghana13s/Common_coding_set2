package com.banking.system;

public class Account {
    private String accountNo;

    private double balance;

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account(String accountNo) {
        this.accountNo = accountNo;
        this.balance = 0;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNo='" + accountNo + '\'' +
                ", balance=" + balance +
                '}';
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("amount deposited success with balance" + balance);
        } else {
            System.out.println("deposit amount greater than 0");
        }
    }

    public void withdraw(int amount) {
            if(balance < amount) {
                System.out.println("can't withdraw since ur balance is low than withdraw amount");
            } else {
                balance -= amount;
                System.out.println("withdraw success with balance" + balance);
            }
    }

    public double getBalance() {
        return balance;
    }
}
