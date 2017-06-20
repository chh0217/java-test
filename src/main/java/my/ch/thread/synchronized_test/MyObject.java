package my.ch.thread.synchronized_test;

/**
 * Created by chenh on 2017/6/20.
 */
public class MyObject {
    synchronized public void methodA(){
        try {
            System.out.println("begin methodA threadName="+Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end endTime=" + System.currentTimeMillis());
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    synchronized public void methodB(){
        try {
            System.out.println("begin methodB threadName="+Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end");
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
