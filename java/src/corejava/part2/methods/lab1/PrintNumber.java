package corejava.part2.methods.lab1;

public class PrintNumber {
    public  static  void printNumbers () {
        for ( int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }
    static void main(String[] args) {
        printNumbers();
    }
}
