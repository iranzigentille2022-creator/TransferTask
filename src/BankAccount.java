
public class BankAccount {

    private String accountHolder;
    private int balance;

    public BankAccount(String accountHolder, int balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("You don't have enough money");
        }
    }
}
