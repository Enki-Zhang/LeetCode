package leetCodeHash.leetCodeHash;

import java.util.*;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_49 {
    public static void main(String[] args) {

    }

    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
//            将str 排序后作为key传入map 将原型的str作为List值
            HashMap<String, List<String>> map = new HashMap<>();
            List<List<String>> lists = new ArrayList<>();
            for (String str : strs) {
                char[] chars = str.toCharArray();
                Arrays.sort(chars);
                String key = new String(chars);
                List<String> list = map.getOrDefault(key, new ArrayList<String>());
                list.add(str);
                map.put(key, list);
            }
            Iterator<String> iterator = map.keySet().iterator();
            while (iterator.hasNext()) {
                String next = iterator.next();
                lists.add(map.get(next));
            }
            return lists;

        }
    }
}
