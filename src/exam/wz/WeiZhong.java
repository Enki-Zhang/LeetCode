package exam.wz;

import java.util.*;

/**
 * @author Enki
 * @ClassName WeiZhong
 * @Description: TODO
 * @Date 2023/9/13 19:19
 * @Version 1.0
 */
public class WeiZhong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        scanner.nextLine();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
            list.add(nums[i]);
        }
        List<Integer>  res = rem(list);
        for (Integer a :
                res) {
            System.out.print(a+" ");
        }

    }

    private static List<Integer> rem(List<Integer> list) {
        HashMap<Integer,Integer> color = new HashMap<>();
        ArrayList<Integer> re = new ArrayList<>();
        for (int i = list.size()-1; i >=0 ; i--) {
            int co = list.get(i);
            if (!color.containsKey(co)) {
                color.put(co,1);
                re.add(0,co);
            }
        }
        return re;
    }
}
