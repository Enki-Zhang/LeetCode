package leetcode;

import leetCodeLink.ListNode;

import java.util.List;

/**
 * @author Enki
 * @ClassName LeetCode_147
 * @Description: TODO
 * @Date 2023/8/13 11:46
 * @Version 1.0
 */
public class LeetCode_147 {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        ListNode node = new ListNode(new int[]{-1,5,3,4,0});
        System.out.println(solution.insertionSortList(node));


    }

    /**
     * 链表进行插入排序 依次选取一个节点，并不断遍历已排序链表插入到指定位置
     */
    static class Solution {
        public ListNode insertionSortList(ListNode head) {
            ListNode start = new ListNode(Integer.MIN_VALUE);
            ListNode node = head.next; // 待排序的节点
            start.next = head;// 有序节点的开头
            ListNode end = head; //有序链表的末尾

            while (node != null) {
//                下一个需要插入的元素
                ListNode next = node.next;
//                将节点插入到合适位置 遍历有序链表
                ListNode index = start;
                while (index != end) {
//                    插入元素在中间
                    if (index.val < node.val && index.next.val >= node.val) {
                        end.next = node.next;
                        node.next = index.next;
                        index.next = node;
                        break;
                    }
//                    插入元素在末尾
                    if (node.val > end.val) {
                        end = end.next;
                        break;
                    }
                    index = index.next;
                }
                node = next;
            }
            return start.next;

        }
    }
}
