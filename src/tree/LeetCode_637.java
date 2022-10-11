package tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_637 {
    public static void main(String[] args) {


    }

    //    每层节点的平均值
    class Solution {
        public List<Double> averageOfLevels(TreeNode root) {
            Queue<TreeNode> queue = new LinkedList<>();
            LinkedList<Double> list = new LinkedList<>();
            if (root == null) {
                return new LinkedList<Double>();
            }
            queue.add(root);
            list.add((double) root.val);
            while (!queue.isEmpty()) {
                double x = 0;
                int size = queue.size();
                int currentSize = 0;

//                遍历一层节点
                for (int i = 0; i < size; i++) {
//                  由size控制将每一层的根节点取出来
                    TreeNode poll = queue.poll();
                    if (poll.left != null) {
                        queue.add(poll.left);
                        x += poll.left.val;
                        currentSize++;
                    }
                    if (poll.right != null) {
                        queue.add(poll.right);
                        x += poll.right.val;
                        currentSize++;
                    }
                }
                if (currentSize != 0) {
                    double result = x / currentSize;
                    list.add(result);
                }


            }

            return list;
        }
    }
}
