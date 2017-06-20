package my.ch.thread.synchronized_test;

/**
 * Created by chenh on 2017/6/20.
 */
public class ThreadMyObjectB extends Thread{
    private MyObject object;
    public ThreadMyObjectB(MyObject object){
        this.object = object;
    }
    public void run(){
        object.methodB();
    }
}
