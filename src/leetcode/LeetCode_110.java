package leetcode;

import tree.TreeNode;

/**
 * @author Enki
 * @ClassName LeetCode_110
 * @Description: TODO
 * @Date 2023/9/10 14:50
 * @Version 1.0
 */
public class LeetCode_110 {
    public static void main(String[] args) {

    }

    /**
     * 判断是否是BSF
     */
    class Solution {
        int left = 0;
        int right = 0;
        boolean L = false;
        boolean R = false;

        public boolean isBalanced(TreeNode root) {
            if (root == null) {
                return true;
            }
            if (Math.abs(treeHigh(root.left) - treeHigh(root.right)) > 1) {
                return false;
            }


            return isBalanced(root.right) && isBalanced(root.left);

        }

        private int treeHigh(TreeNode node) {
            if (node == null) {
                return 0;
            }
            int left = treeHigh(node.left) + 1;
            int right = treeHigh(node.right) + 1;
            return Math.max(left, right);
        }
    }
}
