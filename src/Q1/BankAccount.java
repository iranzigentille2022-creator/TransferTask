package Q1;

public class BankAccount {

    private String name;
    private String account;
    private double balance;

    // Constructor
    public BankAccount(String account, String name, double balance) {
        this.account = account;
        this.name = name;
        this.balance = balance;
    }

    // Withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawal successful!");
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposit successful!");
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Get balance
    public double getBalance() {
        return balance;
    }

    // Get name
    public String getName() {
        return name;
    }

    // Get account number
    public String getAccount() {
        return account;
    }
}



