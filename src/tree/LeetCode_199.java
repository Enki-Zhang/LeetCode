package tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_199 {
    public static void main(String[] args) {
    }

    class Solution {
        public List<Integer> rightSideView(TreeNode root) {
            Queue<TreeNode> queue = new LinkedList<>();
            List<Integer> list = new LinkedList<>();
            if (root == null) {
                return new LinkedList<>();
            }
//            list.add(root.val);
            queue.add(root);
            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    TreeNode poll = queue.poll();
//                    找到最右边的节点添加
                    if (i == size - 1) {
                        list.add(poll.val);
                    }
                    if (poll.left != null) {
                        queue.add(poll.left);
                    }
                    if (poll.right != null) {
                        queue.add(poll.right);
                    }
                }
            }
            return list;
        }
    }
}
