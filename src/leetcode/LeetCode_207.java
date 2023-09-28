package leetcode;

import java.util.*;

/**
 * @author Enki
 * @ClassName LeetCode_207
 * @Description: TODO
 * @Date 2023/8/16 8:28
 * @Version 1.0
 */
public class LeetCode_207 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] ints = {{1, 0}};
        System.out.println(solution.canFinish(2, ints));

    }

    /**
     * 课程表选择 拓扑排序和广度遍历
     * 根据图论 当前可以选择的课程的入度为0 则其没有先决条件 否则不能选择 只有将前一个课程修完 即使得当下课程的入度为0 才能够选择
     */
    static class Solution {
        public boolean canFinish(int numCourses, int[][] prerequisites) {
//            初始化课程的入度
            Map<Integer, Integer> classInDegree = new HashMap<>();
            for (int i = 0; i < numCourses; i++) {
                classInDegree.put(i, 0);// 假设初始化课程的入度全为0
            }
//            初始化依赖关系 更新每个课程的入度
            HashMap<Integer, List<Integer>> map = new HashMap<>();
            for (int[] pre :
                    prerequisites) {
                int curClass = pre[0];
                int preClass = pre[1];
//                更新每个节点的入度
                classInDegree.put(preClass, classInDegree.get(preClass) + 1);
//                节点的邻接表
                if (!map.containsKey(curClass)) {
//                    新节点
                    map.put(curClass, new ArrayList<>());
                }
                map.get(curClass).add(preClass);
            }
//            BFS
            Queue<Integer> queue = new LinkedList<>();
//            将入度为0的节点放入到队列中用于遍历
            Set<Integer> keySet = classInDegree.keySet();
            for (int key :
                    keySet) {
                if (classInDegree.get(key) == 0) {
                    queue.offer(key);
                }
            }
//            依次去除队列元素 进行遍历
            while (!queue.isEmpty()) {
//                取出对头元素
                int cur = queue.poll();
                if (!map.containsKey(cur)) {
                    continue;
                }
//                遍历当前元素的前驱节点 前驱课程去掉 当前节点的入度减1
                List<Integer> list = map.get(cur);
                for (int pr :
                        list) {
                    classInDegree.put(pr, classInDegree.get(pr) - 1);
                    if (classInDegree.get(pr) == 0) {
                        queue.offer(pr);
                    }
                }

            }
            for (int a :
                    classInDegree.keySet()) {
                if (classInDegree.get(a) != 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
