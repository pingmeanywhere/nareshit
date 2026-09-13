package dsa.recursion.Lesson1;

public class BinarySearch {

    static  int search (int [] nums, int s, int e, int target) {

        if(s > e) {
            return  -1;
        }

        int mid = (s + e) / 2;

        if(nums[mid] == target) {
            return mid;
        }

        if(nums[mid] < target) {
            s = mid + 1;
        }
        else {
            e = mid - 1;
        }

        return search(nums, s, e, target);

    }

    static void main(String[] args) {
        System.out.println(search(new int[] {1, 2, 3, 4, 4, 6, 7}, 0, 6, 3));
    }
}
