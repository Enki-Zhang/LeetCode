package tree.norecursion;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_144 {
    public static void main(String[] args) {

    }

    //前序遍历 右左中
    class Solution {
        ArrayList<Integer> treeNodes = new ArrayList<>();

        public List<Integer> preorderTraversal(TreeNode root) {
            Stack<TreeNode> stack = new Stack<>();
            ArrayList<Integer> integers = new ArrayList<>();
            stack.push(root);
            while (!stack.isEmpty()) {
                TreeNode peek = stack.peek();
                if (peek != null) {
                    stack.pop();
                    if (peek.right != null) stack.push(peek.right);
                    if (peek.left != null) stack.push(peek.left);
                    stack.push(peek);
                    stack.push(null);
                } else {
                    stack.pop();
                    TreeNode peek1 = stack.peek();
                    stack.pop();
                    integers.add(peek1.val);
                }

            }
            return integers;

        }
    }
}
