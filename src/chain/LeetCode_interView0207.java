package chain;


import leetCodeLink.ListNode;

/**
 * @ClassName LeetCode_interView0207
 * @Description TODO
 * @Author Enki
 * @Date 2024/10/26 14:11
 * @Verison 1.0
 **/
public class LeetCode_interView0207 {
    public static void main(String[] args) {

    }

    /***
     * 寻找两个相交链表的公共节点
     * 相交链表尾数相同 将长度较长的链表先走到和较短链表同样长度的位置 同时遍历直到指针相遇
     *
     */
    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            if (headA == null || headB == null) {
                return null;
            }
            ListNode nodeA = headA;
            ListNode nodeB = headB;

            int listALength = 0;
            int listBLength = 0;
//            遍历寻找链表长度
            while (nodeA != null) {
                listALength++;
                nodeA = nodeA.next;
            }
            while (nodeB != null) {
                listBLength++;
                nodeB = nodeB.next;
            }
//            剪掉较长的链表开头
            int start = Math.abs(listALength - listBLength);
            if (listALength > listBLength) {
                while (start > 0) {
                    headA = headA.next;
                    start--;
                }
            } else {
                while (start > 0) {
                    headB = headB.next;
                    start--;
                }
            }
            while (headA != headB) {
                headA = headA.next;
                headB = headB.next;
            }
            return headA;

        }
    }
}
