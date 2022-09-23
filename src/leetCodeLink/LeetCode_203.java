package leetCodeLink;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_203 {
    public static void main(String[] args) {
    }

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static class Solution {
        public static ListNode removeElements(ListNode head, int val) {

            ListNode headNode = new ListNode();//头结点
            headNode.next = head;//头结点连接
            ListNode node = headNode;//头指针
            while (node.next != null) {//用head.nex 判断会取不到末尾数
                if (head.val == val) {
                    node.next = head.next;
                } else {
                    node = node.next;
                }
                head = node.next;
            }
            return headNode.next;
        }
    }
}
