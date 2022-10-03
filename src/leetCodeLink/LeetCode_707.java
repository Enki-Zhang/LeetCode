package leetCodeLink;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_707 {
    public static void main(String[] args) {

    }

    //单链表 val 和 next。val 是当前节点的值，next 是指向下一个节点的指针/引用。

    static class MyLinkedList {

        int size;//头结点中记录长度
        ListNode head;

        public MyLinkedList() {
            //创建头节点
            head.next = null;
        }

        //获取链表中第 index 个节点的值。如果索引无效，则返回-1。
        public int get(int index) {

            return 0;
        }

        //在链表的第一个元素之前添加一个值为 val 的节点。插入后，新节点将成为链表的第一个节点。
        public void addAtHead(int val) {
//            头插法
            ListNode node = new ListNode(val);
            node.next = head.next;
            head.next = node;
        }

        //将值为 val 的节点追加到链表的最后一个元素。
        public void addAtTail(int val) {
//            尾插法
            ListNode node = new ListNode(val);
            while (true) {
                if (head.next == null) {
                    head.next = node;
                    break;
                } else {
                    head = head.next;
                }
            }
        }

        //在链表中的第index个节点之前添加值为val 的节点。如果index等于链表的长度，则该节点将附加到链表的末尾。如果 index 大于链表长度，则不会插入节点。如果index小于0，则在头部插入节点。
        public void addAtIndex(int index, int val) {
            if (index == size) {
                addAtTail(val);
                return;
            }
            if (index == 0) {
                addAtHead(val);
                return;
            }
            ListNode node = new ListNode(val);
          ListNode cur = head.next;
          int target =1;
          while (true)
          {
              if (target!=index)
              {

                  cur=head.next;
              }else {
                  node.next = cur.next;
                  cur.next = node;
                  break;
              }

          }


        }

        //如果索引 index 有效，则删除链表中的第 index 个节点。
        public void deleteAtIndex(int index) {

        }
    }


}
