package tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_515 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        System.out.println(queue.size());

    }

    class Solution {
        public List<Integer> largestValues(TreeNode root) {
            Queue<TreeNode> queue = new LinkedList<>();
            List<Integer> list = new LinkedList<>();
            if (root == null) {
                return new LinkedList<>();
            }
            queue.add(root);
//            list.add(root.val);
            while (!queue.isEmpty()) {
                int size = queue.size();
                int max = Integer.MIN_VALUE;
                for (int i = 0; i < size; i++) {
                    TreeNode poll = queue.poll();
//                    只在有节点的情况下判断
                    max=max> poll.val?max:poll.val;
                    if (poll.left != null) {
                        queue.add(poll.left);
//                        max = max > poll.left.val ? max : poll.left.val;
                    }
                    if (poll.right != null) {
                        queue.add(poll.right);
//                        max = max > poll.right.val ? max : poll.right.val;
                    }
                }
//                子节点遍历结束
//                if (max != Integer.MIN_VALUE) {
//                    list.add(max);
//                }
                list.add(max);

            }

            return list;
        }
    }
}
