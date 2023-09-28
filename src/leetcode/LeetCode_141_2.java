package leetcode;

import leetCodeLink.ListNode;

import java.util.HashMap;

/**
 * @author Enki
 * @ClassName LeetCode_141_2
 * @Description: TODO
 * @Date 2023/9/24 10:48
 * @Version 1.0
 */
public class LeetCode_141_2 {
    public static void main(String[] args) {


    }

    /**
     * todo
     * 判断是否有环 遍历每个节点存入到hashmap中 当出现重复则忧有环 并退出
     */
    public class Solution {
        public boolean hasCycle(ListNode head) {
//            遍历链表 存入map
            HashMap<ListNode, Integer> map = new HashMap<>();
            while (head != null) {
                if (!map.containsKey(head)) {
                    map.put(head, 0);
                    head = head.next;
                } else {
                    return true;
                }
            }
            return false;

        }
    }

    /**
     * todo
     * 找到环入口
     *
     */
}
