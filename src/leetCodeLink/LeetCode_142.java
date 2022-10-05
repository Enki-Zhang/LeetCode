package leetCodeLink;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_142 {
    public static void main(String[] args) {

    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static class Solution {
        public static ListNode detectCycle(ListNode head) {
            ListNode fast = head;
            ListNode slow = head;
            if (head==null||head.next == null) {
                return null;
            }
            fast = fast.next.next;
            slow = slow.next;
            int n = 1;
            while (fast != slow) {
                if (fast.next.next == null ) {
                    return null;
                }
                fast = fast.next.next;
                slow = slow.next;
                n++;
            }
            fast = head;
            while (fast != slow) {
                fast = fast.next;
                slow = slow.next;
            }
            return fast;
        }
    }
}
