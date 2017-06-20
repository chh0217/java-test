package my.ch.thread.synchronized_test;

/**
 * Created by chenh on 2017/6/20.
 */
public class ThreadA implements Runnable{
    private HasSelfPrivateNum numRef;

    public ThreadA(HasSelfPrivateNum numRef){
        this.numRef = numRef;
    }

    @Override
    public void run() {
        numRef.addI("a");
    }
}
