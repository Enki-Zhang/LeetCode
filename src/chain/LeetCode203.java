package chain;

import leetCodeLink.ListNode;

/**
 * @author Enki
 * @ClassName LeetCode203
 * @Description: TODO
 * @Date 2024/10/15 19:36
 * @Version 1.0
 */
public class LeetCode203 {
    public static void main(String[] args) {

    }

    /**
     * 删除链表中所有满足 Node.val == val 的节点
     */
    class Solution {
        public ListNode removeElements(ListNode head, int val) {
            // 创建虚拟头节点，指向原链表的头节点
            ListNode dummy = new ListNode(-1);
            dummy.next = head;
            ListNode prev = dummy;  // 前驱节点
            ListNode curr = head;   // 当前节点
            while (curr != null) {
                if (curr.val == val) {
                    // 跳过当前节点
                    prev.next = curr.next;
                } else {
                    // 前驱节点前进
                    prev = curr;
                }
                // 当前节点前进
                curr = curr.next;
            }

            // 返回新的头节点
            return dummy.next;
        }


    }
}
