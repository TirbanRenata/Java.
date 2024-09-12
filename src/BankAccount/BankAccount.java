package BankAccount;

public class BankAccount {
    private String accountHolderName;
    private final String accountNumber;
    private double balance;


    private static int accountNumberCounter = 1000;


    public BankAccount(String accountHolderName) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = generateAccountNumber();
        this.balance = 0.0; // New accounts start with a 0 balance
    }


    private String generateAccountNumber() {
        return "ACC" + (accountNumberCounter++);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Successfully withdrew: $" + amount);
            } else {
                System.out.println("Insufficient funds. Current balance: $" + balance);
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void getAccountDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: $" + balance);
    }

    public void transferFunds(BankAccount targetAccount, double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                targetAccount.deposit(amount);
                System.out.println("Successfully transferred $" + amount + " to account " + targetAccount.accountNumber);
            } else {
                System.out.println("Insufficient funds to transfer. Current balance: $" + balance);
            }
        } else {
            System.out.println("Transfer amount must be positive.");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }
}
