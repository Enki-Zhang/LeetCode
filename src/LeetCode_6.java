import java.util.ArrayList;
import java.util.List;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_6 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String string = solution.convert("ABC", 1);
        System.out.println(string);

    }

    /**
     * N字变换 每一行用 Stringbuilder记录 从上到下依次录入
     * 并用指针指示读取的位置 读取完毕后再将每个stringbuilder全部取出
     *
     */
    static class Solution {
        public String convert(String s, int numRows) {
            if (numRows <= 2) {
                return s;
            }
            List<StringBuilder> rows = new ArrayList<>();
            for (int i = 0; i < numRows; i++) {
                rows.add(new StringBuilder());
            }
            char[] chars = s.toCharArray();
            int i = 0;
            int chang = -1;
            for (char c :
                    chars) {
                rows.get(i).append(c);
                if (i == 0 || i == numRows - 1) {
                    chang = -chang;
                }
                i += chang;
            }
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < rows.size(); j++) {
                stringBuilder.append(rows.get(j));
            }
            return stringBuilder.toString();
        }
    }
}
