package leetCodeBack;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_51 {
    public static void main(String[] args) {


    }

    //n皇后
    class Solution {
        List<List<String>> lists = new ArrayList<>();

        public List<List<String>> solveNQueens(int n) {
            List<String> list = new ArrayList<>();

//            构建棋盘
            for (int i = 0; i < n; i++) {
                StringBuilder stringBuilder = new StringBuilder();
                for (int j = 0; j < n; j++) {
                    stringBuilder.append(".");
                }
                list.add(stringBuilder.toString());
            }
            back(list, 0, n);
            return lists;
        }

        private void back(List<String> list, int row, int n) {
//            row行 到达最后一行
            if (row == n) {
                lists.add(new ArrayList<>(list));
            }
//            尝试一行中的每一列
            for (int i = 0; i < n; i++) {
                if (!isVilable(list, row, i)) continue;
                StringBuilder stringBuilder = new StringBuilder(list.get(row));
                stringBuilder.setCharAt(i, 'Q');
                list.set(row, stringBuilder.toString());
                back(list, row + 1, n);
                stringBuilder.setCharAt(i, '.');
                list.set(row, stringBuilder.toString());
            }


        }

        private boolean isVilable(List<String> list, int row, int col) {
//            判断新加入的是否合法
//            String rowList = list.get(row);
            int size = list.size();
////            判断行
//            for (int i = 0; i < rowList.length(); i++) {
//                if (rowList.charAt(i) == 'Q' && i != col) {
//                    return false;
//                }
//            }
// 判断列
            for (int i = 0; i < size; i++) {
                if (list.get(i).charAt(col) == 'Q' && i != row) {
                    return false;
                }
            }
            /* 检查右上方是否有皇后互相冲突 */
            for (int i = row - 1, j = col + 1;
                 i >= 0 && j < size; i--, j++) {
                if (list.get(i).charAt(j) == 'Q') {
                    return false;
                }
            }

            /* 检查左上方是否有皇后互相冲突 */
            for (int i = row - 1, j = col - 1;
                 i >= 0 && j >= 0; i--, j--) {
                if (list.get(i).charAt(j) == 'Q') {
                    return false;
                }
            }

            return true;


        }
    }
}
