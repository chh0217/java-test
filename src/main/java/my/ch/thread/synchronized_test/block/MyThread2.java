package my.ch.thread.synchronized_test.block;

/**
 * Created by chenh on 2017/6/20.
 */
public class MyThread2 extends Thread{
    private Task task;
    public MyThread2(Task task){
        this.task = task;
    }

    public void run(){
        task.otherMethod();
    }
}
