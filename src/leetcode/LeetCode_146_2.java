package leetcode;

import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * @author Enki
 * @ClassName LeetCode_146_2
 * @Description: TODO
 * @Date 2023/9/14 10:05
 * @Version 1.0
 */
public class LeetCode_146_2 {
    public static void main(String[] args) {
//        LRUCache lruCache = new LRUCache(2);
//        lruCache.put(2, 1);
//        lruCache.put(1, 1);
//        lruCache.put(2, 3);
//        lruCache.put(4, 1);
//        lruCache.get(1);
//        lruCache.get(2);


    }

    /**
     * LRUCache(int capacity) 以 正整数 作为容量 capacity 初始化 LRU 缓存
     * int get(int key) 如果关键字 key 存在于缓存中，则返回关键字的值，否则返回 -1 。 查表
     * void put(int key, int value) 如果关键字 key 已经存在，则变更其数据值 value ； map存放
     * 如果不存在，则向缓存中插入该组 key-value 。如果插入操作导致关键字数量超过 capacity ，则应该 逐出 最久未使用的关键字 去掉末尾。
     * 思路:使用linkedHashMap 维护插入的顺序 当删除最近最久的元素时只需要删除第一个即可
     */
//    static class LRUCache {
//        LinkedHashMap<Integer,Integer> map = null;
//        int capacity = 0;
//        public LRUCache(int capacity) {
//            map = new LinkedHashMap<>(capacity,0.75f,true);//设置true 维护插入的顺序
//            this.capacity = capacity;
//            Queue<Integer> queue = new LinkedList();
//            LinkedBlockingDeque<Integer> integers = new LinkedBlockingDeque<>();
//
//        }
//
//        public int get(int key) {
//            return map.getOrDefault(key,-1);
//        }
//
//        public void put(int key, int value) {
////            map.remove(key);
//            map.put(key,value);
//            if (map.size()>capacity) {
//                Iterator<Integer> iterator = map.keySet().iterator();
//                if (iterator.hasNext()) {
//                    Integer next = iterator.next();
//                    iterator.remove();
//                }
//            }
//
//
//        }
//    }

    /**
     * 双向链表维护最近最久未使用的节点 靠近头节点为最久未使用 靠近尾节点为最近使用
     */
    class LRUCache {

        //        双向链表的节点
        class DDLinkedNode {
            int key;
            int value;
            DDLinkedNode pre;
            DDLinkedNode next;

            DDLinkedNode() {
            }

            DDLinkedNode(int key, int value) {
                this.key = key;
                this.value = value;
            }


        }

        HashMap<Integer, DDLinkedNode> map = null;
        int capacity = 0;
        DDLinkedNode head;
        DDLinkedNode tail;

        public LRUCache(int capacity) {
            this.capacity = capacity;
            map = new HashMap<>();
//            维护一个双向链表
            head = new DDLinkedNode();
            tail = new DDLinkedNode();
            head.next = tail;
            tail.pre = head;
        }

        /**
         * 如果关键字 key 存在于缓存中，则返回关键字的值，否则返回 -1 。
         *
         * @param key
         * @return
         */
        public int get(int key) {
            DDLinkedNode ddLinkedNode = map.get(key);
            if (ddLinkedNode == null) {
                return -1;
            } else {
                removeHead(ddLinkedNode);
                addToHead(ddLinkedNode);
                return ddLinkedNode.value;
            }
        }

        public void put(int key, int value) {
            DDLinkedNode ddLinkedNode = map.get(key);
            if (ddLinkedNode == null) {
                DDLinkedNode node = new DDLinkedNode(key, value);
                map.put(key, node);
                addToHead(node);
                if (map.size() > capacity) {
//                    选择删除
                    DDLinkedNode linkedTail = getLinkedTail();
                    map.remove(linkedTail.value);
                    removeTail();

                }
            } else {
                ddLinkedNode.value = value;
                removeHead(ddLinkedNode);
                addToHead(ddLinkedNode);
            }

        }

        void addToHead(DDLinkedNode node) {
            node.next = head.next;
            head.next.pre = node;
            node.pre = head;
            head.next = node;

        }

        DDLinkedNode getLinkedTail() {
            return tail;
        }

        void removeTail() {
            tail.pre.next = null;
            tail = tail.pre;
        }

        void removeHead(DDLinkedNode node) {
            node.pre.next = node.next;
            node.next.pre = node.pre;
        }

    }
}
