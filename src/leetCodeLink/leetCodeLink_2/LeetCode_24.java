package leetCodeLink.leetCodeLink_2;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_24 {
    public static void main(String[] args) {

    }

    static class Solution {
        public static ListNode swapPairs(ListNode head) {
//            虚拟头结点 保存链表开头
            ListNode pre = new ListNode(-1);
            pre.next = head;
            ListNode cur = pre;
            ListNode left = null;
            ListNode tem = null;
            ListNode next = null;
            while (cur.next != null && cur.next.next != null) {
                left = cur.next;
                next = left.next;
                tem = next.next;
                cur.next = next;//改变头指针的指向
                next.next = left;
                left.next = tem;
                cur = left;
            }
            return pre.next;

        }
    }
}
