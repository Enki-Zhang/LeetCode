import leetCodeLink.ListNode;

import java.util.HashMap;
import java.util.List;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_141 {
    public static void main(String[] args) {


    }

    /**
     * 环形链表 使用哈希表标记是否有环
     */
    public class Solution {
        public boolean hasCycle(ListNode head) {
            HashMap<ListNode, Integer> map = new HashMap<>();
            ListNode node = head;
            while (head!=null) {
                if (map.containsKey(head)) {
                    return true;
                }else {
                    map.put(head,0);
                    head = head.next;
                }
            }
            return false;


        }
    }
}
