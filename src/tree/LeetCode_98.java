package tree;

import java.util.*;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_98 {
    public static void main(String[] args) {
    }

    //    98. 验证二叉搜索树  用顺序数组判断搜索树
    class Solution {
        ArrayList<Integer> arrayList = new ArrayList<>();

        public boolean isValidBST(TreeNode root) {
            inorderTree(root);
            ArrayList<Integer> integers = new ArrayList<>();
            Set<Integer> set = new HashSet<>(arrayList);
            if (set.size() != arrayList.size()) {
                return false;
            }
            Iterator<Integer> iterator = arrayList.iterator();
            while (iterator.hasNext()) {
                Integer next = iterator.next();
                integers.add(next);
            }
            Collections.sort(arrayList);
            return arrayList.equals(integers);
        }

        public void inorderTree(TreeNode root) {
            if (root != null) {
                inorderTree(root.left);
                arrayList.add(root.val);
                inorderTree(root.right);
            }
        }
    }

    class Solution_01 {
//        这里不能new TreeNode赋值 new出来的对象不是空值
        TreeNode node ;
        public boolean isValidBST(TreeNode root) {
//            中序遍历BST
            if (root != null) {
                boolean L = isValidBST(root.left);
                if (node!=null&&node.val >= root.val) {
                    return false;
                }
                node = root;
                boolean R = isValidBST(root.right);
                return L && R;
            }
            return true;
        }

    }
}
