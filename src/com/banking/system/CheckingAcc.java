package com.banking.system;

public class CheckingAcc extends Account{

    private double overDraftLimit;

    public CheckingAcc(String accountNo, double overDraftLimit) {
        super(accountNo);
        this.overDraftLimit = overDraftLimit;
    }

    @Override
    public void withdraw(int amount) {
        if(amount < getBalance()+overDraftLimit) {
            System.out.println("success withdraw with balance"+getBalance());
        } else {
            super.withdraw(amount);
        }
    }
}
