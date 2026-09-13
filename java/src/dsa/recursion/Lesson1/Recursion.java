package dsa.recursion.Lesson1;

public class Recursion {

    static  void message (int i) {
        if(i == 5) return;
        System.out.println("calling : " + i);
        message(i+1);
    }

    static  void recursion (int n) {
        // base case which will terminate the recursive calls
        if(n == 6) {
           return;
        }

        // do the impletion if its there
        System.out.println("Call Number : " + n);

        // now call again the same function
        recursion(n + 1);
    }

    static void main(String[] args) {
        recursion(1);
    }
}
