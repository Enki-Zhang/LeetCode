package leetCodeBack;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_77_3 {
    public static void main(String[] args) {

    }

    //   组合
    class Solution {
        ArrayList<List<Integer>> lists = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();

        public List<List<Integer>> combine(int n, int k) {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = i + 1;
            }
            back(arr,k,0);
            return lists;
        }

        public void back(int[] arr, int k, int index) {
            if (list.size() == k) {
                lists.add(new ArrayList<>(list));
                return;
            }
            for (int i = index; i < arr.length; i++) {
                list.add(arr[i]);
                back(arr, k, i + 1);
                list.remove(list.size() - 1);
            }
        }

    }
}
