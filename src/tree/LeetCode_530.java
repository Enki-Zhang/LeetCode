package tree;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_530 {
    public static void main(String[] args) {

    }

    //    返回树中节点间的最小差值
    class Solution {
        int min = Integer.MAX_VALUE;
        int abs = Integer.MAX_VALUE;
        TreeNode node;

        public int getMinimumDifference(TreeNode root) {
            if (root != null) {
                getMinimumDifference(root.left);
                if (node != null) {
                    abs = Math.abs(node.val - root.val);
                    min = Math.min(min, abs);
                }
                node = root;//记录前节点 相当于链表的pre指针 
                getMinimumDifference(root.right);
                return min;
            }
            return Integer.MAX_VALUE;
        }
    }
}
