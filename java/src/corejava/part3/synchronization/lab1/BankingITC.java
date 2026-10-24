package corejava.part3.synchronization.lab1;

public class BankingITC {


    static void main(String[] args) {

        Account account = new Account(0);
        Drawer drawer = new Drawer(account);
        Depositor depositor = new Depositor(account);
        drawer.start();
        depositor.start();

    }
}

class Account {
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }


    public synchronized void withdraw(int amount) throws InterruptedException {

        while (this.balance < amount) {
            System.out.println("Insufficient balance. Please wait for deposit.\n");
            wait();
        }
        this.balance = this.balance - amount;
        System.out.println("Amount withdrawn: " + amount);
        System.out.println("Remaining balance: " + this.balance + "\n");

    }

    public synchronized void deposit(int amount) {

        System.out.println("Amount is being deposited...");
        this.balance = this.balance + amount;
        System.out.println("Amount deposited: " + amount + "\n");
//        wait(1000);
        notifyAll();
    }

}

class Drawer extends Thread {

    private Account account;

    public Drawer(Account account) {
        this.account = account;
    }

    public void run() {
        int[] withdrawals = {100, 1500, 600, 2000};

        for (int amount : withdrawals) {
            try {
                account.withdraw(amount);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}

class Depositor extends Thread {
    private Account account;

    public Depositor(Account account) {
        this.account = account;
    }

    public void run() {
        int[] deposits = {200, 1100, 600, 2000, 5000};
        for (int amount : deposits) {
            account.deposit(amount);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }

    }
}