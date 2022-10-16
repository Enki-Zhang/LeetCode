package tree;

import java.util.*;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_111 {
    public static void main(String[] args) {

    }

    //取出二叉树的最小深度
    class Solution {
        public int minDepth(TreeNode root) {
            Queue<TreeNode> queue = new LinkedList<>();
            int deep = 0;
            ArrayList<Integer> integers = new ArrayList<>();
            if (root == null) {
                return deep;
            }
            queue.add(root);
            while (!queue.isEmpty()) {
                int size = queue.size();
                deep++;
//                进入下层子节点
                for (int i = 0; i < size; i++) {
                    TreeNode poll = queue.poll();
                    if (poll.left == null && poll.right == null) {
                        integers.add(deep);
                    }
                    if (poll.left != null) {
                        queue.add(poll.left);
                    }
                    if (poll.right != null) {
                        queue.add(poll.right);
                    }
                }
            }
            return Collections.min(integers);
        }

        //       递归遍历


        public int _minDepth(TreeNode root) {

            if (root != null) {
                int L = _minDepth(root.left);
                int R = _minDepth(root.right);
                return root.left == null || root.right == null ? L + R + 1 : Math.min(R, L) + 1;
            }
            return 0;
        }
    }
}
