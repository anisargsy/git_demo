package BankAccountPackage;

import Enum.AccountType;

import java.util.ArrayList;
import java.util.UUID;

public class Bank {
    ArrayList<BankAccount> bankAccounts = new ArrayList<BankAccount>();

    public BankAccount openAccount(String ownerName, AccountType accountType) {
        final String uuId = UUID.randomUUID().toString().replace("-", "");
        BankAccount obj = new BankAccount(ownerName, uuId, accountType);
        bankAccounts.add(obj);
        return obj;
    }

    public ArrayList<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    public void closeAccount(BankAccount account) {
        bankAccounts.remove(account);
    }

    public String getAccount(String accountNumber) {
        boolean isTrue = false;
        for (BankAccount num : bankAccounts) {
            if (num.accountNumber == accountNumber) {
                isTrue = true;
            }
            ;
        }
        if (isTrue) {
            return accountNumber;
        } else return null;

    }

    public int getNumberOfAccounts() {
        return bankAccounts.size();
    }

    public double getTotalBalance() {
        double totalBalance = 0.0;
        for (BankAccount account : bankAccounts) {
            totalBalance += account.getBalance();
        }
        return totalBalance;
    }


}
