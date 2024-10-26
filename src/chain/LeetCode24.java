package chain;

import leetCodeLink.ListNode;

/**
 * @author Enki
 * @ClassName LeetCode24
 * @Description: 两两交换节点
 * @Date 2024/10/20 9:48
 * @Version 1.0
 */
public class LeetCode24 {
    public static void main(String[] args) {

    }

    /**
     * pre -> cur -> next 交换 pre cur 并将指针后移动两个
     * 循环退出条件 移动后的 pre 和 cur 有一个为空
     */
    class Solution {
        public ListNode swapPairs(ListNode head) {
//            虚拟节点
            ListNode dummy = new ListNode(-1);
            dummy.next = head;
            ListNode pre = dummy;
            while (pre.next != null && pre.next.next != null) {
                ListNode cur = pre.next;
                ListNode next = cur.next;
                cur.next = next.next;
                next.next = cur;
                pre.next = next;
                pre = cur;
            }
            return dummy.next;
        }
    }
}
