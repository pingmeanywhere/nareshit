package leetcode.november;

public class MergeTwoSortedLists {

    static void printLL(ListNode l) {
        ListNode temp = l;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        while (list1 != null && list2 != null) {
            // list2 is small or equal to list1
            System.out.println("PRINT LIST1");
            printLL(list1);
            System.out.println("PRINT LIST2");
            printLL(list2);

            if (list2.val < list1.val) {
                ListNode temp = new ListNode(list2.val);
                temp.next = list1.next;
                list1 = temp;
                list2 = list2.next;
            } else {
                list1 = list2.next;
            }

        }


        return list1;
    }

    static void main(String[] args) {

        int[] input1 = {4, 2, 1};
        int[] input2 = {4, 3, 1};

        ListNode l1 = null;
        for (int i : input1) {
            l1 = new ListNode(i, l1);
        }
        ListNode l2 = null;
        for (int i : input2) {
            l2 = new ListNode(i, l2);
        }

        printLL(l1);
        printLL(l2);


        ListNode result = mergeTwoLists(l1, l2);


        System.out.println("Final Result : ");
        while (result != null) {
            System.out.print(result.val + " -> ");
            result = result.next;
        }

        System.out.println("null");

    }
}
