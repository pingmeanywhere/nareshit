package leetcode.october;

public class SumofSquareNumbers {

    static boolean judgeSquareSum(int c) {

        long left = 0;
        long right = (long) Math.sqrt(c);

        while (left <= right) {
            if ((left * left) + (right * right) == c) {
                return true;
            } else if ((left * left) + (right * right) <= c) {
                left++;
            } else {
                right--;
            }
        }

        return false;
    }

    static void main(String[] args) {
        System.out.println(judgeSquareSum(2));
    }
}
