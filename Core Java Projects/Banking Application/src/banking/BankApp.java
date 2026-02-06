package banking;

import java.util.Scanner;

public class BankApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter account number:");
        int accountNumber = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Enter account holder name:");
        String name = scanner.nextLine();

        System.out.println("Enter initial balance:");
        double balance = scanner.nextDouble();

        Account account = new Account(accountNumber, name, balance);

        int choice;

        do {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");

            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Enter amount to deposit:");
                double amount = scanner.nextDouble();
                account.deposit(amount);
            } else if (choice == 2) {
                System.out.println("Enter amount to withdraw:");
                double amount = scanner.nextDouble();
                account.withdraw(amount);
            } else if (choice == 3) {
                account.displayBalance();
            } else if (choice == 4) {
                System.out.println("Thank you for using banking application");
            } else {
                System.out.println("Invalid choice");
            }

        } while (choice != 4);

        scanner.close();
    }
}
