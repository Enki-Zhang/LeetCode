package tree.recursion;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_145 {
    public static void main(String[] args) {
    }

    class Solution {
        ArrayList<Integer> treeNodes = new ArrayList<>();

        public List<Integer> postorderTraversal(TreeNode root) {
            if (root != null) {
                postorderTraversal(root.left);
                postorderTraversal(root.right);
                treeNodes.add(root.val);
            }
            return treeNodes;


        }
    }
}
