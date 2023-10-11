package exam.szml;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Enki
 * @ClassName Solution2
 * @Description: TODO
 * @Date 2023/10/9 19:24
 * @Version 1.0
 */
public class Solution2 {
    //    两数之和
    public long countPairs(ArrayList<Integer> A, int n, int sum) {
        // write code here
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(sum - A.get(i))) {
                count += map.get(sum - A.get(i));
            }
            map.put(A.get(i), map.getOrDefault(A.get(i), 0) + 1);
        }
        return count;
    }

}
