import leetCodeLink.ListNode;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_160 {
    public static void main(String[] args) {

    }

    /**
     * 链表相交 两个链表都遍历到末尾 将较长链表减去较短链表得到差值 较长数组先遍历到差值位置 在共同遍历后比较节点是否相同
     */
    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            if (headA == null || headB == null) {
                return null;
            }
            ListNode tileA = headA;
            ListNode tileB = headB;
            int aLength = 0;
            int bLength = 0;
            while (tileA != null) {
                tileA = tileA.next;
                aLength++;
            }
            while (tileB != null) {
                tileB = tileB.next;
                bLength++;
            }
            if (aLength > bLength) {
                int dif = aLength - bLength;
                while (dif > 0 && headA.next != null) {
                    headA = headA.next;
                    dif--;
                }
            } else if (bLength > aLength) {
                int dif = bLength - aLength;
                while (dif > 0 && headB.next != null) {
                    headB = headB.next;
                    dif--;
                }
            }
            while (headA != headB && headA.next != null && headB.next != null) {
                headA = headA.next;
                headB = headB.next;
            }
            return headA == headB ? headA:null;
        }
    }
}
