package tree;

import java.util.LinkedList;
import java.util.Stack;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_114 {
    public static void main(String[] args) {

    }

    class Solution {
        TreeNode node = null;

        public void flatten(TreeNode root) {
            if (root != null) {

                flatten(root.right);
                flatten(root.left);
                root.right = node;
                root.left = null;
                node = root;
            }
            return;

        }
    }
}
