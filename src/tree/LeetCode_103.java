package tree;

import java.util.*;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_103 {
    public static void main(String[] args) {
    }

    /**
     * 锯状型层序遍历 先层序遍历 后将lists中偶数位倒序输出
     */
    class Solution {
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
//            层序遍历 queue
            Queue<TreeNode> queue = new LinkedList<>();

//            arraylist 记录
            ArrayList<List<Integer>> lists = new ArrayList<>();
//            记录队列中的数量 = 每一层遍历的终点
            int size = Integer.MIN_VALUE;
//            如果节点存在 首节点入队
            if (root != null) {
                queue.add(root);
            }
//            从队列中弹出元素遍历
            while (!queue.isEmpty()) {
                size = queue.size();
                //            记录每一层的节点
                ArrayList<Integer> integers = new ArrayList<>();
//                当前层是否遍历结束
                while (size > 0) {

//                    弹出当前层节点 将当前节点的孩子入队列
                    TreeNode poll = queue.poll();
                    size--;
//                    将当前节点记录
                    integers.add(poll.val);
                    if (poll.left != null) queue.add(poll.left);
                    if (poll.right != null) queue.add(poll.right);
                }
//                一层遍历结束 记录到lists中
                lists.add(integers);
            }
//            遍历结束 遍历lists
            Iterator<List<Integer>> iterator = lists.iterator();
            ArrayList<List<Integer>> lists1 = new ArrayList<>();
            int i = 1;//记录层数
            while (iterator.hasNext()) {
                List<Integer> next = iterator.next();
                if (i % 2 == 0) {
                    ArrayList<Integer> integers1 = new ArrayList<>();
                    for (int j = next.size() - 1; j >= 0; j--) {
                        integers1.add(next.get(j));
                    }
                    lists1.add(integers1);
                } else {
                    lists1.add(next);
                }
                i++;
            }
            return lists1;
        }
    }
}
