package tree;

import javax.swing.text.html.HTMLDocument;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_429 {
    public static void main(String[] args) {

    }

    static class Node {
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

    /***
     * 重点在于 用队列取出当前层 并用size记录当前层的节点数 并防止取到下层节点
     */
    static class Solution {
        public static List<List<Integer>> levelOrder(Node root) {
            Queue<Node> queue = new LinkedList<>();//存取当前层的根节点
            List<Integer> list = new LinkedList<>();//存储一层节点的值
            List<List<Integer>> lists = new LinkedList<>();
            List<Node> nodes = new LinkedList<>();
            if (root == null) {//排除空树的情况
                return new LinkedList<>();
            }
            queue.add(root);//节点入队列
            list.add(root.val);
            lists.add(list);
            while (!queue.isEmpty()) {//取出当层节点
                int size = queue.size();//控制取出的节点数目 防止取到下一层
                LinkedList<Integer> list1 = new LinkedList<>();
                for (int i = 0; i < size; i++) {//从当层节点 放入下一层子节点
                    Node poll = queue.poll();//取出当层节点
                    if (poll.children != null) {//子节点存在
                        nodes = poll.children;
                        for (int j = 0; j < nodes.size(); j++) {//将下一层节点放入队列中 同时访问节点
                            queue.add(nodes.get(j));
                            list1.add(nodes.get(j).val);
                        }
                    }
                }
                if (!list1.isEmpty()) {//防止录入空节点
                    lists.add(list1);
                }
            }
            return lists;
        }
    }
}
