package juclearn;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Enki
 * @ClassName JUCDemo
 * @Description: TODO
 * @Date 2024/1/1 16:50
 * @Version 1.0
 */
public  class JUCDemo extends AbstractQueuedSynchronizer {
    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock();
        reentrantLock.lock();
    }
}
