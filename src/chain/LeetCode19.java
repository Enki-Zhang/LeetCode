package chain;

import leetCodeLink.ListNode;

/**
 * @author Enki
 * @ClassName LeetCode19
 * @Description: 找到倒数第n个节点
 * @Date 2024/10/20 13:14
 * @Version 1.0
 */
public class LeetCode19 {
    public static void main(String[] args) {

    }

    /**
     * 
     * 用两个节点pre 和 end之间间隔 n个节点的位置 当end到末尾时 pre
     * 位置就是目标节点  为了更好的删除节点 pre 和end的间隔可以是n+1
     */
    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode visNode = new ListNode(-1);//虚拟节点不应该移动
            visNode.next = head;
            ListNode end = head;
            ListNode node = visNode;
            while (n >0 && end != null) {
                end = end.next;
                n--;
            }
            while (end != null ) {
                node = node.next;
                end = end.next;
            }
//            删除节点
            node.next = node.next.next;

            return visNode.next;
        }
    }
}
