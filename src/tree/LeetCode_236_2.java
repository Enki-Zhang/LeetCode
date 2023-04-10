package tree;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_236_2 {
    public static void main(String[] args) {
    }

    //寻找公共节点
    class Solution {
        //        从当前节点遍历两边 如果出现参数中的两个节点 则当前节点为祖先
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if (root == null) {
                return null;
            }
//找到了 目标节点 返回
            if (root == q || root == p) {
                return root;
            }
            TreeNode L = lowestCommonAncestor(root.left, p, q);
            TreeNode R = lowestCommonAncestor(root.right, p, q);
            if (L == null && R == null) {
                return null;
            } else if (L != null && R == null) {
                return L;
            } else if (L == null && R != null) {
                return R;
            } else return root;
        }
    }
}
