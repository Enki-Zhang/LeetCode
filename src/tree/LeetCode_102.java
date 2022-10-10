package tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_102 {
    public static void main(String[] args) {

    }

    //    层序遍历
    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            Queue<TreeNode> queue = new LinkedList<>();
            List<List<Integer>> lists = new LinkedList<>();
            LinkedList<Integer> list = new LinkedList<>();
            TreeNode treeNode = root;
            if (treeNode == null) {
                return new LinkedList<>();
            }
            queue.add(treeNode);
            list.add(treeNode.val);
            lists.add(list);
//获取每一层的节点数目
            while (!queue.isEmpty()) {
                int size = queue.size();//当前层节点的个数
                LinkedList<Integer> list1 = new LinkedList<>();
//                取出当前层的节点
                for (int i = 0; i < size; i++) {
                    TreeNode poll = queue.poll();
                    if (poll.left != null) {
                        queue.add(poll.left);
                        list1.add(poll.left.val);
                    }
                    if (poll.right != null) {
                        queue.add(poll.right);
                        list1.add(poll.right.val);
                    }
                }
                if (!list1.isEmpty()) {
                    lists.add(list1);
                }
            }
            return lists;
        }
    }
}
