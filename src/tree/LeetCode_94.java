package tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_94 {
    public static void main(String[] args) {
    }

    static List<Integer> list = new LinkedList<>();

    //中序遍历 递归
    class Solution {
        public List<Integer> inorderTraversal(TreeNode root) {
            if (root != null) {
                inorderTraversal(root.left);
                list.add(root.val);
                inorderTraversal(root.right);
            }
            return list;
        }

        //    对象 非递归中序遍历
        public List<Integer> noRecursiveTraversal(TreeNode root) {
            List<Integer> list = new LinkedList<>();
            Stack<TreeNode> stack = new Stack<>();
            TreeNode treeNode = root;
            while (treeNode != null || !stack.isEmpty()) {
//               当前节点不为空 向左遍历
                if (treeNode != null) {
                    stack.push(treeNode);
                    treeNode = treeNode.left;
                } else {
                    TreeNode pop = stack.pop();
                    list.add(pop.val);
                    if (pop.right!=null){
                        treeNode = pop.right;
                    }
                }
            }



            return list;
        }
    }


}
