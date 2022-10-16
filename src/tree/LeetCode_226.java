package tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

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

        //        非递归遍历
        public TreeNode noinvertTree(TreeNode root) {
            Stack<TreeNode> stack = new Stack<>();
            TreeNode node = root;
            while (!stack.isEmpty() || node != null) {
                if (node != null) {
                    stack.add(node);
                    node = node.left;
                }
                else {
                    TreeNode pop = stack.pop();
//                    交换节点
                    TreeNode treeNode = new TreeNode();
                    treeNode = pop.left;
                    pop.left = pop.right;
                    pop.right = treeNode;
                    if (pop.left!=null){
                        node = pop.left;
                    }
                }
            }
            return root;
        }


    }
}
