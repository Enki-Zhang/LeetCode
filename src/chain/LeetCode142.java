package chain;

import leetCodeLink.ListNode;

/**
 * @ClassName LeetCode142
 * @Description TODO
 * @Author Enki
 * @Date 2024/10/26 14:58
 * @Verison 1.0
 **/
public class LeetCode142 {
    public static void main(String[] args) {


    }

    /**
     * 返回链表的入环点
     */
    public class Solution {
        public ListNode detectCycle(ListNode head) {
//            无环判断
            ListNode A = head;
            ListNode B = head;
            int slow = 0;
            int fast = 0;
//            A = A.next;
//            B = B.next.next;
            while (A.next != null && B.next != null) {
                A = A.next;
                B = B.next.next;
                if (A == B) {
                    break;
                }
                slow++;
                fast = fast + 2;
            }
            int c = fast - slow;
            while (c > 0) {
                B = B.next;
                c--;
            }
            return B;


        }
    }
}
