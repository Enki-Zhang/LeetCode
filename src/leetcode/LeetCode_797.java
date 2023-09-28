package leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Enki
 * @ClassName LeetCode_797
 * @Description: TODO
 * @Date 2023/8/16 9:31
 * @Version 1.0
 */
public class LeetCode_797 {
    public static void main(String[] args) {

    }

    /**
     * 深度遍历搜索路径 类似回溯
     */
    class Solution {
        List<List<Integer>> lists = new LinkedList<>();
        List<Integer> list = new LinkedList<>();

        public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
            list.add(0);
            back(graph, 0);
            return lists;
        }

        /**
         * @param graph 图节点 保存了第i个节点可以访问到的节点
         * @param x     目前遍历的节点
         */
        private void back(int[][] graph, int x) {
//            收集终点 当前节点到达最后一个节点
            if (x == graph.length - 1) {
                lists.add(new LinkedList<>(list));
                return;
            }
            for (int a :
                    graph[x]) {
                list.add(a);
                back(graph,a);
                list.remove(list.size()-1);
            }
        }
    }
}
