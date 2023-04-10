package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_102_2 {
    public static void main(String[] args) {

    }

    //    层序遍历 队列模拟
    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            Queue<TreeNode> queue = new LinkedList<>();
            ArrayList<List<Integer>> lists = new ArrayList<>();
            if (root != null) {
                queue.add(root);
            }
            while (!queue.isEmpty()) {
                int size = queue.size();
                ArrayList<Integer> integer = new ArrayList<>();
                while (size > 0) {
                    TreeNode poll = queue.poll();
                    integer.add(poll.val);
                    size -= 1;
                    if (poll.left != null) {
                        queue.add(poll.left);
                    }
                    if (poll.right != null) {
                        queue.add(poll.right);
                    }
                }
                lists.add(integer);
            }
            return lists;

        }
    }
}
