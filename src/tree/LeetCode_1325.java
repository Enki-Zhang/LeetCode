package tree;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_1325 {
    public static void main(String[] args) {

    }

    class Solution {
        public TreeNode removeLeafNodes(TreeNode root, int target) {
            if (root != null) {
               root.left = removeLeafNodes(root.left, target);
               root.right = removeLeafNodes(root.right, target);
                if (root.val == target&&root.left==null&&root.right==null) {
                    return null;
                }
            }
            return root;

        }
    }
}
