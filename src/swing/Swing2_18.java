package swing;

import leetCodeLink.ListNode;

import javax.swing.*;

/**
 * @author Enki
 * @Version 1.0
 */
public class Swing2_18 {
    public static void main(String[] args) {
        Solution solution = new Solution();

    }
    /**
     * 删除链表节点
     */
    static class Solution {
        public ListNode deleteNode(ListNode head, int val) {
            ListNode pre = new ListNode();
            ListNode returnNode = pre;
            pre.next = head;
            ListNode cur = pre.next;
            while (cur.val != val){
                pre = pre.next;
                cur = cur.next;
            }
            pre.next = cur.next;
            return returnNode.next;
//            使用head返回不行
        }
    }

}
