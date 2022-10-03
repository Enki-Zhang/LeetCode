package leetCodeLink;

import java.lang.management.LockInfo;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_206 {
    public static void main(String[] args) throws Exception {
        int[] nums = {1, 2, 3, 5, 6, 7};
        ListNode head = new ListNode(nums);
//        ListNode list = Solution.reverseList(head);
//        ListNode listNode = Solution_headInsert.reverseList(head);
//        ListNode list_03 = Solution_03.reverList_03(head);
//        ListNode listNode = Solution_04.ListNode_04(head);
        ListNode listNode = Solution_04.recursive_after(head);
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


    static class Solution_headInsert {
        /***
         * 将末尾节点取下来插入到头结点之后
         * @param head
         * @return
         */
        public static ListNode reverseList(ListNode head) {
            ListNode _head = new ListNode();//头结点为空
            ListNode _h = _head;//返回时候作为标记
            _head.next = head;
            ListNode pre = _head;//前序指针
            ListNode cur = head;//遍历指针
            //遍历链表 取出末尾节点
            while (cur != null) {
                if (cur.next == null) {
                    //末尾节点
                    pre.next = null;//取出末尾
                    cur.next = _head.next;//头插
                    _head.next = cur;
                    _head = _head.next;
                    pre = _head;
                } else {
                    //指针后移
                    pre = pre.next;
                }
                cur = pre.next;
            }
//            表头元素 用之前标记的表头返回列表 原先的head会被移到末尾 不能返回
            return _h.next;
        }

    }

//    翻转列表 修改指针

    static class Solution_03 {
        public static ListNode reverList_03(ListNode head) {
            ListNode pre = null;
            ListNode cur = head;
            ListNode next = null;
            while (cur != null) {
                next = cur.next;
                cur.next = pre;
                pre = cur;
                cur = next;
            }
            return pre;
        }
    }


    static class Solution_04 {
        public static ListNode ListNode_04(ListNode head) {
            return recursive_listNode(null, head);
        }

        //    递归的前序遍历
        public static ListNode recursive_listNode(ListNode pre, ListNode cur) {
            if (cur == null) {
                return pre;
            }
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
            return recursive_listNode(pre, cur);
        }

        //后序遍历
        public static ListNode recursive_after(ListNode head) {
            //判断最小单元 出口
            if ( head.next == null) {
                return head;
            }
            //返回末尾节点 这里不断压栈 直到末尾节点
            ListNode node = recursive_after(head.next);
//            最小单元逻辑 出现环
            head.next.next = head;
//            出现环
            head.next = null;
            return node;
        }

        //        翻转列表 后序排序
        public static ListNode recursive_after_01(ListNode head) {
//            遍历到末尾
            if (head == null || head.next == null) {
                return head;
            }
            ListNode node = recursive_after_01(head.next);
//            后序遍历主逻辑在递归主件的后面

            head.next.next = head;
            head.next = null;
            return node;
        }


    }
}
