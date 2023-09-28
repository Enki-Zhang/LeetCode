package leetcode;

import tree.TreeNode;

/**
 * @author Enki
 * @ClassName LeetCode_111
 * @Description: TODO
 * @Date 2023/9/11 10:54
 * @Version 1.0
 */
public class LeetCode_111 {
    public static void main(String[] args) {

    }

    /**
     *
     */
    class Solution {


        public int minDepth(TreeNode root) {
            if (root != null) {
                int l = minDepth(root.left);
                int r = minDepth(root.right);
                return root.left == null || root.right == null ? l + r + 1 : Math.min(l, r)+1;
            }
            return 0;
        }
    }
}
