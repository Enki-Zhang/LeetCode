package tree;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_105 {
    public static void main(String[] args) {
    }

    //105. 从前序与中序遍历序列构造二叉树
    class Solution {
        public TreeNode buildTree(int[] preorder, int[] inorder) {
            if (preorder.length==0){
                return new TreeNode();
            }
            return preAndMiddle(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
        }

        /***
         *
         * @param preorder 前序遍历数组
         * @param inorder 中序遍历数组
         * @param pre 前序遍历数组第一个元素下标
         * @param h1 前序遍历数组最后一个下标
         * @param in 中序遍历数组第一个元素下标
         * @param h2 中序遍历数组最后一个元素下标
         * @return 返回root根节点
         */

        public TreeNode preAndMiddle(int[] preorder, int[] inorder, int pre, int h1, int in, int h2) {
            TreeNode root = new TreeNode();
            root.val = preorder[pre];
            int k = in;
            for (; inorder[k] != root.val; k++) ;//在中序遍历中找到根节点位置
            //划分中序数组 左右
            int llen = k - in;
            int rlen = h2 - k;
            if (llen != 0) {
                root.left = preAndMiddle(preorder, inorder, pre + 1, pre + llen, in, in + llen - 1);
            } else root.left = null;
            if (rlen != 0) {
                root.right = preAndMiddle(preorder, inorder, h1 - rlen + 1, h1, h2 - rlen + 1, h2);
            } else root.right = null;
            return root;
        }

    }
}
