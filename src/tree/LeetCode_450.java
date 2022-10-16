package tree;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_450 {
    public static void main(String[] args) {
    }

    //    删除二叉搜索树中的节点
    class Solution {
        public TreeNode deleteNode(TreeNode root, int key) {
            if (root != null) {
                if (root.val==key) {
                    root = root.right;

                }
                deleteNode(root.left, key);
                deleteNode(root.right, key);

            }
            return root;
        }
    }
}
