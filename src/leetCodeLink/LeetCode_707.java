package leetCodeLink;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_707 {
    public static void main(String[] args) {

    }

    //单链表 val 和 next。val 是当前节点的值，next 是指向下一个节点的指针/引用。
    static class LinkedNode {
        int val;
        LinkedNode next;

        LinkedNode() {
        }

        LinkedNode(int val) {
            this.val = val;
        }

        LinkedNode(LinkedNode next) {
            this.next = next;
        }

        LinkedNode(int val, LinkedNode next) {
            this.val = val;
            this.next = next;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public LinkedNode getNext() {
            return next;
        }

        public void setNext(LinkedNode next) {
            this.next = next;
        }
    }

    static class MyLinkedList {
        //        创建头指针
        int size;//头结点中记录长度
        LinkedNode head;

        //单链表 val 和 next。val 是当前节点的值，next 是指向下一个节点的指针/引用。
        public MyLinkedList() {
            int size = 0;
            head = new LinkedNode(size);
        }

        //获取链表中第 index 个节点的值。如果索引无效，则返回-1。
        public int get(int index) {
            return 0;
        }

        //在链表的第一个元素之前添加一个值为 val 的节点。插入后，新节点将成为链表的第一个节点。
        public void addAtHead(int val) {
//            头插法
//            节点
            LinkedNode node = new LinkedNode(val);
            node.next = head.next;
            head.next = node;
        }

        //将值为 val 的节点追加到链表的最后一个元素。
        public void addAtTail(int val) {
//            尾插法
            LinkedNode node = new LinkedNode(val);
            while (head.next != null) {
                head.next = head.next.next;
            }
            head.next = node;
        }

        //在链表中的第index个节点之前添加值为val 的节点。如果index等于链表的长度，则该节点将附加到链表的末尾。如果 index 大于链表长度，则不会插入节点。如果index小于0，则在头部插入节点。
        public void addAtIndex(int index, int val) {
            LinkedNode cur = new LinkedNode();
            LinkedNode node = new LinkedNode(val);
            head.next = cur;//头结点下面的第一个节点
            int target = 1;//计算节点数目
            if (index == size) {
                while (true) {
                    if (cur.next != null) {
                        head = cur;
                        cur = head.next;
                    } else {
                        cur.next = node;
                    }
                }
            }

        }

        //如果索引 index 有效，则删除链表中的第 index 个节点。
        public void deleteAtIndex(int index) {
            LinkedNode cur = new LinkedNode();
            head.next = cur;//头结点下面的第一个节点
            int target = 1;//计算节点数目
            if (index > size || index < 0) {
                return;
            }
            size--;
            //索引有效
            while (true) {
                //后移节点
                if (index != target) {
                    head = cur;
                    cur = head.next;
                    target++;
                } else {  //删除节点
                    head.next = cur.next;
                    cur = head.next;
                    size--;
                    break;
                }
            }
        }
    }

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */

}
