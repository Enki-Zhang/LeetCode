package tree;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_556_2 {
    public static void main(String[] args) {

    }

    class Solution {


        public int maxDepth(Node root) {
            if (root == null) {
                return 0;
            }
            if (root.getChildren().isEmpty()) {
                return 1;
            }
            int deep = 0;
            if (root != null) {
                for (Node child :
                        root.getChildren()) {
                    deep = Math.max(deep, maxDepth(child));
                }
            }
            return deep + 1;
        }
    }
}
