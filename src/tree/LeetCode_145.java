package tree;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_145 {
    public static void main(String[] args) {
    }

    //    后序遍历
    static List<Integer> list = new LinkedList<>();

    class Solution {
        public List<Integer> postorderTraversal(TreeNode root) {
            if (root != null) {
                postorderTraversal(root.left);
                postorderTraversal(root.right);
                list.add(root.val);
            }
            return list;
        }
//后序遍历非递归 将前序遍历的 中左右改为中右左 并翻转list
        public List<Integer> noPostorderTraversal(TreeNode root) {
            List<Integer> list = new LinkedList<>();
            Stack<TreeNode> stack = new Stack<>();
            TreeNode treeNode = root;
            while (treeNode != null|| !stack.isEmpty()) {
                if (treeNode != null) {
                    list.add(treeNode.val);
                    stack.push(treeNode);
                    treeNode = treeNode.right;
                } else {
                    TreeNode pop = stack.pop();
                    if (pop.left != null) {
                        treeNode = pop.left;
                    }
                }
            }
            Collections.reverse(list);


            return list;
        }


    }


}
