package tree;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_101_2 {
    public static void main(String[] args) {

    }

    //    依次比较节点的外侧和内侧
    class Solution {
        public boolean isSymmetric(TreeNode root) {
            return compare(root.left, root.right);
        }

        public boolean compare(TreeNode left, TreeNode right) {

            if (left == null && right != null) {
                return false;
            } else if (right == null && left != null) {
                return false;
            } else if (left == null && right == null) {
                return true;
            } else if (left.val != right.val) {
                return false;
            }
            return compare(left.left, right.right) && compare(left.right, right.left);
        }
    }
}
