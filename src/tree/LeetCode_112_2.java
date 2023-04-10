package tree;

import java.nio.IntBuffer;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_112_2 {
    public static void main(String[] args) {
    }

    class Solution {
        boolean L = false;
        boolean R = false;

        public boolean hasPathSum(TreeNode root, int targetSum) {
            if (root == null) {
                return false;
            }
//            找到一条路径 判断是否满足
            if (root.left == null && root.right == null && targetSum == root.val) {
                return true;
            }
            if (root.left != null) {
                L = hasPathSum(root.left, targetSum - root.val);
            }
            if (root.right != null) {
                R = hasPathSum(root.right, targetSum - root.val);
            }
            return L || R;

        }
    }
}
