package leetcode.october;

public class LinkedListPalindrome {

    static ListNode reverseList(ListNode head) {

        ListNode ans = null;

        while (head != null) {
            ans = new ListNode(head.val, ans);
            head = head.next;
        }

        return ans;
    }

    static boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        ListNode res = reverseList(temp);

        while (res != null) {
            if (res.val != head.val) {
                return false;
            }
            res = res.next;
            head = head.next;
        }

        return true;
    }

    static void main(String[] args) {
        ListNode head = new ListNode();

        int[] arr = {1, 2, 3, 4, 5};

        for (int i : arr) {
            ListNode temp = new ListNode(i, head);
            head = temp;
        }

        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        boolean result = isPalindrome(head);

        System.out.println(result);
    }
}
