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
                    if (poll.right!=null){
                        queue.add(poll.right);
                    }
                }
            }
            return Collections.min(integers);
        }
    }
}
