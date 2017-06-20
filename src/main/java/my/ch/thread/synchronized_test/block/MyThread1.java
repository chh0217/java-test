package my.ch.thread.synchronized_test.block;

/**
 * Created by chenh on 2017/6/20.
 */
public class MyThread1 extends Thread{
    private Task task;
    public MyThread1(Task task){
        this.task = task;
    }

    public void run(){
        task.doLongTimeTask();
    }
}
