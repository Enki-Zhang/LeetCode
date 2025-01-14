package javaeasy;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.Collection;

/**
 * @ClassName GenericsDemo06
 * @Description TODO
 * @Author Enki
 * @Date 2024/10/27 14:47
 * @Verison 1.0
 **/
public class GenericsDemo06 {
    public static void main(String[] args) {
        Point<String> point = new Point<>();
        point.setVar("hello");
        String var = point.getVar();
        System.out.println(var);
//        Collection
//        new PolicyUtils.Collections()
    }


}
