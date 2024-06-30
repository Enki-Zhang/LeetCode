package juclearn;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Enki
 * @ClassName AbstractQueuedSynchronizerDemo
 * @Description: TODO
 * @Date 2024/1/3 10:10
 * @Version 1.0
 */
public class AbstractQueuedSynchronizerDemo {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock(true);

        JUCDemo02 t1 = new JUCDemo02("t1", lock);
        JUCDemo02 t2 = new JUCDemo02("t2", lock);
        JUCDemo02 t3 = new JUCDemo02("t3", lock);
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
    }
}
