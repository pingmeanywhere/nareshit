package leetcode.august;

import java.util.Arrays;

public class ClimbingStairs {

    public static int solve(int n, int [] count) {

        if (n == 1 || n == 2) {
            return n;
        }

        if(count[n] != -1) {
            return count[n];
        }

        count[n] = solve(n - 1, count) + solve(n - 2, count);

        return count[n];
    }

    public static int climbStairs(int n) {
        int[] count = new int[n + 1];
        Arrays.fill(count, -1);

        return solve(n, count);
    }


    static void main(String[] args) {
        System.out.println(climbStairs(45));
    }
}
