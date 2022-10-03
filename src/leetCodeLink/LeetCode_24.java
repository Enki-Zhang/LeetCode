package leetCodeLink;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_24 {
    public static void main(String[] args) throws Exception {
        int[] nums = {1, 2,3};
        ListNode head = new ListNode(nums);
        ListNode node = Solution.swapPairs(head);
        System.out.println(node);
    }

    //两两交换
    static class Solution {
        public static ListNode swapPairs(ListNode head) {
            if (head == null) {
                return null;
            }
            if (head.next == null) {
                return head;
            }
//            pre记录头结点 _h会移动不能作为返回值

            ListNode _h = new ListNode();
            ListNode pre = _h;
            ListNode cur = head;
            ListNode next = cur.next;
            _h.next = head;
            pre.next = head;
//            将节点的next指针改变
            while (next != null) {
                cur.next = next.next;
                _h.next = next;
                next.next = cur;
                if (cur.next != null){
                    _h = cur;
                    cur = _h.next;
                    next = cur.next;
                }else break;
            }
            return pre.next;
        }
    }

}
