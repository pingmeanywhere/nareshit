package leetcode.august;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int rem = 0;
        ListNode result = null;

        while (l1 != null && l2 != null) {

            int sum = l1.val + l2.val + rem;
            if (sum > 9) {
                sum = sum % 10;
                rem = 1;
            } else {
                rem = 0;
            }
            ListNode newNode = new ListNode(sum, result);
            result = newNode;

            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            int sum = l1.val + rem;
            if (sum > 9) {
                sum = sum % 10;
                rem = 1;
            } else {
                rem = 0;
            }
            ListNode newNode = new ListNode(sum, result);
            result = newNode;
            l1 = l1.next;
        }

        while (l2 != null) {
            int sum = l2.val + rem;
            if (sum > 9) {
                sum = sum % 10;
                rem = 1;
            } else {
                rem = 0;
            }
            ListNode newNode = new ListNode(sum, result);
            result = newNode;
            l2 = l2.next;
        }

        if (rem != 0) {
            ListNode newNode = new ListNode(rem, result);
            result = newNode;
        }

        ListNode ans = null;

        while (result != null) {
            ListNode newNode = new ListNode(result.val, ans);
            ans = newNode;
            result = result.next;
        }

        return ans;

    }

    static void main(String[] args) {
        AddTwoNumbers num = new AddTwoNumbers();
        ListNode result = num.addTwoNumbers(new ListNode(1), new ListNode(2));
        System.out.println(result.val);
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
