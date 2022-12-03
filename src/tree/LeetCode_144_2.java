package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_144_2 {
    public static void main(String[] args) {


    }
//前序递归
    class Solution {
        List<Integer> list = new ArrayList<>();
        public List<Integer> preorderTraversal(TreeNode root) {
            if (root == null) {
                return new ArrayList<Integer>();//返回值类型要确定
            }
            list.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
            return list;
        }
    }
}
