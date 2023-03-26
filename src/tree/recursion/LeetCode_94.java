package tree.recursion;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_94 {
    public static void main(String[] args) {

    }

    class Solution {
        ArrayList<Integer> treeNodes = new ArrayList<>();

        public List<Integer> inorderTraversal(TreeNode root) {
            if (root != null) {
                inorderTraversal(root.left);
                treeNodes.add(root.val);
                inorderTraversal(root.right);
            }
            return treeNodes;

        }
    }
}
