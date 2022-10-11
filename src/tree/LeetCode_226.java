package tree;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_226 {
    public static void main(String[] args) {

    }

    //翻转树
//    递归 前序遍历
    class Solution {
        TreeNode node = new TreeNode();
        public TreeNode invertTree(TreeNode root) {
            if (root != null) {
                node = root.left;
                root.left = root.right;
                root.right = node;
                invertTree(root.left);
                invertTree(root.right);
            }
            return root;
        }
    }
}
