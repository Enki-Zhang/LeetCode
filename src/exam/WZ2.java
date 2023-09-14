package exam;

import org.w3c.dom.ls.LSException;

import java.util.*;

/**
 * @author Enki
 * @ClassName WZ2
 * @Description: TODO
 * @Date 2023/9/13 20:52
 * @Version 1.0
 */
public class WZ2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] nums = new int[n];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
            list.add(nums[i]);
        }
        List<Integer> play = play(list);
        for (Integer a :
                play) {
            System.out.print(a+" ");
        }


    }
    public static List<Integer> play(List<Integer> list)
    {
        List<Integer> order = new ArrayList<>();
        int num = list.size();
        while (num>0)
        {
            int song = list.get(0);
            order.add(song);
            list.remove(0);
            if (list.size()>0)
            {
                int next = list.get(0);
                list.remove(0);
                list.add(next);
            }
            num--;
        }
        return order;
    }
}
