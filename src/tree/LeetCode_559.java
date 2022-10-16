package tree;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_559 {
    public static void main(String[] args) {

    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    ;

    //      559. N 叉树的最大深度
    class Solution {
        int deep = 0;

        //        public int maxDepth(Node root) {
//            if (root != null) {
//                if (!root.children.isEmpty()) {
//                    deep++;
//                }
//                Iterator<Node> iterator = root.children.iterator();
//                while (iterator.hasNext()) {
//                    Node next = iterator.next();
//                    maxDepth(next);
//                }
//            }
//            return deep;
//        }
        /*
        层序遍历
         */
        public int maxDepth(Node root) {
            Queue<Node> queue = new LinkedList<>();
            int deep = 0;
            if (root == null) {
                return 0;
            }
            queue.add(root);
            while (!queue.isEmpty()) {
                int size = queue.size();
                deep++;
//                当前层的字节点入队列
                for (int i =0;i<size;i++){
                    Node poll = queue.poll();
                    List<Node> children = poll.children;
                    Iterator<Node> iterator = children.iterator();
                    while (iterator.hasNext()) {
                        Node next = iterator.next();
                        queue.add(next);
                    }
                }
            }
            return deep;


        }
    }
}
