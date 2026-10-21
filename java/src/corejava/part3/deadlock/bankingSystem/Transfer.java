package corejava.part3.deadlock.bankingSystem;

class Transfer extends Thread {
    int sourceId;
    int destinationId;
    int amount;

    public Transfer(int sourceId, int destinationId, int amount) {
        this.sourceId = sourceId;
        this.destinationId = destinationId;
        this.amount = amount;
    }

    public void run() {
        super.run();
    }
}
