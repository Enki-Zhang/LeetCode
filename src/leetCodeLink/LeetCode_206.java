package leetCodeLink;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_206 {
    public static void main(String[] args) throws Exception {
        int[] nums = {1, 2, 3, 4, 5,45,12,354};
        ListNode head = new ListNode(nums);
//        ListNode list = Solution.reverseList(head);
        ListNode listNode = Solution_headInsert.reverseList(head);
        System.out.println(listNode);
    }


    //翻转列表
    static class Solution {
        public static ListNode reverseList(ListNode head) {
            //head 可能为空
            if (head == null) {
                return null;
            }
            //只有一个元素
            if (head.next == null) {
                return head;
            }
            ListNode cur = head;//当前元素
            ListNode pre = null;//第一个元素指向的为null
            while (cur != null) {
                ListNode right = cur.next;//标记断开连接的
                cur.next = pre;//断开
                pre = cur;
                cur = right;
            }
            return pre;
        }
    }


    //头插法
    static class Solution_headInsert {
        /***
         * 将末尾节点取下来插入到头结点之后
         * @param head
         * @return
         */
        public static ListNode reverseList(ListNode head) {
            ListNode _head = new ListNode(-1);//头结点为空
            _head.next = head;
            ListNode pre = _head;//前序指针
            ListNode cur = head;//遍历指针
            ListNode target = cur;//标记结束
            int size = 0;
            while (cur != null) {
                size++;
                cur = cur.next;
            }
            cur = head;
            //遍历链表 取出末尾节点
            while (cur != null && size > 0) {
                if (cur.next == null) {
                    //末尾节点
                    pre.next = null;//取出末尾
                    cur.next = _head.next;//头插
                    _head.next = cur;
                    pre = _head;
                    size--;

                } else {
                    //指针后移
                    pre = pre.next;
                }
                cur = pre.next;
            }

            return head;
        }

    }
}
