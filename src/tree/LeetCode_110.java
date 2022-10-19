package tree;

import java.nio.IntBuffer;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_110 {
    public static void main(String[] args) {
    }

    class Solution {
        int L = 0;
        int R = 0;
        boolean balanced1 =true;
        boolean balanced =true;
        //        后序遍历 判断左右子树的深度
        public boolean isBalanced(TreeNode root) {
            if (root != null) {
                 balanced1 = isBalanced(root.left);
                 balanced = isBalanced(root.right);
                    L = deep(root.left);
                    R = deep(root.right);
                if (Math.abs(R-L)>1) {
                    return false;
                }
            }
            return balanced1 && balanced;

        }

        //求树的深度
        public int deep(TreeNode root) {
            if (root != null) {
                int L = deep(root.left);
                int R = deep(root.right);
                return Math.max(L, R) + 1;
            }
            return 0;
        }
    }
}
