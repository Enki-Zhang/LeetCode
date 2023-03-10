package leetCodeLink.leetCodeLink_2;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_206 {
    public static void main(String[] args) {

    }

    static class Solution {
        public static ListNode reverseList(ListNode head) {
//            翻转单链表
            if (head == null) {
                return head;
            }
            ListNode node = reverseList(head.next);
            head.next.next = head;
            head.next = null;
            return node;

        }

        public ListNode reverse(ListNode head) {
            ListNode pre = null;
            ListNode cur = head;
            ListNode next = null;
//            不会产生空指针 没有将null进行赋值
            while (cur != null) {
                next = cur.next;
                cur.next = pre;
                pre =cur;
                cur = next;
            }
            return pre;
        }
    }
}
