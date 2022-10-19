package tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_116 {
    public static void main(String[] args) {
    }

    static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    class Solution {
        public Node connect(Node root) {
//层序遍历 每个节点
            Queue<Node> queue = new LinkedList<>();//输入
            if (root == null) {
                return null;
            }
            queue.add(root);
            while (!queue.isEmpty()) {
//                每一层节点的事务
                int size = queue.size();
//如何连接兄弟节点
                for (int i = 0; i < size; i++) {
                    Node poll = queue.poll();//每一层的兄弟节点
                    if (i < size - 1) {//确保连接的是一层中的节点size-1为一层的节点数目 i<size会连接到子节点
                        poll.next = queue.peek();
                    } else poll.next = null;

                    if (poll.left != null) {
                        queue.add(poll.left);
                    }
                    if (poll.right != null) {
                        queue.add(poll.right);
                    }
                }
            }
            return root;
        }

        //        多叉树递归遍历
        public Node connect_(Node root) {
//            前序遍历 自顶向下 前面的节点都处理好了
            if (root != null) {
                if (root.left != null) {
                    root.left.next = root.right;
                }
                if (root.next != null && root.right != null) {
                    root.right.next = root.next.left;
                }
                connect_(root.left);
                connect_(root.right);
            }
            return root;
        }
    }
}
