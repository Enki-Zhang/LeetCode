import com.sun.org.apache.bcel.internal.generic.FADD;
import leetCodeLink.ListNode;

import java.util.List;

/**
 * @author Enki
 * @ClassName LeetCode_142
 * @Description: TODO
 * @Date 2023/9/24 10:52
 * @Version 1.0
 */
public class LeetCode_142 {
    public static void main(String[] args) {

    }

    /**
     * todo
     * 找到环形链表的入口 使用快慢指针 fast = 2*slow 当两指针相遇时慢指针走过的长度==环的长度 当快指针从相遇的地方开始 慢指针从链表头节点开始
     * 两者再次相遇即为链表入口
     */
    public class Solution {
        public ListNode detectCycle(ListNode head) {
            if (head == null || head.next == null) {
                return null;
            }
            ListNode fast = head;
            ListNode slow = head;
            boolean isCyc = false;
            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
                if (fast == slow) {
                    isCyc = true;
                    break;
                }
            }
            if (!isCyc) {
                return null;
            }
            slow = head;
            while (fast != slow) {
                fast = fast.next;
                slow = slow.next;
            }
            return slow;
        }
    }
}
