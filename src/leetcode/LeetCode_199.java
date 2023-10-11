package leetcode;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Enki
 * @ClassName LeetCode_199
 * @Description: TODO
 * @Date 2023/10/11 11:14
 * @Version 1.0
 */
public class LeetCode_199 {
    /**
     * 二叉树右视图 层序遍历 将最后的节点保存
     */
    class Solution {
        public List<Integer> rightSideView(TreeNode root) {
            Queue<TreeNode> queue = new LinkedList<>();
            ArrayList<Integer> list = new ArrayList<>();//保存遍历的队列
//            判断是否是空树
            if (root == null) {
                return new ArrayList<>();
            }
//            根节点入队
            queue.add(root);
            while (!queue.isEmpty()) {//判断队列中是否是空
//                记录每层的节点的数量
                int size = queue.size();
//                遍历每层节点记录每层的数量
                for (int i = 0; i < size; i++) {
                    TreeNode poll = queue.poll();
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
