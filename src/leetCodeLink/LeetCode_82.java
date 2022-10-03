package leetCodeLink;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_82 {
    public static void main(String[] args) throws Exception {
        int[] nums = {3,3,4,5};
        ListNode head = new ListNode(nums);
        ListNode node = Solution.deleteDuplicates(head);
        System.out.println(node);

    }

    static class Solution {
        public static ListNode deleteDuplicates(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }
            ListNode _h = new ListNode();//头节点
            _h.next = head;
            ListNode cur = head;
            ListNode next = cur.next;
//保留一个重复元素 用头结点去掉留下的元素
            while (next != null) {
                while (next != null && next.val == cur.val) {
                    cur.next = next.next;
                    next = cur.next;
                }
                _h.next = cur.next;
                cur = _h.next;
                if (cur != null) {
                    next = cur.next;
                } else break;
            }
            return _h;
        }
    }
}
