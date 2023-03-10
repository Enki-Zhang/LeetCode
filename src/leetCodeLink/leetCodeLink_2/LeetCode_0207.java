package leetCodeLink.leetCodeLink_2;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_0207 {
    public static void main(String[] args) {

    }

    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            for (ListNode node = headA; node != null; node = node.next) {
                for (ListNode node1 = headB; node1 != null; node1 = node1.next) {
                    if (node == node1) {
                        return node;
                    }
                }
            }
            return null;

        }
    }
}
