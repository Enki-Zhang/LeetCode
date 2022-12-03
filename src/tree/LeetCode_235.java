package tree;

import tree.TreeNode;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_235 {
    public static void main(String[] args) {

    }

    //二叉搜索树 中寻找最近的公共父节点
//    中序遍历二叉树 寻找到p q的非子节点且大小在p q之间的节点
    class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if (root == null) {
                return null;
            }
             if (root.val > p.val && root.val > q.val) {
                TreeNode L = lowestCommonAncestor(root.left, p, q);
                if (L != null) {
                    return L;
                }
            } else if (root.val < p.val && root.val < q.val) {
                TreeNode R = lowestCommonAncestor(root.right, p, q);
                if (R != null) {
                    return R;
                }
            }
             return root;


        }
    }
}
