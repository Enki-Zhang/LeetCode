package chain;

import leetCodeLink.ListNode;

/**
 * @author Enki
 * @ClassName LeetCode206
 * @Description: 翻转链表
 * @Date 2024/10/17 16:18
 * @Version 1.0
 */
public class LeetCode206 {
    public static void main(String[] args) {

    }

    /**
     * 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
     */
    class Solution {
        public ListNode reverseList(ListNode head) {

//           翻转链表

            ListNode cur = head;
            ListNode pre = null;
//            pre.next = cur;
//            ListNode next = cur.next;//会出现空指针错误
            while (cur != null) {
                ListNode next = cur.next;
                cur.next = pre;
                pre = cur;
                cur = next;
//                next = cur.next;
            }
            return pre;//循环退出条件是cur为null
        }
    }
}
