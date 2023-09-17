import leetCodeLink.ListNode;

import java.util.List;

/**
 * @author Enki
 * @ClassName LeetCode_206
 * @Description: TODO
 * @Date 2023/9/17 10:51
 * @Version 1.0
 */
public class LeetCode_206 {
    public static void main(String[] args) {
    }

    class Solution {
        public ListNode reverseList(ListNode head) {
            if (head == null) {
                return null;
            }
            ListNode pre = null;
            ListNode next = head.next;
            while (head != null) {
                next = head.next;
                head.next = pre;
                pre = head;
                head = next;
            }
            return pre.next;
        }
    }
}
