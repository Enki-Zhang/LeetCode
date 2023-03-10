package leetCodeLink.leetCodeLink_2;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_142 {
    public static void main(String[] args) {

    }

    public class Solution {
        public ListNode detectCycle(ListNode head) {

            if (head == null || head.next == null) {
                return null;
            }
//            if (head.next.next == null) {
//                return null;
//            }
            ListNode fast = head.next.next;
            ListNode slow = head.next;
//            int n = 0;
            while (fast != slow) {
                if (fast.next ==null||fast.next.next == null || slow.next == null) {
                    return null;
                }
                fast = fast.next.next;
                slow = slow.next;
//                n++;
            }
            fast = head;
            while (fast != slow) {
                fast = fast.next;
                slow = slow.next;
//                n--;
            }
            return fast;

        }
    }
}
