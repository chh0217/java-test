package my.ch.thread.join_test;

/**
 * Created by chenh on 2017/6/20.
 */
public class MyThread extends Thread{
    public void run(){
        try {
            int secondVal = (int) (Math.random() * 1000);
            System.out.println(secondVal);
            Thread.sleep(secondVal);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
