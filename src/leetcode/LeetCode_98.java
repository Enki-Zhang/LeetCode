package leetcode;

import tree.TreeNode;

/**
 * @author Enki
 * @ClassName LeetCode_98
 * @Description: TODO
 * @Date 2023/9/16 9:44
 * @Version 1.0
 */
public class LeetCode_98 {
    public static void main(String[] args) {

    }

    class Solution {


        public boolean isValidBST(TreeNode root) {

            return isValidBST(root, null, null);


        }

        private boolean isValidBST(TreeNode root, Integer min, Integer max) {
            if (root == null) {
                return true;
            }
            if ((min != null && root.val <= min) || (max != null && root.val >= max)) {
                return false;
            }
            return isValidBST(root.left, min, root.val) && isValidBST(root.right, root.val, max);
        }
    }
}
