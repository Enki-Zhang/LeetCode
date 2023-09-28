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
        LRUCache lruCache = new LRUCache(2);
        lruCache.put(2,1);
        lruCache.put(1,1);
        lruCache.put(2,3);
        lruCache.put(4,1);
        lruCache.get(1);
        lruCache.get(2);


    }

    /**
     * LRUCache(int capacity) 以 正整数 作为容量 capacity 初始化 LRU 缓存
     * int get(int key) 如果关键字 key 存在于缓存中，则返回关键字的值，否则返回 -1 。 查表
     * void put(int key, int value) 如果关键字 key 已经存在，则变更其数据值 value ； map存放
     * 如果不存在，则向缓存中插入该组 key-value 。如果插入操作导致关键字数量超过 capacity ，则应该 逐出 最久未使用的关键字 去掉末尾。
     *思路:使用linkedHashMap 维护插入的顺序 当删除最近最久的元素时只需要删除第一个即可
     */
    static class LRUCache {
        LinkedHashMap<Integer,Integer> map = null;
        int capacity = 0;
        public LRUCache(int capacity) {
            map = new LinkedHashMap<>(capacity,0.75f,true);//设置维护插入的顺序
            this.capacity = capacity;
            Queue<Integer> queue = new LinkedList();
            LinkedBlockingDeque<Integer> integers = new LinkedBlockingDeque<>();

        }

        public int get(int key) {
            return map.getOrDefault(key,-1);
        }

        public void put(int key, int value) {
//            map.remove(key);
            map.put(key,value);
            if (map.size()>capacity) {
                Iterator<Integer> iterator = map.keySet().iterator();
                if (iterator.hasNext()) {
                    Integer next = iterator.next();
                    iterator.remove();
                }
            }


        }
    }
}
