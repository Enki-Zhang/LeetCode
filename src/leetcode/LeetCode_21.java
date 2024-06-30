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
      int i =10;
      do {
          i/=2;
      }
      while (i>1);
        System.out.println(i);
        int i1 = Integer.parseInt("00EF", 16);
        System.out.println(i1);
    }

    /**
     * 合并两个有序链表
     */
    class Solution2 {
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
                list1 = list1.next;
                list2 = list2.next;
            }

            return res;
        }
    }

    /**
     * 合并有序链表 类似二路归并合并 2中的元素<1中的元素使用头插法进去 完成后返回1链表
     * 没有说原地和合并  可以创建新的链表
     */
    class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode pre = new ListNode();
            ListNode res = pre;
            while (list1 != null && list2 != null) {
                if (list1.val > list2.val) {
                    pre.next = new ListNode(list2.val);
                    list2 = list2.next;
                } else {
                    pre.next = new ListNode(list1.val);
                    list1 = list1.next;
                }
                pre = pre.next;
            }
            if (list1 != null) {
                pre.next = list1;
            } else pre.next = list2;
            return res.next;


        }
    }


}
