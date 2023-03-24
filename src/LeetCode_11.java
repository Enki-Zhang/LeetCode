import java.util.Arrays;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_11 {
    public static void main(String[] args) {

    }
    class Solution {
        public int minArray(int[] numbers) {
            Arrays.sort(numbers);
            return numbers[0];

        }
    }
}
