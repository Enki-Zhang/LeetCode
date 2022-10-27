package tree;

import java.util.LinkedList;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_112 {
    public static void main(String[] args) {
    }

    class Solution {
        int result = 0;
        Boolean L = false;
        Boolean R = false;

        public boolean hasPathSum(TreeNode root, int targetSum) {
            if (root == null) {
                return false;
            }
            if (root.left == null && root.right == null && targetSum == root.val) {
                return true;
            }
            if (root.left != null) {
                L = hasPathSum(root.left, targetSum-root.val);

            }
            if (root.right != null) {
                R = hasPathSum(root.right, targetSum-root.val);
            }

            return L || R;
        }


    }
}
