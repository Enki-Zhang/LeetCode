package leetcode;

import tree.TreeNode;

/**
 * @author Enki
 * @ClassName LeetCode_104
 * @Description: TODO
 * @Date 2023/9/11 10:50
 * @Version 1.0
 */
public class LeetCode_104 {
    public static void main(String[] args) {

    }

    /**
     *
     */
    class Solution {
        public int maxDepth(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int L = maxDepth(root.left) + 1;
            int R = maxDepth(root.right) + 1;
            return Math.max(L, R);
        }
    }
}

