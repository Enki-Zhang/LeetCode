import java.util.LinkedList;
import java.util.List;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_17 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.letterCombinations(""));


    }

    /**
     * 电话号码的组合 将按键保存到String数组中 对每个按键的字母进行搜索并添加 因为一个按键只能搜索一次 每一层对应一个按键 向下搜索对应不同的按键
     */
    static class Solution {
        List<String> lists = new LinkedList<>();
        String[] buttons = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        public List<String> letterCombinations(String digits) {
            if (digits.equals("")) {
                return new LinkedList<>();
            }
//            将字符串转为整数
            char[] chars = digits.toCharArray();
            int[] numbers = new int[chars.length];
            for (int i = 0; i < chars.length; i++) {
                numbers[i] = Integer.parseInt(String.valueOf(chars[i])) - 2;
            }
            back(numbers, 0, buttons, 0, new StringBuilder());
            return lists;

        }

        /**
         * 回溯 每一层对应一个按键的搜索过程
         *
         * @param numbers
         * @param index
         * @param buttons
         */
        private void back(int[] numbers, int index, String[] buttons, int start, StringBuilder stringBuilder) {
            if (stringBuilder.length() == numbers.length) {
                lists.add(new String(stringBuilder));
                return;
            }
            for (int i = 0; i < buttons[numbers[start]].length(); i++) {
                stringBuilder.append(buttons[numbers[start]].charAt(i));
                back(numbers, i + 1, buttons, start + 1, stringBuilder);
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);

            }
        }
    }
}
