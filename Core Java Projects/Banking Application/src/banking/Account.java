package banking;

public class Account {

    private final int accountNumber;
    private final String accountHolderName;
    private double balance;

    public Account(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Money deposited successfully");
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Money withdrawn successfully");
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }

    // Display balance
    public void displayBalance() {
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
}
