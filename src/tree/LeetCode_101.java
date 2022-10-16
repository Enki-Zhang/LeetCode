package tree;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_101 {
    public static void main(String[] args) {
    }

    //    对称二叉树
    class Solution {
        List<Integer> list = new LinkedList<>();
        List<Integer> list1 = new LinkedList<>();
        List<Integer> list3 = new LinkedList<>();
        List<Integer> list4 = new LinkedList<>();

        //        左边 中左右 右边 中右左
        public boolean isSymmetric(TreeNode root) {

            if (root != null) {

                list3 = preLeftRight(root.left);
                list4 = preRightLeft(root.right);
            }
            if (!list3.equals(list4)) {
                return false;
            }
            return true;
        }

        public List<Integer> preLeftRight(TreeNode root) {
            if (root == null) {
                list.add(null);
            }
            if (root != null) {
                list.add(root.val);
                preLeftRight(root.left);
                preLeftRight(root.right);
            }
            return list;
        }

        public List<Integer> preRightLeft(TreeNode root) {
            if (root == null) {
                list1.add(null);
            }
            if (root != null) {
                list1.add(root.val);
                preRightLeft(root.right);
                preRightLeft(root.left);

            }
            return list1;
        }
    }
}
