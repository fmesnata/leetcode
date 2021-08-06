package fm.leetcode.problem_2;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode resultListNode = null;
        ListNode nextNode = null;
        do {
            int sum = 0;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            sum += carry;
            carry = sum > 9 ? sum / 10 : 0;
            ListNode newNode = new ListNode();
            newNode.val = sum % 10;

            if (nextNode == null) {
                resultListNode = newNode;
            } else {
                nextNode.next = newNode;
            }
            nextNode = newNode;
        } while (l1 != null || l2 != null || carry != 0);

        return resultListNode;
    }
}
