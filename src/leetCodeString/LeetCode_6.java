package leetCodeString;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_6 {
    public static void main(String[] args) {
    }

    class Solution {
        public String convert(String s, int numRows) {
            if (s.length()==1)
            {
                return s;
            }
//            模拟
//            计算行数
            int length = s.length();
//            每一个N的宽度
            int nRowNum = numRows + numRows - 2;
            if (nRowNum==0)
            {
                return s;
            }
            int nWight = 1 + numRows - 2;
            int clo = (length / nRowNum) * nWight;
            int left = length % nRowNum;
            if (left < numRows && left != 0) {
                clo += 1;
            } else if (left != 0) {
                clo += left - numRows;
            }
            char[][] tar = new char[numRows][clo];
            for (int i = 0, x = 0, y = 0; i < s.length(); ++i) {
                tar[x][y] = s.charAt(i);
                if (i % nRowNum < numRows - 1) {
                    ++x; // 向下移动
                } else {
                    --x;
                    ++y; // 向右上移动
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            for (char[] ints :
                    tar) {
                for (char c : ints
                ) {
                    if (c != 0) {
                        stringBuilder.append(c);
                    }

                }
            }
            return stringBuilder.toString();

        }
    }
}
