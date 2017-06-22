package my.ch.thread.countDownLatch_test;

import java.util.concurrent.CountDownLatch;

/**
 * Created by chenh on 2017/6/22.
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(3);

        Waiter      waiter      = new Waiter(latch);
        Decrementer decrementer = new Decrementer(latch);

        new Thread(waiter)     .start();
        new Thread(decrementer).start();

        Thread.sleep(4000);
    }
}
