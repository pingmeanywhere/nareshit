package leetcode.september;

public class CountDigitOccurrences {

    static int countDigitOccurrences(int[] nums, int digit) {

        int count = 0;

        for(int i : nums) {
            while (i != 0) {
                if(i % 10 == digit) {
                    count++;
                }
                i = i / 10;
            }
        }


        return count;

    }

    static void main(String[] args) {
        System.out.println(countDigitOccurrences(new int [] {12,54,32,22}, 0));
    }
}
