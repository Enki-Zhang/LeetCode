package chain;

import javafx.util.Pair;
import leetCodeLink.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Enki
 * @ClassName LeetCode206
 * @Description: 翻转链表
 * @Date 2024/10/17 16:18
 * @Version 1.0
 */
public class LeetCode206 {
    public static void main(String[] args) {
        List<Pair<String, Double>> pairArrayList = new ArrayList<>(3);
        pairArrayList.add(new Pair<>("version", 12.10));
        pairArrayList.add(new Pair<>("version", 12.19));
        pairArrayList.add(new Pair<>("version", 6.28));
        Map<String, Double> map = pairArrayList.stream().collect(
// 生成的 map 集合中只有一个键值对：{version=6.28}
                Collectors.toMap(Pair::getKey, Pair::getValue, (v1, v2) -> {
                    return 0.0;
                }));
        map.get("version");


    }

    /**
     * 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
     */
    class Solution {
        public ListNode reverseList(ListNode head) {

//           翻转链表

            ListNode cur = head;
            ListNode pre = null;
//            pre.next = cur;
//            ListNode next = cur.next;//会出现空指针错误
            while (cur != null) {
                ListNode next = cur.next;
                cur.next = pre;
                pre = cur;
                cur = next;
//                next = cur.next;
            }
            return pre;//循环退出条件是cur为null
        }
    }
}
