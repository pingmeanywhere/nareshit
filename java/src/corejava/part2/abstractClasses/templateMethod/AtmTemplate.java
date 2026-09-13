package corejava.part2.abstractClasses.templateMethod;

public class AtmTemplate {

    static void main(String[] args) {
        ATM op1 = new Withdraw();
        op1.process();
    }
}

abstract class ATM {

    final public void process() {
        insertCard();
        enterPin();
        doTransaction();
        printReceipt();
    }

    public void insertCard() {
        System.out.println("Card is inserted..!!");
    }

    public void enterPin() {
        System.out.println("Enter pin success full");
    }

    public abstract void doTransaction();

    public void printReceipt() {
        System.out.println("Receipt is printed");
    }

}

class Withdraw extends ATM {
    @Override
    public void doTransaction() {
        System.out.println("Withdraw successfully");
    }
}

class Deposit extends ATM {
    @Override
    public void doTransaction() {
        System.out.println("Deposit successfully");
    }
}

class ShowBalance extends ATM {
    @Override
    public void doTransaction() {
        System.out.println("Checked balance successfully");
    }
}