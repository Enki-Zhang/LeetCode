package tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_513 {
    public static void main(String[] args) {

    }

    class Solution {
        public int findBottomLeftValue(TreeNode root) {
            int deep = deep(root);

            return 0;
        }

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
