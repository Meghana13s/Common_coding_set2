import com.banking.system.Bank;
import com.banking.system.CheckingAcc;
import com.banking.system.SavingsAcc;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Bank bank = new Bank();

        SavingsAcc savingsAccount = new SavingsAcc("SA001", 5.0);
        CheckingAcc checkingAccount = new CheckingAcc("CA001", 200.0);

        bank.addAccount(savingsAccount);
        bank.addAccount(checkingAccount);

        savingsAccount.deposit(1000);
        savingsAccount.applyInterest();
//        savingsAccount.withdraw(200);
//
//        checkingAccount.deposit(500);
//        checkingAccount.withdraw(600); // within overdraft limit
//        checkingAccount.withdraw(700); // exceeds overdraft limit

        bank.showsAllAcc();
    }
}