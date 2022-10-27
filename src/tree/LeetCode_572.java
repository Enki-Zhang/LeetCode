package tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_572 {
    public static void main(String[] args) {
    }

    //572. 另一棵树的子树
    class Solution {
        List<Integer> pre = new LinkedList<>();
        List<Integer> sub = new LinkedList<>();
        boolean subtree1 = true;
        boolean subtree = true;


        public boolean isSubtree(TreeNode root, TreeNode subRoot) {
            Boolean flage = false;
//            pre = tree(root, pre);
//            sub = tree(subRoot, sub);
            if (pre.equals(sub)) {
                flage = true;
            }
            pre.clear();
            sub.clear();
            if (root.left != null) {


            }
            return false;


        }

        public List<Integer> tree(TreeNode root, LinkedList<Integer> list) {
            if (root != null) {
                list.add(root.val);
                tree(root.left, list);
                tree(root.right, list);
            }
            return list;
        }
    }
}


