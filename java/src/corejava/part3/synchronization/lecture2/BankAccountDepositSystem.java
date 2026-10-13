package corejava.part3.synchronization.lecture2;

public class BankAccountDepositSystem {

    static void main(String[] args) throws InterruptedException {
        BankAccount ba = new BankAccount(0);
        CustomerOne one = new CustomerOne(ba);
        CustomerTwo two = new CustomerTwo(ba);
        one.setName("First Customer : ");
        two.setName("Second Customer : ");
        one.start();
        two.start();

        System.out.println("Previous Balance : " + ba.balance);

        one.join();
        two.join();
        System.out.println("Current Balance : " + ba.balance);


    }

}

class BankAccount {
    int balance;

    public BankAccount(int balance) {
        this.balance = 1000;
    }

    public synchronized void deposit(int amount) {
        this.balance = this.balance + amount;
    }
}

class CustomerOne extends Thread {
    BankAccount ba;

    public CustomerOne(BankAccount ba) {
        this.ba = ba;
    }

    public void run() {
        System.out.println(this.getName() + " deposited : " + 500);
        ba.deposit(500);
    }
}

class CustomerTwo extends Thread {
    BankAccount ba;

    public CustomerTwo(BankAccount ba) {
        this.ba = ba;
    }

    public void run() {
        System.out.println(this.getName() + " deposited : " + 700);
        ba.deposit(700);
    }
}
