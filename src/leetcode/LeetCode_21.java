package leetcode;

import leetCodeLink.ListNode;

import java.util.List;

/**
 * @author Enki
 * @ClassName LeetCode_21
 * @Description: TODO
 * @Date 2023/9/21 10:28
 * @Version 1.0
 */
public class LeetCode_21 {
    public static void main(String[] args) {

    }

    /**
     * 合并两个有序链表
     */
    class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

            ListNode pre = new ListNode();
            ListNode res = list1;
            pre.next = list2;
            while (list2 != null) {
                if (list1.val > list2.val) {
                    ListNode temp = new ListNode(list2.val);
                    temp.next = list1.next;
                    pre.next = temp;
                    list1 = temp;
                }
                pre = pre.next;
                list1=list1.next;
                list2 = list2.next;
            }

            return res;
        }
    }
}
