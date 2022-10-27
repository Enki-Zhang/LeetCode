package tree;

import java.nio.IntBuffer;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_257 {
    public static void main(String[] args) {
    }

    class Solution {
        //        返回从根节点到叶子节点的路径 前序遍历节点顺序不变


        public List<String> binaryTreePaths(TreeNode root) {
            LinkedList<String> lists = new LinkedList<>();
            LinkedList<Integer> list = new LinkedList<>();
            if (root == null) {
                return lists;
            }
            preNode(root, list, lists);
            return lists;
        }

        public void preNode(TreeNode root, LinkedList<Integer> path, List<String> result) {
            path.add(root.val);
//            叶子节点 一条路径记录完毕
            if (root.left == null && root.right == null) {
                StringBuilder pathNode = new StringBuilder();
                for (int i = 0; i < path.size() - 1; i++) {
                    pathNode.append(path.get(i));
                    pathNode.append("->");
                }
                pathNode.append(path.get(path.size() - 1));
                result.add(pathNode.toString());
            }
            if (root.left != null) {
                preNode(root.left, path, result);
                path.remove(path.size() - 1);//回溯 将叶子节点删除 加入新的叶子节点在入result
            }
            if (root.right != null) {
                preNode(root.right, path, result);
                path.remove(path.size() - 1);
            }


        }
    }
}
