package juclearn;

/**
 * @author Enki
 * @ClassName SyncThread
 * @Description: TODO
 * @Date 2024/1/3 10:56
 * @Version 1.0
 */
class SyncThread extends Thread {
   static int count = 0;//作为共享资源进行访问；

    SyncThread() {

    }

    @Override
    public  void run() {
        synchronized(SyncThread.class){
            for (int i = 0; i < 3; i++) {
                try {
                    count++;
                    System.out.println("当前线程" + Thread.currentThread() + "start.." + "共享资源： " + count);
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }


    }

    public static void main(String[] args) {
        SyncThread syncThread1 = new SyncThread();
//        SyncThread syncThread2 = new SyncThread();
        Thread thread1 = new Thread( new SyncThread(), "t1");
        Thread thread2 = new Thread(syncThread1, "t2");
        thread1.start();
        thread2.start();
    }
}


