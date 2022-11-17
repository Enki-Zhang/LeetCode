package leetCodeLink;

import com.sun.security.auth.UnixNumericGroupPrincipal;

import java.util.List;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_21 {
    public static void main(String[] args) throws Exception {
        int[] nums = {1, 2, 4};
        int[] nums2 = {1,2};
        ListNode node1 = new ListNode(1);
        ListNode list1 = new ListNode(nums);
        ListNode list2 = new ListNode(nums2);
//        ListNode node = Solution.insertNode(list1, node1);
//        System.out.println(node);
        ListNode node = Solution.mergeTwoLists(list1, list2);
        System.out.println(node);
    }

    //    将两个升序链表合并
    /*
    将一个链表插入另一个链表中去 将节点放入有序链表中
     */
    static class Solution {
        public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            if (list1==null) {
                return list2;
            }
            if (list2==null) {
                return list1;
            }
            ListNode node = new ListNode();
            ListNode target = list1;
            ListNode pre = new ListNode();
            pre.next = list2;
            while (list2 != null) {
                node = list2;
                pre.next = list2.next;
                list2 = pre.next;
               target = insertNode(target,node);
            }
            return target;
        }

        /**
         * 插入节点
         *
         * @param list
         */
        public static ListNode insertNode(ListNode list, ListNode node) {
            ListNode pre = new ListNode(Integer.MIN_VALUE);//头结点
            pre.next = list;
            ListNode target = pre;
            if (node.val < list.val) {
                node.next = list;
                list = node;
                return list;
            }
            while (pre.next != null) {
                if (node.val >= pre.val && node.val <= list.val) {
                    break;
                } else {
                    pre = pre.next;
                    list = pre.next;
                }
            }
            node.next = list;
            pre.next = node;
            return target.next;
        }
    }
}
