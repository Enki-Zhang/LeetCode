package tree;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_226_2 {
    public static void main(String[] args) {

    }

    //翻转二叉树
    class Solution {
        public TreeNode invertTree(TreeNode root) {
            if (root != null) {

                TreeNode temp = root.left;
                root.left = root.right;
                root.right = temp;
                invertTree(root.left);
                invertTree(root.right);
            }
            return root;
        }

        public void swap(TreeNode left, TreeNode right) {

        }
    }
}
