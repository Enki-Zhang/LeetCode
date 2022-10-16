package tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_144 {
    public static void main(String[] args) {
    }

    //    前序遍历
    static List<Integer> list = new LinkedList<>();

    static class Solution {
        public static List<Integer> preorderTraversal(TreeNode root) {
            if (root != null) {
                list.add(root.val);
                preorderTraversal(root.left);
                preorderTraversal(root.right);
            }
            return list;
        }

        //前序遍历非递归
        public List<Integer> noPreorderTraversal(TreeNode root) {
            List<Integer> list = new LinkedList<>();
            Stack<TreeNode> stack = new Stack<>();
            TreeNode treeNode = root;
            while (treeNode != null || !stack.isEmpty()) {
                if (treeNode != null) {//到最左边节点
                    list.add(treeNode.val);
                    stack.push(treeNode);
                    treeNode = treeNode.left;
                } else {
                    TreeNode pop = stack.pop();
                    if (pop.right != null) {
                        treeNode = pop.right;
                    }
                }
            }
            return list;
        }
    }
}
