package corejava.part2.methods.lab1;

public class PrintTable {
    public  static void printTable() {
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(i  * 5);
        }
    }

    static void main(String[] args) {
        printTable();
    }
}
