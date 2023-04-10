package tree.norecursion;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_145 {
    public static void main(String[] args) {
    }

    //中右左
    class Solution {
        public List<Integer> postorderTraversal(TreeNode root) {
            ArrayList<Integer> integers = new ArrayList<>();
            Stack<TreeNode> stack = new Stack<>();
            if (root != null)
                stack.push(root);
            while (!stack.isEmpty()) {
                TreeNode peek = stack.peek();
                if (peek != null) {
                    stack.pop();
                    stack.push(peek);
                    stack.push(null);
                    if (peek.right != null) stack.push(peek.right);
                    if (peek.left != null) stack.push(peek.left);


                }else {
                    stack.pop();
                    TreeNode pop = stack.pop();
                    integers.add(pop.val);
                }
            }
            return integers;

        }
    }
}
