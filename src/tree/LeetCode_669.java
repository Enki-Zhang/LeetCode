package tree;

import javafx.scene.shape.ArcTo;

import java.awt.*;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_669 {
    public static void main(String[] args) {

    }

    //    修剪二叉搜索树 二叉树删除节点
    class Solution {
        TreeNode node;
        public TreeNode trimBST(TreeNode root, int low, int high) {
            if (root == null) {
                return null;
            }
            if (root.val <= low) {
                return trimBST(root.right, low, high);
            }
            if (root.val >= high) {
//                跳过该节点
                return trimBST(root.left, low, high);
            }
            root.left = trimBST(root.left, low, high);
            root.right = trimBST(root.right, low, high);
            return root;
        }

    }
}
