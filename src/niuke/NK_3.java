package niuke;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Enki
 * @ClassName NK_3
 * @Description: TODO
 * @Date 2023/9/9 15:58
 * @Version 1.0
 */
public class NK_3 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ConcurrentHashMap<Integer, String> integerStringConcurrentHashMap = new ConcurrentHashMap<>();


    }

    public static class Solution {

        /**
         * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
         * 层序遍历
         *
         * @param pRoot TreeNode类
         * @return int整型ArrayList<ArrayList <>>
         */
        public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
          
            if (pRoot == null) {
                return new ArrayList<>();
            }
            ArrayList<Integer> list = new ArrayList<>();
            ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(pRoot);
            list.add(pRoot.val);
            lists.add(new ArrayList<>(list));
            while (!queue.isEmpty()) {
                list.clear();
                int size = queue.size();
                while (size > 0) {
                    TreeNode peek = queue.poll();
                    size--;
                    if (peek.left != null) {
                        queue.add(peek.left);
                        list.add(peek.left.val);
                    }
                    if (peek.right != null) {
                        queue.add(peek.right);
                        list.add(peek.right.val);
                    }
                }
                if (size == 0 && list.size() != 0) {
                    lists.add(new ArrayList<>(list));
                }
            }
            System.out.println(lists);
            return lists;
        }
    }
}
