package leetCodeLink;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import com.sun.security.auth.UnixNumericUserPrincipal;

import java.util.List;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_2 {
    public static void main(String[] args) throws Exception {
        int[] nums = {9,9,9,9,9};
        int[] nums2 = {9,9,9};

        ListNode head = new ListNode(nums);
        ListNode head2 = new ListNode(nums2);
        ListNode listNode = new Solution().addTwoNumbers(head, head2);
        System.out.println(listNode);


    }

    //两数相加 模拟 保留一个变量保存进位 最后判断是否加入进位
    static class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode head = new ListNode();
            ListNode pre = head;
            int temp = 0;
            while (l1 != null && l2 != null) {
                int val = l1.val + l2.val + temp;
                if (val >= 10) {
                    ListNode node = new ListNode();
                    temp = 1;
                    node.val = val - 10;
                    head.next = node;
                    head = node;
                } else {
                    ListNode node = new ListNode();
                    temp = 0;
                    node.val = val;
                    head.next = node;
                    head = node;
                }
                l1 = l1.next;
                l2 = l2.next;
            }
// 判断未循环完
            while (l1 != null) {
                int val = l1.val + temp;
                if (val >= 10) {
                    ListNode node = new ListNode();
                    temp = 1;
                    node.val = val - 10;
                    head.next = node;
                    head = node;
                } else {
                    ListNode node = new ListNode();
                    temp = 0;
                    node.val = val;
                    head.next = node;
                    head = node;
                }
                l1 = l1.next;
            }

            while (l2 != null) {
                int val = l2.val + temp;
                if (val >= 10) {
                    ListNode node = new ListNode();
                    temp = 1;
                    node.val = val - 10;
                    head.next = node;
                    head = node;
                } else {
                    ListNode node = new ListNode();
                    temp = 0;
                    node.val = val;
                    head.next = node;
                    head = node;
                }
                l2 = l2.next;
            }
//            判断最后一个进位
            if (temp!=0) {
                ListNode node = new ListNode();
                node.val = temp;
                head.next = node;
            }

            return pre.next;
        }


    }
}
