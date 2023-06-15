package leetCodeLink;

import java.util.List;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_2_2 {
    public static void main(String[] args) throws Exception {
        int[] nums = {2,4,3};
        int[] nums2 = {5,6,4};

        ListNode head = new ListNode(nums);
        ListNode head2 = new ListNode(nums2);
        Solution solution = new Solution();
        ListNode listNode = solution.addTwoNumbers(head, head2);
        System.out.println(listNode);

    }

    static class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode head = new ListNode();
            int temp = 0;
            ListNode pre = head;
            while (l1 != null || l2 != null) {
                int a = l1 == null ? 0 : l1.val;
                int b = l2 == null ? 0 : l2.val;
                int val = a + b + temp;
                temp = val / 10;
                ListNode node = new ListNode();
                node.val = val % 10;
                head.next = node;
                head = node;
                if (l2 != null) {
                    l2 = l2.next;
                }
                if (l1 != null) {
                    l1 = l1.next;
                }


            }
            if (temp == 1) {
                head.next = new ListNode(temp);
            }

            return pre.next;
        }
    }
}
