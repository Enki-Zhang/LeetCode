package tree;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_814 {
    public static void main(String[] args) {

    }

    class Solution {
        TreeNode node = new TreeNode();

        public TreeNode pruneTree(TreeNode root) {
            //            后序遍历
            if (root != null) {
                root.left = pruneTree(root.left);//有返回结果值
                root.right = pruneTree(root.right);
                if (root.val == 0 && root.left  == null && root.right == null) {
                    return null;
                }
            }
            return root;
        }


    }
}
