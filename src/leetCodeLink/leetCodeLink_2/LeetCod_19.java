package leetCodeLink.leetCodeLink_2;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCod_19 {
    public static void main(String[] args) {

    }

    static class Solution {
        public static ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode pre = new ListNode(-1);
            pre.next = head;
            ListNode cur = pre;
            ListNode tail = pre;
            int num = 0;
            while (num < n) {
                tail = tail.next;
                num++;
            }
            while (tail.next != null) {
                cur = cur.next;
                tail = tail.next;
            }
            cur.next = cur.next.next;
            return pre.next;


        }
    }
}
