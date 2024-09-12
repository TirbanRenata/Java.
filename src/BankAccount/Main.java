package BankAccount;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<BankAccount> bankAccounts = new ArrayList<>();

        bankAccounts.add(new BankAccount("John Doe"));
        bankAccounts.add(new BankAccount("Ana Maria"));

        boolean exit = false;

        while (!exit) {
            System.out.println("\n===== Bank Account Management System =====");
            System.out.println("1. Add a new account");
            System.out.println("2. View account details");
            System.out.println("3. Deposit money");
            System.out.println("4. Withdraw money");
            System.out.println("5. Transfer funds");
            System.out.println("6. Delete an account");
            System.out.println("7. Exit");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    // Add a new account
                    System.out.print("Enter the account holder's name: ");
                    String name = scanner.nextLine();
                    BankAccount newAccount = new BankAccount(name);
                    bankAccounts.add(newAccount);
                    System.out.println("Account successfully created for " + name);
                    newAccount.getAccountDetails();
                    break;

                case 2:
                    // View account details
                    BankAccount account = selectAccount(scanner, bankAccounts);
                    if (account != null) {
                        account.getAccountDetails();
                    }
                    break;

                case 3:
                    // Deposit money
                    account = selectAccount(scanner, bankAccounts);
                    if (account != null) {
                        System.out.print("Enter the amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        account.deposit(depositAmount);
                    }
                    break;

                case 4:
                    // Withdraw money
                    account = selectAccount(scanner, bankAccounts);
                    if (account != null) {
                        System.out.print("Enter the amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        account.withdraw(withdrawAmount);
                    }
                    break;

                case 5:
                    // Transfer funds
                    System.out.println("Select the source account:");
                    BankAccount sourceAccount = selectAccount(scanner, bankAccounts);
                    if (sourceAccount != null) {
                        System.out.println("Select the target account:");
                        BankAccount targetAccount = selectAccount(scanner, bankAccounts);
                        if (targetAccount != null && !sourceAccount.equals(targetAccount)) {
                            System.out.print("Enter the amount to transfer: ");
                            double transferAmount = scanner.nextDouble();
                            sourceAccount.transferFunds(targetAccount, transferAmount);
                        } else {
                            System.out.println("Cannot transfer to the same account.");
                        }
                    }
                    break;

                case 6:
                    // Delete an account
                    System.out.println("Select an account to delete:");
                    account = selectAccount(scanner, bankAccounts);
                    if (account != null) {
                        bankAccounts.remove(account);
                        System.out.println("Account deleted successfully.");
                    }
                    break;

                case 7:
                    // Exit the system
                    exit = true;
                    System.out.println("Exiting the system. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }


    private static BankAccount selectAccount(Scanner scanner, ArrayList<BankAccount> bankAccounts) {
        if (bankAccounts.isEmpty()) {
            System.out.println("No accounts available.");
            return null;
        }

        System.out.println("Available accounts:");
        for (int i = 0; i < bankAccounts.size(); i++) {
            BankAccount account = bankAccounts.get(i);
            System.out.println((i + 1) + ". " + account.getAccountHolderName() + " (" + account.getAccountNumber() + ")");
        }

        System.out.print("Select an account by number: ");
        int accountIndex = scanner.nextInt() - 1;

        if (accountIndex >= 0 && accountIndex < bankAccounts.size()) {
            return bankAccounts.get(accountIndex);
        } else {
            System.out.println("Invalid account selection.");
            return null;
        }
    }
}
