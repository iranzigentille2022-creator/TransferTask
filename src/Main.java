
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
            throws InterruptedException {

        // 1. Create the lists
        List<BankAccount> accounts = new ArrayList<>();
        List<Thread> threads = new ArrayList<>();

        // 2. Add the five bank accounts
        accounts.add(new BankAccount("101", "Keza", 1000));
        accounts.add(new BankAccount("102", "Lena", 1000));
        accounts.add(new BankAccount("103", "Gentille", 1000));
        accounts.add(new BankAccount("104", "Alvin", 1000));
        accounts.add(new BankAccount("105", "Fene", 1000));

        // 3. Create and start the threads
        for (int i = 0; i < 5; i++) {
            BankAccount account = accounts.get(i);

            Runnable withdraw = () -> account.withdraw(500);

            Thread thread =
                    new Thread(withdraw, "Thread-" + (i + 1));

            thread.start();
            threads.add(thread);
        }

        // 4. Wait for all threads
        for (Thread thread : threads) {
            thread.join();
        }

        // 5. Print the remaining balances
        System.out.println("REMAINING BALANCES:");

        for (BankAccount account : accounts) {
            System.out.println(
                    account.getName() + ": $" +
                            account.getBalance());
        }
    }
}
