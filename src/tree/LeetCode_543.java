package tree;

import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_543 {
    public static void main(String[] args) {

    }

    //    最大直径 为每个节点左右子树的最大深度之和
    class Solution {
//        记录最大值
        int max = 0;

        public int diameterOfBinaryTree(TreeNode root) {
            traverse(root);
            return max;

        }

        public void traverse(TreeNode root) {
            //            遍历每个节点 拿到对应的值
            if (root != null) {
                int L = maxTree(root.left);
                int R = maxTree(root.right);
                int len = L + R;
                max = Math.max(max, len);
                traverse(root.left);
                traverse(root.right);
            }
        }

        public int maxTree(TreeNode root) {
            if (root != null) {
                int i = maxTree(root.left);
                int i1 = maxTree(root.right);
                return Math.max(i, i1) + 1;
            }
            return 0;
        }
    }
}
