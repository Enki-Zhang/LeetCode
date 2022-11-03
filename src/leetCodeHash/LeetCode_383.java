package leetCodeHash;

import java.util.HashMap;
import java.util.Iterator;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_383 {
    public static void main(String[] args) {
        String a = "aa";
        String b = "aaa";
        boolean b1 = Solution.canConstruct(a, b);
        System.out.println(b1);

    }

    static class Solution {
        public static boolean canConstruct(String ransomNote, String magazine) {
            int time = 0;
            String[] split = ransomNote.split("");
            String[] split1 = magazine.split("");
            HashMap<String, Integer> map = new HashMap<>();
            for (String str :
                    split1) {
//                记录每个字符出现的个数
                if (map.containsKey(str)) {
                    map.put(str, map.get(str) + 1);
                } else map.put(str, 1);
            }
            for (String str :
                    split) {
                if (map.containsKey(str) && map.get(str)!=0 ) {
                    map.put(str, map.get(str)-1);
                    time++;
                }
            }
//            Iterator<String> iterator = map.keySet().iterator();
//            while (iterator.hasNext()) {
//                String next = iterator.next();
//                if (map.get(next) != 0) {
//                    time++;
//                }
//            }
            if (time == split.length) {
                return true;
            }
            return false;
        }
    }
}
