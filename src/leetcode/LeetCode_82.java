package leetcode;

import leetCodeLink.ListNode;


/**
 * @author Enki
 * @ClassName LeetCode_82
 * @Description: TODO
 * @Date 2023/10/11 9:53
 * @Version 1.0
 */
public class LeetCode_82 {
    public static void main(String[] args) {

    }

    /**
     * 删除重复元素 遍历
     */
    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            if (head == null) {
                return null;
            }
            ListNode res = new ListNode();
            res.next = head;
            ListNode pre = new ListNode();
            pre = res;
            boolean isDu = false;
            while (head!= null) {
                isDu = false;
                while (head.next != null && head.next.val == head.val) {
                    isDu = true;
                    head = head.next;
                }
                if (isDu) {
                    pre.next = head.next;
                } else {
                    pre = pre.next;
                }
                head = head.next;
            }
            return res.next;
        }
    }
}
