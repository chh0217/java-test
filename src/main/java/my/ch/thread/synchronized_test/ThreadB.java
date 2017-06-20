package my.ch.thread.synchronized_test;

/**
 * Created by chenh on 2017/6/20.
 */
public class ThreadB implements Runnable{
    private HasSelfPrivateNum numRef;

    public ThreadB(HasSelfPrivateNum numRef){
        this.numRef = numRef;
    }

    @Override
    public void run() {
        numRef.addI("b");
    }
}
