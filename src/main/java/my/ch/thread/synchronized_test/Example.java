package my.ch.thread.synchronized_test;

/**
 * Created by chenh on 2017/6/21.
 */
public class Example {
        public static void main(String[] args){
//            Counter counterA = new Counter();
//            Counter counterB = new Counter();
            Counter counter = new Counter();
            Thread  threadA = new CounterThread(counter);
            Thread  threadB = new CounterThread(counter);

            threadA.start();
            threadB.start();
        }
}
