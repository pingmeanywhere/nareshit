package dsa.recursion.Lesson1;

public class TailRecursion {


    static  void tailRecursion (int n ) {
        if(n == 0) {
            return;
        }


        tailRecursion(n - 1);

        System.out.println(n);
    }


    static void main(String[] args) {
        tailRecursion(10);
    }
}
