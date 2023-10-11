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
        Test s1 = new Test();
        s1.setA(1);
        s1.setB(2);
        Test test = s1;
        test.setA(-1);

    }
}
