package leetCodeLink;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_19 {
    public static void main(String[] args) throws Exception {
        int[] nums = {1, 2, 3, 4, 5, 6};
        ListNode head = new ListNode(nums);
//        ListNode node = Solution.removeNthFromEnd(head, 2);
        ListNode pre = new ListNode();
        pre.next = head;
        ListNode node1 = Solution.recursive_removeNthFromEnd(pre,head,2);
        System.out.println(node1);
    }

    static class Solution {
        public static ListNode removeNthFromEnd(ListNode head, int n) {
            if (head == null) {
                return null;
            }
            if (head.next == null && n == 1) {
                return null;
            }
            ListNode _h = new ListNode();
            ListNode pre = new ListNode();
            ListNode cur = head;
            pre.next = head;
            _h = pre;
            int length = 0;
//            找链的长度
            while (cur != null) {
                length++;
                cur = cur.next;
            }
            cur = pre;
            int targetLength = length - n;
//            找出倒数位置
            while (true) {
//                用头指针删除
                if (targetLength != 0) {
                    cur = cur.next;
                    targetLength--;
                } else {
                    cur.next = cur.next.next;
                    break;
                }
            }
            return _h.next;
        }
static  int count = 0;
        public static ListNode recursive_removeNthFromEnd(ListNode pre, ListNode head, int n) {
//            后序遍历
            if (head.next == null) {
                return head;
            }
            ListNode node = recursive_removeNthFromEnd(pre.next, head.next, n);
            if (count == n){
                pre.next=head.next;
            }else {
               count++;
            }
            return node;
        }
    }
}
