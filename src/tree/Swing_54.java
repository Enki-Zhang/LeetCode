package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Enki
 * @Version 1.0
 */
public class Swing_54 {
    public static void main(String[] args) {
    }

    class Solution {

        ArrayList<Integer> list = new ArrayList<>();
        public int kthLargest(TreeNode root, int k) {
            digui(root);
            Integer integer = list.get(list.size()-k);
            list.forEach(System.out::print);
            return integer;
        }


        public List<Integer> digui(TreeNode root) {
            if (root != null) {
                digui(root.left);
                list.add(root.val);
                digui(root.right);
            }
            return null;
        }
    }
}
