import java.util.ArrayList;
import java.util.List;

/**
 * @author Enki
 * @ClassName LeetCode_17_2
 * @Description: TODO
 * @Date 2023/9/5 10:05
 * @Version 1.0
 */
public class LeetCode_17_2 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.letterCombinations("23"));

    }

    /**
     * 将按键转为对应的hashMap
     */
    static class Solution {
        List<String> list = new ArrayList<>();
        String[] buttons = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        public List<String> letterCombinations(String digits) {
            if (digits.length() == 0) {
                return new ArrayList<>();
            }
            int[] numbers = new int[digits.length()];
//            将按键转为数字
            for (int i = 0; i < digits.length(); i++) {
                numbers[i] = Integer.parseInt(String.valueOf(digits.charAt(i))) - 2;
            }
            back(numbers, 0, new StringBuilder());

            return list;
        }

        /**
         * 选择按键并对应遍历 对每个按键从0开始遍历
         *
         * @param start
         * @param stringBuilder
         */
        private void back(int[] numbers, int start, StringBuilder stringBuilder) {
            if (start == numbers.length && stringBuilder.length() == numbers.length) {
                list.add(new String(stringBuilder));
                return;
            }
//            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < buttons[numbers[start]].length(); i++) {
                stringBuilder.append(buttons[numbers[start]].charAt(i));
                back(numbers, start + 1, stringBuilder);
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            }

        }
    }
}
