package leetCodeLink;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_0207 {
    public static void main(String[] args) throws Exception {
//        int[] numsA = {0, 9, 1, 2, 4};
//        int[] numsB = {3, 2, 4};
//
//        ListNode headA = new ListNode(numsA);
//        ListNode headB = new ListNode(numsB);
//        ListNode intersectionNode = Solution.getIntersectionNode(headA, headB);
//        System.out.println(intersectionNode);
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }


    public static class Solution {
        public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            for (ListNode i = headA; i != null; i = i.next) {
                for (ListNode j = headB; j != null; j = j.next) {
                    if (i == j) {
                        return j;
                    }
                }
            }
            return null;
        }
    }
}
