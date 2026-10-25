package leetcode.october;

public class RotateList {

    static ListNode reverseList(ListNode head) {

        ListNode ans = null;

        while (head != null) {
            ans = new ListNode(head.val, ans);
            head = head.next;
        }

        return ans;
    }

    static ListNode rotateRight(ListNode head, int k) {

        if (head == null) return head;
        ListNode left = null;
        ListNode right = null;

        int size = 0;
        ListNode temp = head;

        while (temp != null) {
            size++;
            temp = temp.next;
        }

        if (k >= size) {
            k = k % size;
        }

        temp = head;

        int leftSize = size - k;
        while (leftSize > 0) {
            left = new ListNode(temp.val, left);
            temp = temp.next;
            leftSize--;
        }


        while (temp != null) {
            right = new ListNode(temp.val, right);
            temp = temp.next;
        }

        left = reverseList(left);
        right = reverseList(right);

        ListNode result = null;
        while (size > 0) {
            if (right != null) {
                result = new ListNode(right.val, result);
                right = right.next;
            } else if (left != null) {
                result = new ListNode(left.val, result);
                left = left.next;
            }
            size--;
        }

        return reverseList(result);

    }

    static void main(String[] args) {

        ListNode head = null;
        int k = 2;

        int[] arr = {2, 1, 0};

        for (int i : arr) {
            head = new ListNode(i, head);
        }

        System.out.println("BEFORE ROTATE");
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println();

        ListNode result = rotateRight(head, k);

        System.out.println("AFTER ROTATE");
        while (result != null) {
            System.out.print(result.val + " -> ");
            result = result.next;
        }
    }
}
