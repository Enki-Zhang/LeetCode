package exam.yhem;
/**
 * @author Enki
 * @ClassName ShowMeBug
 * @Description: TODO
 * @Date 2023/10/8 19:20
 * @Version 1.0
 */
// 可以引⼊的库和版本相关请参考 “环境说明”
// 请勿更改 `ShowMeBug` 类名以防执⾏失败

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ShowMeBug {

    /**
     * 最大数字
     */
    private final int maxCount;
    private int currentNum = 1;
    private Lock lock = new ReentrantLock();
    private Condition oddCon = lock.newCondition();
    private Condition eventCond = lock.newCondition();
    private boolean isOdd = true;


    public ShowMeBug(int maxCount) {
        this.maxCount = maxCount;
    }

    /**
     * todo: 请实现该方法，让其从 1 开始打印奇数
     */
    public void printOdd() throws InterruptedException {
        while (currentNum <= maxCount) {
            try {
                lock.lock();
                while (!isOdd) {
                    oddCon.await();
                }
//            打印奇数
                if (currentNum <= maxCount && currentNum % 2 != 0) {
                    System.out.println(Thread.currentThread().getName() + ": " + currentNum);
                    currentNum++;
                }
                isOdd = false;
                eventCond.signal();
            } finally {
                lock.unlock();
            }
        }

    }

    /**
     * todo: 请实现该方法，让其从 2 开始打印偶数
     */
    public void printEven() throws InterruptedException {
        while (currentNum <= maxCount) {
            try {
                lock.lock();
//            打印奇数
                while (isOdd) {
                    eventCond.await();
                }
                if (currentNum <= maxCount && currentNum % 2 == 0) {
                    System.out.println(Thread.currentThread().getName() + ": " + currentNum);
                    currentNum++;
                }
                isOdd = true;
                oddCon.signal();
            } finally {
                lock.unlock();
            }
        }
    }
}
