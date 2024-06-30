package leetcode;

import tree.TreeNode;

import java.util.*;

/**
 * @author Enki
 * @ClassName LeetCode_102
 * @Description: TODO
 * @Date 2023/9/22 11:07
 * @Version 1.0
 */
public class LeetCode_102 {
    public static void main(String[] args) {

    }

    /**
     * 层序遍历非递归
     */
    class Solution2 {
        public List<List<Integer>> levelOrder(TreeNode root) {
            if (root == null) {
                return new ArrayList<>();
            }
            List<List<Integer>> res = new ArrayList<>();

            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            res.add(new ArrayList<>(root.val));
            while (!queue.isEmpty()) {
                List<Integer> list = new ArrayList<>();
                int size = queue.size();
                while (size > 0) {
                    TreeNode poll = queue.poll();
                    list.add(poll.val);
                    size--;
                    if (poll.left != null) {
                        queue.add(poll.left);
                    }
                    if (poll.right != null) {
                        queue.add(poll.right);
                    }
                }
                if (size == 0) {
                    res.add(new ArrayList<>(list));
                }

            }
            return res;
        }
    }

    /**
     * 非递归
     */
    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            Queue<TreeNode> queue = new LinkedList<>();

            List<List<Integer>> lists = new ArrayList<>();
            if (root == null) {
                return lists;
            }
            queue.add(root);
            while (!queue.isEmpty()) {
                int size = queue.size();
                ArrayList<Integer> list = new ArrayList<>();
                while (size != 0) {
                    TreeNode poll = queue.poll();
                    size--;
                    list.add(poll.val);
                    if (poll.left != null) {
                        queue.add(poll.left);
                    }
                    if (poll.right != null) {
                        queue.add(poll.right);
                    }
                }
                lists.add(new ArrayList<>(list));
            }
            return lists;
        }


    }
}
