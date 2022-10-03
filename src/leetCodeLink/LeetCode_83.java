package leetCodeLink;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_83 {
    public static void main(String[] args) throws Exception {
        int[] nums = {1, 1, 2, 3, 3, 4, 5, 5, 5, 5, 56};
        ListNode head = new ListNode(nums);
        ListNode node = Solution.deleteDuplicates(head);
        System.out.println(node);
    }

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    static class Solution {
        public static ListNode deleteDuplicates(ListNode head) {
            if (head == null) {
                return null;
            }
            ListNode pre = head;
            ListNode next = pre.next;

            while (next != null) {
                while (next != null && next.val == pre.val) {
                    pre.next = next.next;
                    next = pre.next;
                }
                if (pre != null && pre.next != null) {
                    pre = pre.next;
                    next = pre.next;
                } else break;
            }
            return head;

        }
    }
}
