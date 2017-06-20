package my.ch.thread.synchronized_test;

/**
 * Created by chenh on 2017/6/20.
 */
public class ThreadMyObjectA extends Thread{
    private MyObject object;
    public ThreadMyObjectA(MyObject object){
        this.object = object;
    }
    public void run(){
        object.methodA();
    }
}
