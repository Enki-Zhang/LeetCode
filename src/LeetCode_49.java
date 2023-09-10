import java.util.*;

/**
 * @author Enki
 * @ClassName LeetCode_49
 * @Description: TODO
 * @Date 2023/9/2 11:26
 * @Version 1.0
 */
public class LeetCode_49 {
    public static void main(String[] args) {

    }

    /**
     * 求出所有的字母异味组合 将所有字符串放入map中进行查表分组
     */
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            HashMap<String, ArrayList<String>> map = new HashMap<>();
            List<List<String>> lists = new ArrayList<>();
            for (String s :
                    strs) {
                char[] chars = s.toCharArray();
//                对每个字符进行排序 放入到map中并对每个map遍历分组
                Arrays.sort(chars);
                ArrayList<String> list = map.getOrDefault(new String(chars), new ArrayList<String>());
                list.add(s);
                map.put(new String(chars), list);
            }
            Set<String> strings = map.keySet();
            Iterator<String> iterator = strings.iterator();
            while (iterator.hasNext()) {
                String next = iterator.next();
                lists.add(map.get(next));
            }
            return lists;
        }

    }
}
