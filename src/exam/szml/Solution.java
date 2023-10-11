package exam.szml;

import leetCodeLink.ListNode;

/**
 * @author Enki
 * @ClassName Solution
 * @Description: TODO
 * @Date 2023/10/9 19:19
 * @Version 1.0
 */
public class Solution {
    public ListNode deleteNode(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }
        // 删除指定节点的值
        ListNode result = new ListNode(-1);
        result = head;


        while (head.next != null) {
            if (head.next.val == val) {
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }
        return result;
    }
}
