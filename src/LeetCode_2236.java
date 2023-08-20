import tree.TreeNode;

/**
 * @author Enki
 * @ClassName LeetCode_2236
 * @Description: TODO
 * @Date 2023/8/20 9:15
 * @Version 1.0
 */
public class LeetCode_2236 {
    public static void main(String[] args) {

    }

    /**
     *
     */
    class Solution {
        public boolean checkTree(TreeNode root) {

            return root.val == root.left.val + root.right.val;

        }
    }
}
