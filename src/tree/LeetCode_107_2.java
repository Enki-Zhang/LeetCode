package tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_107_2 {
    public static void main(String[] args) {
    }

    //层序排序
    class Solution {
        public List<List<Integer>> levelOrderBottom(TreeNode root) {
            Stack<TreeNode> stack = new Stack<>();
            ArrayList<List<Integer>> lists = new ArrayList<>();
            if (root != null) {
                stack.push(root);
            }
            while (!stack.isEmpty()) {
                int size = stack.size();
                ArrayList<Integer> integers = new ArrayList<>();
                while (size > 0) {
                    TreeNode peek = stack.peek();
                    stack.pop();
                    integers.add(peek.val);
                    size--;
                    if (peek.left != null) stack.push(peek.left);
                    if (peek.right != null) stack.push(peek.right);

                }
                lists.add(integers);
            }
            ArrayList<List<Integer>> lists2 = new ArrayList<>();
            for (int i = lists.size() - 1; i >= 0; i--) {
                lists2.add(lists.get(i));
            }

            return lists2;


        }
    }
}
