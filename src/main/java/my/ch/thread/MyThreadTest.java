package my.ch.thread;

/**
 * Created by chenh on 2017/6/18.
 */
public class MyThreadTest {
    public static void main(String[] args) {
//        Thread t = new Thread(new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        });
        Thread t1 = new Thread(new Mythread(),"lalalla");
        t1.start();
    }
}
