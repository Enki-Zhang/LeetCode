import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_146 {
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
     * LRU缓存实现 使用hashMap和链表实现 链表维护一个记录时间表
     */
    static class LRUCache {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new LinkedList<>();
        private int capacity;
//以 正整数 作为容量 capacity 初始化 LRU 缓存
        public LRUCache(int capacity) {
            this.capacity = capacity;
        }
// 如果关键字 key 存在于缓存中，则返回关键字的值，否则返回 -1 。
        public int get(int key) {
            Integer integer = map.get(key);
//            取出元素 表示使用过 将元素移到链尾
            if (integer != null) {
                list.remove(list.indexOf(key));
                list.add(key);
                return integer;
            }
            return -1;
        }
//如果关键字key 已经存在，则变更其数据值value ；如果不存在，则向缓存中插入该组key-value 。如果插入操作导致关键字数量超
// 过capacity ，则应该逐出最久未使用的关键字。判断最久未使用的元素
// 放入元素 超过capacity 判断使用时间
        public void put(int key, int value) {
//            存入时需要判断key 是否相同
//            记录是否覆盖
            boolean  flag = false;
//            需要覆盖
           if (map.containsKey(key)){
                flag = true;
           }
            map.put(key,value);
            if (map.size()>capacity) {
                Integer last = list.get(0);
                list.remove(last);
                map.remove(last);
            }
//            更新链表
//            如果是覆盖的需要移动 如果是新增的直接加入 如果是删除后再写入的size也同样不变
            if (flag) {
//                覆盖
                list.remove(list.indexOf(key));
            }
            list.add(key);

        }
    }
}
