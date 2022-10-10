package tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_107 {
    public static void main(String[] args) {


    }

    class Solution {
        /**
         * 从底向上层序遍历
         *
         * @param root
         * @return
         */
        public List<List<Integer>> levelOrderBottom(TreeNode root) {
            LinkedList<List<Integer>> lists = new LinkedList<>();
//            队列记录一层中的根节点
            Queue<TreeNode> queue = new LinkedList<>();
            Stack<List<Integer>> stack = new Stack<>();
            TreeNode treeNode = root;
            LinkedList<Integer> list = new LinkedList<>();
            if (treeNode == null) {
                return new LinkedList<>();
            }
            queue.add(treeNode);
//                stack.push(treeNode);
            list.add(treeNode.val);
            stack.add(list);
            while (!queue.isEmpty()) {
                int size = queue.size();//当前层节点的个数
                LinkedList<Integer> list1 = new LinkedList<>();
                //                取出当前层的节点
                for (int i = 0; i < size; i++) {
                    TreeNode poll = queue.poll();
                    if (poll.left != null) {
                        queue.add(poll.left);
                        list1.add(poll.left.val);
                    }
                    if (poll.right != null) {
                        queue.add(poll.right);
                        list1.add(poll.right.val);
                    }
                }
                if (!list1.isEmpty()) {
                    stack.add(list1);
                }
            }
//            将stack中的记录出栈 从底到上遍历
            while (!stack.isEmpty()) {
                lists.add(stack.pop());
            }
            return lists;
        }
    }
}
