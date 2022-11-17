package leetCodeHash;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_169 {
    public static void main(String[] args) {

    }

    class Solution {
        public int majorityElement(int[] nums) {

//            元素出现是次数
            HashMap<Integer, Integer> map = new HashMap<>();
                for (int i :
                        nums) {
                    if (map.containsKey(i)) {
                        map.put(i,map.get(i)+1);
                    }else {
                        map.put(i,1);
                    }
            }
//                对map的value进行排序
            Set<Integer> keySet = map.keySet();
            Iterator<Integer> iterator = keySet.iterator();
            while (iterator.hasNext()) {
                Integer next = iterator.next();
                if (map.get(next)> nums.length/2){
                    return next;
                }
            }
            return 0;
        }
    }
}
