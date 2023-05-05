package Interface;
/*Create a Java interface called "Account" that defines the following methods:

        getBalance(): a method that returns a double representing the current balance of the account.
        deposit(double amount): a method that takes in a double representing the amount to deposit and
        adds it to the balance.
        withdraw(double amount): a method that takes in a double representing the amount to withdraw and
        subtracts it from the
        balance (if the balance is sufficient).
        getAccountNumber(): a method that returns a String representing a unique identifier for the account.
        getOwnerName(): a method that returns a String representing the name of the account owner.
        toString(): a method that returns a String representation of the account, including the account number,
        owner name, and
        current balance.*/
public interface Account {
    public double getBalance();
    public  double deposit(double amount);
    public double withdraw(double amount);
    public  String getAccountNumber();
    public String getOwnerName();
    public String toString();

}
