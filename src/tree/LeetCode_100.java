package tree;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_100 {
    public static void main(String[] args) {
    }
//判断两颗树相同
    class Solution {
        Boolean sameTree = true;
        Boolean sameTree1 = true;

        public boolean isSameTree(TreeNode p, TreeNode q) {
            if (p != null && q == null || p == null && q != null) {
                return false;
            }
            if (p != null && q != null) {
                if (p.val != q.val) {
                    return false;
                }
                sameTree = isSameTree(p.left, q.left);
                sameTree1 = isSameTree(p.right, q.right);
            }
            return sameTree && sameTree1;

        }
    }
}
