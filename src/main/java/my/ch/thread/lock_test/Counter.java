package my.ch.thread.lock_test;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by chenh on 2017/6/22.
 */
public class Counter {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    private int count = 0;

    public int inc(){
        lock.lock();
        int newCount = ++count;
        lock.unlock();
        return newCount;
    }
}
