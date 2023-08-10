package swing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Enki
 * @Version 1.0
 */
public class SwingII_081 {
    public static void main(String[] args) {

    }

    //
    class Solution {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            Arrays.sort(candidates);
            back(candidates, target, 0);
            return lists;


        }

        private void back(int[] candidates, int target, int index) {
            if (target == 0) {
                lists.add(new ArrayList<>(list));
            }
            for (int i = index; i < candidates.length; i++) {
                if (candidates[i] > target) continue;
                list.add(candidates[i]);
                back(candidates, target - candidates[i], i);
                list.remove(list.size() - 1);
            }

        }
    }
}
