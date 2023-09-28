package leetcode;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_647 {
    public static void main(String[] args) {
        String s = "aaaaa";
        Solution solution = new Solution();
        int i = solution.countSubstrings(s);
//        System.out.println(solution.isHuiWen("bc"));
        System.out.println(i);
    }

    /**
     * 统计回文子串的数目 判断超时 使用两个固定大小指针模拟窗口进行搜索 判断是否是回文 对于字符都是一样的字符串单独进行判断
     * 回文子串 找到子串 并进行判断
     */
    static class Solution {
        public int countSubstrings(String s) {
            boolean same = true;
            char c = s.charAt(0);
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i)!=s.charAt(0)){
                    same = false;
                }
            }
            if (same) {
                return ((1+s.length())*s.length())/2;//aaaa = ((1+4)*4)/2
            }
            int num = 0;
            int index = 0;
//            窗口大小
            int size = 1;
            while (size<=s.length()) {
                for (int  i = 0; i+size<=s.length(); i++) {
                    String sub = s.substring(i,i+size);
                    if (isHuiWen(sub)) {
                        num++;
                        System.out.println(sub);
                    }
                }
                size++;
                index = 0;
            }
            return num;
        }

        /**
         *判断回文数
         * @param subStr
         * @return
         */
        public boolean isHuiWen(String subStr) {
            int end = subStr.length()-1;
            for (int i = 0; i <=end/2; i++) {
                if (subStr.charAt(i)!=subStr.charAt(end-i)){
                    return false;
                }
            }
            return true;
        }
    }
}
