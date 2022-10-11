package tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_104 {
    public static void main(String[] args) {
    }
//层序遍历最大深度
    class Solution {
        public int maxDepth(TreeNode root) {
            Queue<TreeNode> queue = new LinkedList<>();
            int deep = 0;
            if (root == null) {
                return deep;
            }
            queue.add(root);
            while (!queue.isEmpty()){
                int size = queue.size();
                deep++;
                for (int i =0;i<size;i++){
                    TreeNode poll = queue.poll();
                    if(poll.left!=null){
                        queue.add(poll.left);
                    }
                    if (poll.right!=null){
                        queue.add(poll.right);
                    }
                }
            }
            return deep;
        }
    }
}
