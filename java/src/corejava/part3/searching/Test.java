package corejava.part3.searching;

public class Test {

    static void main() {
        int[] arr = {1, 2, 3, 3, 2, 1};

        int index = -1;
        int diff = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    if (j - i < diff) {
                        index = i;
                        diff = Math.min(diff, (j - i));
                    }
                }
            }
        }



        System.out.println("ELEMENT : " + arr[index]);

//        int [] nums = new int [5];
//        System.out.println(nums[5]);
    }
}
