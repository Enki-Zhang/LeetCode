import tree.TreeNode;

/**
 * @author Enki
 * @ClassName LeetCode_617
 * @Description: TODO
 * @Date 2023/8/14 11:44
 * @Version 1.0
 */
public class LeetCode_617 {
    public static void main(String[] args) {

    }

    /**
     * 合并二叉树 先序遍历两个树
     */
    class Solution {
        public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {

            if (root1 == null)
                return root2;
            if (root2 == null)
                return root1;
            root1.left = mergeTrees(root1.left, root2.left);
            root1.val += root2.val;//root1加上可能有值的节点
            root1.right = mergeTrees(root1.right, root2.right);
            return root1;


        }
    }
}
