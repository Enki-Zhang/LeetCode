package tree.bsf;


/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_701 {
    public static void main(String[] args) {

    }

    //二叉搜索树插入节点 递归有和没有返回值的区别
    class Solution {
        TreeNode node;

        public TreeNode insertIntoBST(TreeNode root, int val) {
            if (root == null) {
                TreeNode treeNode = new TreeNode(val);
                if (node == null) {
                    return treeNode;
                } else if (val > node.val) {
                    node.right = treeNode;
                } else {
                    node.left = treeNode;
                }
            } else if (root.val > val) {
                node = root;
                insertIntoBST(root.left, val);
            } else if (root.val < val) {
                node = root;
                insertIntoBST(root.right, val);
            }
            return root;
        }
    }
}

