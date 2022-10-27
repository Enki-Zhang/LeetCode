package tree;

import java.util.LinkedList;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_404 {
    public static void main(String[] args) {

    }

    //给定二叉树的根节点 root ，返回所有左叶子之和
    class Solution {


        public int sumOfLeftLeaves(TreeNode root) {
            int result = 0;
            if (root == null||(root.left==null&&root.right==null)) {
                return 0;
            }
            leftNode(root, root, result);
            return result;
        }

        public void leftNode(TreeNode root, TreeNode node, int result) {
            if (root == null) {
                return;
            }
//            if (root.left!=null&&root.left.left==null&&root.left.right==null){
//                result+=root.left.val;
//            }
            if (node.left.equals(root)  && root.left == null && root.right == null) {
                result += root.val;
            }
            leftNode(root.left, root, result);
            leftNode(root.right, root, result);
        }
    }
}
