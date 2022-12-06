package leetCodeBack;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_22_2 {
    public static void main(String[] args) {
        List<String> list = new Solution().generateParenthesis(3);
        System.out.println(list);
    }

    static class Solution {
        public List<String> generateParenthesis(int n) {
            ArrayList<String> strings = new ArrayList<>();
            buildTree(n, n, "", strings);
            return strings;
        }

        public void buildTree(int left, int right, String builder, List<String> list) {
            if (left == 0 && right == 0) {
                list.add(builder);
                return;
            }
            if (left > right) return;//剪枝
            if (left > 0) {
                buildTree(left - 1, right, builder + "(", list);
            }
            if (right > 0) {
                buildTree(left, right - 1, builder + ")", list);
            }
        }
    }
}
