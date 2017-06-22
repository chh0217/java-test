package my.ch.thread.countDownLatch_test;

import java.util.concurrent.CountDownLatch;

/**
 * Created by chenh on 2017/6/22.
 */
public class Waiter implements Runnable{

    CountDownLatch latch = null;

    public Waiter(CountDownLatch latch) {
        this.latch = latch;
    }

    public void run() {
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Waiter Released");
    }
}
