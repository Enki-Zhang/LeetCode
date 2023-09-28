package leetcode;

import leetCodeLink.ListNode;

import java.util.List;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_234 {
    public static void main(String[] args) throws Exception {
        int[] ints = {1,2,1};
        ListNode node = new ListNode(ints);
        Solution solution = new Solution();
        boolean palindrome = solution.isPalindrome(node);
        System.out.println(palindrome);

    }

    /**
     * 回文链表 单链表不能回头 将链表翻转 翻转后还是原先数组 需要先进行复制 将两个数组比较 再进行比较
     */
    static class Solution {
        public boolean isPalindrome(ListNode head) {
            ListNode curr = head;
            ListNode newList = new ListNode();
            ListNode newCurr = newList;
//            复制当前数组
            while (head!=null){
                newList.next = new ListNode(head.val);
                newList = newList.next;
                head = head.next;
            }
            ListNode node = filpLink(curr);
            ListNode test = newCurr.next;
            while (node!=null) {
                if (node.val!=test.val){
                    return false;
                }
                node = node.next;
                test = test.next;
            }
            return true;
        }

        /**
         * 翻转链表 要新建链表
         * @param head
         * @return
         */
        public ListNode filpLink (ListNode head){
            ListNode pre =null;
            ListNode next = null;
            while (head!=null){
                next = head.next;
                head.next = pre;
                pre = head;
                head = next;
            }
            return pre;
        }
    }
}
