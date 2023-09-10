import tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Enki
 * @ClassName LeetCode_230
 * @Description: TODO
 * @Date 2023/9/6 9:41
 * @Version 1.0
 */
public class LeetCode_230 {
    public static void main(String[] args) {
        Solution solution = new Solution();

    }

    /**
     *
     */
    static class Solution {
        List<Integer> list = new ArrayList<>();

        public int kthSmallest(TreeNode root, int k) {
            midOrderTraversal(root);
            System.out.println(list);
            return list.get(k - 1);
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
