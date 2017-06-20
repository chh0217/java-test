package my.ch.thread.synchronized_test;

/**
 * Created by chenh on 2017/6/20.
 */
public class ThreadD extends Thread{
    private Service service;
    public ThreadD(Service service){
        this.service = service;
    }
    public void run(){
        service.testMethod();
    }
}
