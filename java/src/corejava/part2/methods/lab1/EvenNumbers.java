package corejava.part2.methods.lab1;

public class EvenNumbers {

    public  static  void printEvenNumbers () {
        for (int i = 1; i <= 10 ; i++) {
            if(i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    static void main(String[] args) {
        printEvenNumbers();
    }
}
