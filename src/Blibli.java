import tree.TreeNode;

/**
 * @author Enki
 * @ClassName Blibli
 * @Description: TODO
 * @Date 2023/8/29 18:43
 * @Version 1.0
 */

public class Blibli {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param s1 string字符串
     * @param s2 string字符串
     * @return int整型
     */
    public int minDeleteSum(String s1, String s2) {
        // write code here

        int m = s1.length() + 1;
        int n = s2.length() + 1;
        int[][] dp = new int[m][n];
        for (int i = 1; i <= m; i++) {
            dp[i][0] = dp[i - 1][0] + s1.codePointAt(i - 1);
        }

        for (int j = 1; j <= n; j++) {
            dp[0][j] = dp[0][j - 1] + s2.codePointAt(j - 1);

        }
        for (int i = 1; i <= m; i++) {
            int code1 = s1.codePointAt(i - 1);
            for (int j = 1; j <= n; j++) {
                int code2 = s2.codePointAt(j - 1);
                if (code2 == code1) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j] + code1, dp[i][j - 1] + code2);
                }

            }

        }
        return dp[m][n];
    }


    public int longestUnivaluePath(TreeNode root) {
        // write code here
        if (root == null) {
            return 0;
        } else {
            int leftHeight = longestUnivaluePath(root.left);
            int rightHeight = longestUnivaluePath(root.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }


    }
}