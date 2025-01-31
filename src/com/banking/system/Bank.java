package com.banking.system;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    List<Account> accounts = new ArrayList<>();

//    public Bank() {
//        accounts = new ArrayList<>();
//    }


    public void addAccount(Account acc) {
        accounts.add(acc);
        System.out.println("acc added success"+acc);
    }

    public Account getAccountByAccNo(double accNo) {
        for(Account acc : accounts) {
            if(acc.getAccountNo().equals(accNo)) {
                return acc;
            }
        }
        System.out.println("didnt found any acc");
        return null;
    }

    public List<Account> showsAllAcc() {
        return accounts;
    }
}
