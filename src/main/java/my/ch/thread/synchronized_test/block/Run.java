package my.ch.thread.synchronized_test.block;

/**
 * Created by chenh on 2017/6/20.
 */
public class Run {
    //验证同步代码块锁定当前对象
    public static void main(String[] args) throws InterruptedException{
        Task task = new Task();
        MyThread1 thread1 = new MyThread1(task);
        thread1.start();
        Thread.sleep(50);
        MyThread2 thread2 = new MyThread2(task);
        thread2.start();
    }
}
