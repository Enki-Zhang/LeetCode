package tree;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_701_2 {
    public static void main(String[] args) {
    }

    class Solution {
        public TreeNode insertIntoBST(TreeNode root, int val) {
//            中序遍历搜索树 并插入
            if (root != null) {
                if (val < root.val) {
                    root.left = insertIntoBST(root.left, val);
                }
                if (val > root.val) {
                    root.right = insertIntoBST(root.right, val);
                }
            }else return new TreeNode(val);
            return root;
        }
    }
}
