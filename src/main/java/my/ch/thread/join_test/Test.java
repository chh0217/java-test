package my.ch.thread.join_test;

/**
 * Created by chenh on 2017/6/20.
 */
public class Test {
    public static void main(String[] args) {
        try {
            MyThread threadTest = new MyThread();
            threadTest.start();
            threadTest.join();
            System.out.println("threadTest执行完后我才执行");
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
