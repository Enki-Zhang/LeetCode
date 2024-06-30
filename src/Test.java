import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author Enki
 * @ClassName Test
 * @Description: TODO
 * @Date 2023/10/6 16:18
 * @Version 1.0
 */
public class Test {

    private int a;
    private int b;

    public void setA(int a) {
        this.a = a;
    }
    public void setB(int b) {
        this.b = b;
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Test s1 = new Test();
        s1.setA(1);
        s1.setB(2);
        Test test = s1;
        test.setA(-1);
        new ThreadPoolExecutor(9,2,2, TimeUnit.SECONDS,new LinkedBlockingDeque<>());
    }
}
