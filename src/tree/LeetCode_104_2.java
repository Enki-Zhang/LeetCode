package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_104_2 {
    public static void main(String[] args) {

    }

    /**
     * 层序遍历 计算深度
     */
    class Solution {
        public int maxDepth(TreeNode root) {
            Queue<TreeNode> queue = new LinkedList<>();
            int deep = 0;
            if (root != null) {
                queue.add(root);
                deep++;
            }else {
                return 0;
            }
            while (!queue.isEmpty()) {
                int size = queue.size();
                while (size > 0) {
                    TreeNode poll = queue.poll();
                    size--;
                    if (poll.left != null) queue.add(poll.left);
                    if (poll.right != null) queue.add(poll.right);
                }
                deep++;
            }
            return deep;
        }
    }
}
