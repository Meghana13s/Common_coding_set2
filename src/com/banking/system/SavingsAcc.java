package com.banking.system;

public class SavingsAcc extends Account {
    private double interestRate;

    public SavingsAcc(String accountNo, double interestRate) {
        super(accountNo);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interestAmount = getBalance() * (interestRate / 100);
        deposit(interestAmount);
        System.out.println("interest added" + interestAmount+"success balance is"+getBalance());
    }
}
