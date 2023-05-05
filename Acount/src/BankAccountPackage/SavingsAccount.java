package BankAccountPackage;

import Enum.AccountType;

public class SavingsAccount extends BankAccount {
    double interestRate;
    public double calculateInterest(double time){
        return balance * (interestRate/100) * time ;
    }

    @Override
    public String toString() {
        return ("Account Number: " + accountNumber + "Owner Name: " + ownerName + "Balance: " + balance + "Account type: " + accountType + "Interest Rate: " + interestRate);
    }

    public SavingsAccount(String ownerName, String accountNumber, AccountType accountType, double interestRate) {
        super(ownerName, accountNumber, accountType);
        this.interestRate = interestRate;
    }
}

