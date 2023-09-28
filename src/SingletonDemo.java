/**
 * @author Enki
 * @ClassName SingletonDemo
 * @Description: 单例模式
 * @Date 2023/9/24 20:54
 * @Version 1.0
 */
public class SingletonDemo {

    private volatile  static SingletonDemo instance = null;

    public SingletonDemo() {
        System.out.println("构造方法");
    }

    /**
     * 创造单例
     *
     * @return
     */
    public  static SingletonDemo getInstance() {
        if (instance == null) {
            synchronized (SingletonDemo.class){
                if (instance==null){
                    instance = new SingletonDemo();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        // 这里的 == 是比较内存地址
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                SingletonDemo.getInstance();
            }, String.valueOf(i)).start();
        }
    }
}
