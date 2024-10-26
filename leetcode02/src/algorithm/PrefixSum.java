package algorithm;

/**
 * @author Enki
 * @ClassName PrefixSum
 * @Description: TODO
 * @Date 2024/10/13 16:35
 * @Version 1.0
 */
public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};  // 原数组
        int[] prefixSum = new int[arr.length + 1];  // 前缀和数组，比原数组多一个元素

        // 构建前缀和数组
        for (int i = 1; i <= arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i - 1];
        }

        // 打印前缀和数组
        System.out.println("前缀和数组: " + java.util.Arrays.toString(prefixSum));

        // 示例：求区间 [1, 3] 的和
        int l = 1, r = 3;
        int sum = prefixSum[r + 1] - prefixSum[l];
        System.out.println("区间 [1, 3] 的和: " + sum);
    }

}
