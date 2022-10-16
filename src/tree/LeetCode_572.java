package tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_572 {
    public static void main(String[] args) {
    }

    //572. 另一棵树的子树
    class Solution {

        public boolean isSubtree(TreeNode root, TreeNode subRoot) {
//            非递归遍历
            Queue<Integer> queue = new LinkedList<>();
            Queue<Integer> queueSub = new LinkedList<>();
            Stack<TreeNode> stack = new Stack<>();
            while (!stack.isEmpty() || root != null) {
                if (root != null) {
                    if (root.val != subRoot.val) {
                        queue.add(root.val);

                    }else {

                    }
                }

            }


            return false;
        }

        public List<Integer> tree(TreeNode root, LinkedList<Integer> list) {
            if (root != null) {
                list.add(root.val);
                tree(root.left, list);
                tree(root.right, list);
            }
            return list;
        }
    }
}


