package my.ch.thread.synchronized_test;

/**
 * Created by chenh on 2017/6/20.
 */
public class ThreadC extends Thread{
    private Service service;
    public ThreadC(Service service){
        this.service = service;
    }

    public void run(){
        service.testMethod();
    }
}
