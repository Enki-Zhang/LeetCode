package tree;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_222 {
    public static void main(String[] args) {

    }

    class Solution {
        int count=0;
        //        递归遍历求节点个数
        public int countNodes(TreeNode root) {
            if (root!=null)
            {
                countNodes(root.left);
                countNodes(root.right);
                count++;
            }
            return count;
        }
    }
}
