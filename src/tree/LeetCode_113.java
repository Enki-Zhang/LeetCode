package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_113 {
    public static void main(String[] args) {

    }

    class Solution {
        List<List<Integer>> tar = new LinkedList<>();
        List<List<Integer>> tar01 = new LinkedList<>();

        public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
            LinkedList<Integer> list = new LinkedList<>();
            path(root, targetSum, list);
            return tar;
        }

        public void path(TreeNode root, int target, LinkedList<Integer> list) {
            if (root == null) {
                return;
            }
            list.add(root.val);
            if (root.left == null && root.right == null && target == root.val) {
                tar.add(new LinkedList<>(list));//遍历到叶子 包装新的列表加入 防止回溯时候list改变
                return;
            }
//            if (root.left == null && root.right == null && target != root.val) {
//                list.removeLast();
//            }
            if (root.left != null) {
                path(root.left, target - root.val, list);
                list.removeLast();
            }
            if (root.right != null) {
                path(root.right, target - root.val, list);
                list.removeLast();
            }


        }

    }
}
