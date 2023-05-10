import BankAccountPackage.Bank;
import BankAccountPackage.BankAccount;
import Enum.AccountType;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      Bank bank = new Bank();
        final BankAccount acc1 = bank.openAccount("Ani", AccountType.SAVINGS);
        final BankAccount acc2 = bank.openAccount("Test", AccountType.CHECKING);
//        bank.closeAccount(acc1);
        bank.getAccount("Test3");
        bank.getAccount("Test3");
//      System.out.println(bank.getNumberOfAccounts());

        acc1.deposit(5.0);
        acc2.deposit(10);
        System.out.print(bank.getTotalBalance());
    }
}