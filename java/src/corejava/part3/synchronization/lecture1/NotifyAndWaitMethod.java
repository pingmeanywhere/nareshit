package corejava.part3.synchronization.lecture1;

public class NotifyAndWaitMethod {

    static void main(String[] args) {

        Bank bank = new Bank(0);

        Withdrawer withdrawer = new Withdrawer(bank);
        Depositer depositer = new Depositer(bank);

        withdrawer.start();
        depositer.start();

        try {
            depositer.join();
            withdrawer.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Main Thread: All transactions completed successfully!");

    }
}

class Depositer extends Thread {
    Bank bank;

    public Depositer(Bank bank) {
        this.bank = bank;
    }

    public void run() {
        int[] deposits = {500, 600, 3500, 1100};
        for (int i : deposits) {
            try {
                bank.deposit(i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Withdrawer extends Thread {
    Bank bank;

    public Withdrawer(Bank bank) {
        this.bank = bank;
    }

    public void run() {
        int[] withdraws = {100, 300, 1500, 900};
        for (int i : withdraws) {
            try {
                bank.withdraw(i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


// Bank Account
class Bank {
    private int balance;

    public Bank(int balance) {
        this.balance = balance;
    }

    public synchronized void withdraw(int amount) throws InterruptedException {
        while (balance < amount) {
            System.out.println("Insufficient funds (" + balance + ") for withdrawal of "
                    + amount + ". Waiting for deposit...\n");
            wait();
        }
        this.balance = this.balance - amount;
        System.out.println("Withdrawal successful of amount : " + amount);
        System.out.println("Remaining Balance : " + balance);
        System.out.println();
    }

    public synchronized void deposit(int amount) throws InterruptedException {
        this.balance = this.balance + amount;
        System.out.println("Deposit successful of amount : " + amount);
        System.out.println("Current Balance : " + balance);
        System.out.println();
        notify();
    }
}


