package corejava.part2.methods.lab1;

public class SumNumbers {
    public  static  void sumNumbers () {
        int sum = 0;
        for (int i = 1; i <10 ; i++) {
            sum  += i;
        }
        System.out.println("SUM : " + sum);
    }
    static void main(String[] args) {
        sumNumbers();
    }
}
