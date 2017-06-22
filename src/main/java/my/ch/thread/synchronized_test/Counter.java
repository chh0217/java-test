package my.ch.thread.synchronized_test;

/**
 * Created by chenh on 2017/6/21.
 */
public class Counter {
    long count = 0;

    public synchronized void add(long value){
        this.count += value;
    }
}
