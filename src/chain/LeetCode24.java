package chain;

import leetCodeLink.ListNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Enki
 * @ClassName LeetCode24
 * @Description: 两两交换节点
 * @Date 2024/10/20 9:48
 * @Version 1.0
 */
public class LeetCode24 {
    public static void main(String[] args) {
        // 创建一个 HashMap
        Map<String, Integer> map = new HashMap<>();

        // 添加元素
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        // 打印元素
        System.out.println("Initial Map: " + map);

        // 访问元素
        System.out.println("Value for key 'A': " + map.get("A"));

        // 修改元素
        map.put("A", 10);
        System.out.println("Updated Map: " + map);

        // 删除元素
        map.remove("B");
        System.out.println("After removing key 'B': " + map);

        // 演示哈希冲突
        map.put("D", 4); // 假设 A 和 D 哈希到同一位置
        map.put("C", 5); // 更新键 C 的值

        // 打印最终结果
        System.out.println("Final Map: " + map);
    }


    /**
     * pre -> cur -> next 交换 pre cur 并将指针后移动两个
     * 循环退出条件 移动后的 pre 和 cur 有一个为空
     */
    class Solution {
        public ListNode swapPairs(ListNode head) {
//            虚拟节点
            ListNode dummy = new ListNode(-1);
            dummy.next = head;
            ListNode pre = dummy;
            while (pre.next != null && pre.next.next != null) {
                ListNode cur = pre.next;
                ListNode next = cur.next;
                cur.next = next.next;
                next.next = cur;
                pre.next = next;
                pre = cur;
            }
            return dummy.next;
        }
    }
}
