package corejava.part3.arrays2d.lecture1;

public class ArrayLiterals2D {

    static void main(String[] args) {
        int[][] arr = {{21, 12, 23}, {11, 19}, {14, 15, 26, 27}};


        for (int[] ints : arr) {
            for (int i : ints) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
