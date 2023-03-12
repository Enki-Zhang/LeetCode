package leetCodeLink;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author Enki
 * @Version 1.0
 */
public class Swing_6 {
    public static void main(String[] args) {
    }

    class Solution {
        public int[] reversePrint(ListNode head) {
            ListNode pre = null;
            ListNode node = head;
            ListNode next = null;
            int i=0;
            while (node != null) {
                i++;
                next = node.next;
                node.next = pre;
                pre = node;
                node = next;
            }
            int[] tar = new int[i];
            int m =0;
            while (pre!=null){
                tar[m] = pre.val;
                pre=pre.next;
                m++;
            }
            return tar;
        }
    }
}
