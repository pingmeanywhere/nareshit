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


    public synchronized void withdraw(int amount) {
        try {
            while (this.balance < amount) {
                System.out.println("Insufficient balance. Please wait for deposit.\n");
                wait();
            }
            this.balance = this.balance - amount;
            System.out.println("Amount withdrawn: " + amount);
            System.out.println("Remaining balance: " + this.balance + "\n");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            notifyAll();
        }
    }

    public synchronized void deposit(int amount) {
        try {
            System.out.println("Amount is being deposited...");
            this.balance = this.balance + amount;
            System.out.println("Amount deposited: " + amount + "\n");
            wait(1000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            notifyAll();
        }
    }

}

class Drawer extends Thread {

    private Account account;

    public Drawer(Account account) {
        this.account = account;
    }

    public void run() {
        int[] withdrawals = {100, 1500, 600, 2000};
        try {
            for (int amount : withdrawals) {
                account.withdraw(amount);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Depositor extends Thread {
    private Account account;

    public Depositor(Account account) {
        this.account = account;
    }

    public void run() {
        int[] deposits = {200, 1000, 600, 2000, 5000};
        try {
            for (int amount : deposits) {
                account.deposit(amount);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}