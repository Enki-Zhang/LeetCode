package tree;

import java.util.*;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_98 {
    public static void main(String[] args) {
    }

    //    98. 验证二叉搜索树
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
}
