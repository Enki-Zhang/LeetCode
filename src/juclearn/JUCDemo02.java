package juclearn;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Enki
 * @ClassName JUCDemo02
 * @Description: TODO
 * @Date 2024/1/2 11:17
 * @Version 1.0
 */
public class JUCDemo02 extends Thread{
    private Lock lock;
    public JUCDemo02(String name, Lock lock) {
        super(name);
        this.lock = lock;
    }

    public void run () {
        lock.lock();
        try {
            System.out.println(Thread.currentThread() + " running");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } finally {
            lock.unlock();
        }
    }
}
