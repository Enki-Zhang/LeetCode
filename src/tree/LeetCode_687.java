package tree;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_687 {
    public static void main(String[] args) {

    }

    class Solution {
        TreeNode node = new TreeNode();
        int pathL = 0;
        int pathR = 0;
        int max = 0;

        public int longestUnivaluePath(TreeNode root) {
            if (root == null) {
                return 0;
            }
            traverse(root);
            return max;
        }

        //        遍历树
        public int traverse(TreeNode root) {
            if (root != null) {
//                if (root.left != null && root.val == root.left.val) {
//                   int L = traverse(root.left);
//                } else L = 0;
//                if (root.right != null && root.val == root.right.val) {
//                    int R  = traverse(root.right);
//                } else R = 0;
                int leftSize = root.left != null ? traverse(root.left) + 1 : 0;
                int rightSize = root.right != null ? traverse(root.right) + 1 : 0;
                if (root.left!=null&&root.left.val != root.val) {
                    leftSize = 0;
                }
                if (root.right!=null&&root.right.val != root.val) {
                    rightSize = 0;
                }
                max = Math.max(max, leftSize + rightSize);
               return Math.max(leftSize,rightSize);
            }
            return 0;

        }

        //        求左右子树的长度
        public int pathLength(TreeNode root) {
            if (root != null) {
                int L = pathLength(root.left);
                int R = pathLength(root.right);
                return Math.max(L, R) + 1;
            }
            return 0;
        }
    }
}
