package leetcode;

import java.util.*;

/**
 * @author Enki
 * @ClassName LeetCode_210
 * @Description: TODO
 * @Date 2023/8/17 9:02
 * @Version 1.0
 */
public class LeetCode_210 {
    public static void main(String[] args) {

    }

    /**
     * 课程表2 拓扑排序和广度遍历 将每个节点的入读为0的节点进行遍历 当遍历之后
     * 重点在构造邻接表保存后继 保存当前节点
     */
    class Solution {
        public int[] findOrder(int numCourses, int[][] prerequisites) {
//            构造每个节点 保存入度为0 的节点
            HashMap<Integer, Integer> inEdges = new HashMap<>();
            for (int i = 0; i < numCourses; i++) {
                inEdges.put(i, 0);
            }
//            更新入度
            HashMap<Integer, List<Integer>> map = new HashMap<>();//节点的邻接表
            for (int[] in :
                    prerequisites) {
                int cur = in[0];
                int pre = in[1];
//                入度
                inEdges.put(cur, inEdges.get(pre) + 1);
//                邻接表
                if (!map.containsKey(cur)) {
                    map.put(cur, new ArrayList<>());
                }
                map.get(cur).add(pre);
//                从入度为0的开始遍历 遍历后将当前节点入度-1
                Queue<Integer> queue = new LinkedList<>();
                Set<Integer> keySet = inEdges.keySet();
//                将入度为0的节点取出 并开始遍历
                for (Integer next : keySet) {
                    if (inEdges.get(next) == 0) {
                        queue.add(next);
                    }
                }
//                BFS
                while (!queue.isEmpty()) {
//                    取出对头
                    Integer poll = queue.poll();
//                    对邻接节点遍历
                    if (!map.containsKey(poll)) {
                        continue;
                    }
                    List<Integer> list = map.get(poll);
                    for (int a :
                            list) {
                        inEdges.put(a, inEdges.get(a) - 1);
                        if (inEdges.get(a) == 0) {
                            queue.offer(a);
                        }
                    }
                }
//TODO
                return null;
            }

            return null;
        }
    }
}
