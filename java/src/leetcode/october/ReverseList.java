package leetcode.october;

public class ReverseList {

    static ListNode reverseList(ListNode head) {

        ListNode ans = null;

        while (head != null) {
            ans = new ListNode(head.val, ans);
            head = head.next;
        }

        return ans;
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

        ListNode result = reverseList(head);

        System.out.println();
        while (result != null) {
            System.out.print(result.val + " -> ");
            result = result.next;
        }


    }

}


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
