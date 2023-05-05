package BankAccountPackage;

import Interface.Account;
import Enum.AccountType;

public class BankAccount implements Account {
    double balance;
    String accountNumber;
    String ownerName;
    AccountType accountType;


    public BankAccount(String ownerName, String accountNumber, AccountType accountType) {
        this.ownerName = ownerName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = 0.0;
    }


    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public double deposit(double amount) {
        return balance += amount;
    }

    @Override
    public double withdraw(double amount) {
        if (balance > amount) {

        }
        return balance -= amount;
    }

    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String getOwnerName() {
        return "Owner Name:" + ownerName;
    }

    @Override
    public String toString() {
        return ("Account Number: " + accountNumber + "\nOwner Name: " + ownerName + "\nBalance: " + balance + "\nAccount type: " + accountType);
    }
}
