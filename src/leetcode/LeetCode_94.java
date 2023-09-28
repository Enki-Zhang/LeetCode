package leetcode;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Enki
 * @ClassName LeetCode_94
 * @Description: TODO
 * @Date 2023/9/6 9:49
 * @Version 1.0
 */
public class LeetCode_94 {
    public static void main(String[] args) {

    }

    class Solution {
        List<Integer> list = new ArrayList<>();

        public List<Integer> inorderTraversal(TreeNode root) {
            if (root==null){
                return new ArrayList<>();
            }
            midOrderTraversal(root);
            return list;

        }

        public void midOrderTraversal(TreeNode node) {
            if (node.left != null) {
                midOrderTraversal(node.left);
            }
            list.add(node.val);
            if (node.right != null) {
                midOrderTraversal(node.right);

            }

        }
    }
}
