import java.util.ArrayList;
import java.util.List;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_93 {
    public static void main(String[] args) {

    }

    /**
     * 复原IP地址 用.分割开整数
     */
    class Solution {
        List<String> list = new ArrayList<>();

        public List<String> restoreIpAddresses(String s) {
            if (s.length() < 4) {
                return null;
            }
            return back(s, 0);

        }

        private List<String> back(String s, int index) {
           return null;
        }
    }
}
