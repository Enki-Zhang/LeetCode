package tree.norecursion;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_94 {
    public static void main(String[] args) {
    }

    //非递归中序遍历 右中左
    class Solution {
        ArrayList<Integer> treeNodes = new ArrayList<>();

        public List<Integer> inorderTraversal(TreeNode root) {
            Stack<TreeNode> stack = new Stack<>();
            ArrayList<Integer> integers = new ArrayList<>();
            if (root != null)
                stack.push(root);
            while (!stack.isEmpty()) {
                TreeNode peek = stack.peek();
                if (peek != null) {
                    stack.pop();
                    if (peek.right != null) stack.push(peek.right);
                    stack.push(peek);
                    stack.push(null);
                    if (peek.left != null) stack.push(peek.left);
                } else {
                    stack.pop();
                    TreeNode pop = stack.pop();
                    integers.add(pop.val);
                }

            }
            return integers;
        }
    }
}
