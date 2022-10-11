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

    ;

    static class Solution {
        public static Node connect(Node root) {
            Queue<Integer> queue = new LinkedList<>();
            Node node = new Node();
// 返回空数据
            if (root == null) {
                return new Node();
            }



            return null;
        }
    }
}
