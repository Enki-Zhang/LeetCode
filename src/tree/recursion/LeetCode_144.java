package tree.recursion;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_144 {
    public static void main(String[] args) {

    }

    //    递归
    class Solution {
        ArrayList<Integer> treeNodes = new ArrayList<>();

        public List<Integer> preorderTraversal(TreeNode root) {
            if (root != null) {
                treeNodes.add(root.val);
                preorderTraversal(root.left);
                preorderTraversal(root.right);
            }
            return treeNodes;
        }
    }


}



