package tree;

import java.util.*;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_501 {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);


    }

    //501. 二叉搜索树中的众数
    class Solution {
        HashMap<Integer, Integer> map = new HashMap<>();

        public int[] findMode(TreeNode root) {
            ArrayList<Integer> integers = new ArrayList<>();
            inorderTree(root);
            ArrayList<Map.Entry<Integer, Integer>> entries = new ArrayList<>(map.entrySet());
            entries.sort((o1, o2) -> o2.getValue() - o1.getValue());
//            for (Map.Entry<Integer, Integer> entry:
//            entries){
//                if (entry.getValue().equals(value)){
//                    integers.add(entry.getKey());
//                }
//            }
            Integer value = entries.get(0).getValue();
            integers.add(entries.get(0).getKey());
            for (int i = 1; i < entries.size(); i++) {
                if (entries.get(i).getValue().equals(value)) {
                    integers.add(entries.get(i).getKey());
                }
            }

            return integers.stream().mapToInt(Integer::intValue).toArray();
        }

        public void inorderTree(TreeNode treeNode) {
            if (treeNode == null) {
                return;
            }
            inorderTree(treeNode.left);
            if (map.containsKey(treeNode.val)) {
                map.put(treeNode.val, map.get(treeNode.val) + 1);
            } else map.put(treeNode.val, 1);
            inorderTree(treeNode.right);
        }

    }
}
