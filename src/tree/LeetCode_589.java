package tree;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_589 {
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

    //    589. N 叉树的前序遍历
    class Solution {
      List<Integer> list =new LinkedList<>();
        public List<Integer> preorder(Node root) {
            if (root != null) {
                list.add(root.val);
                if (!root.children.isEmpty()){
                    Iterator<Node> iterator = root.children.iterator();
                    while (iterator.hasNext()) {
                        Node next = iterator.next();
                        preorder(next);
                    }
                }
            }
            return list;
        }
    }
}
