package tree;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_108 {
    public static void main(String[] args) {

    }

    //升序序列构造二叉搜索树 取出中间元素 难点在于左右开闭
    class Solution {
        public TreeNode sortedArrayToBST(int[] nums) {
            return buildBST(nums, 0, nums.length - 1);
        }

        //构造二叉搜索树
        public TreeNode buildBST(int[] nums, int left, int right) {
            if (left >= right) {
                return null;
            }
            if (right - left == 1) {
                return new TreeNode(nums[left]);
            }
            int middle = left + (right - left) / 2;
            TreeNode root = new TreeNode(nums[middle]);
            root.left = buildBST(nums, left, middle);
            root.right = buildBST(nums, middle + 1, right);
            return root;
        }
    }
}
