package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_113_2 {
    public static void main(String[] args) {

    }

    class Solution {
        ArrayList<Integer> arrayList = new ArrayList<>();
        List<List<Integer>> lists = new ArrayList<>();

        public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
            if (root == null) {
                return null;
            }

            if (root.left != null) {
                arrayList.add(root.val);
                pathSum(root.left, targetSum - root.val);
            }
            if (root.right != null) {
                arrayList.add(root.val);
                pathSum(root.right, targetSum - root.val);
            }
            if (root.left == null && root.right == null && targetSum == root.val) {
                lists.add(new ArrayList<>(arrayList));
            }
            return lists;
        }
    }
}
