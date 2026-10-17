package leetcode.october;

public class RemoveNthNodeFromList {

    static ListNode removeNthFromEnd(ListNode head, int n) {

        int size = 0;
        ListNode temp = head;

        while (temp != null) {
            size++;
            temp = temp.next;
        }

        int target = size - n;

        if (size == 1) return null;
        if (target == 0) {
            head = head.next;
            return head;
        }

        temp = head;
        while (temp != null) {
            target--;
            if (target == 0) {
                if (temp.next == null) {
                    temp.next = null;
                } else {
                    temp.next = temp.next.next;
                }
                break;
            }
            temp = temp.next;
        }

        return head;

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

        ListNode result = removeNthFromEnd(head, 3);

        System.out.println();
        while (result != null) {
            System.out.print(result.val + " -> ");
            result = result.next;
        }
    }
}
