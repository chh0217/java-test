package my.ch.thread;

/**
 * Created by chenh on 2017/6/18.
 * 另外可以继承{@link Thread}
 */
public class Mythread implements Runnable{
    public void run(){
        System.out.println("end");
    }

}
