package exam.yidong;

import java.util.Scanner;

/**
 * @author Enki
 * @ClassName Main
 * @Description: TODO
 * @Date 2023/10/24 19:39
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
//        String s = "aaatra";
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = s.toCharArray();
        int countY = 0;
        for (char aChar : chars) {
            if (aChar == 'a' || aChar == 'e' || aChar == 'i' || aChar == 'o' || aChar == 'u') {
                countY++;
            }else {
                stringBuilder.append(aChar);
            }
        }
        System.out.println(countY);
        System.out.println(stringBuilder);
//        元音位置
        int place = stringBuilder.length()-1;
        int left = countY-place;
        if(left>0){
            System.out.println(stringBuilder.length()+place+left);
        }else {
            int res = 2*countY+1;
            System.out.println(res);
        }
    }
}
