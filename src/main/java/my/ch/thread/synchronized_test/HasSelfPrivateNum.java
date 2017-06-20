package my.ch.thread.synchronized_test;

/**
 * 多个对象多个锁
 * Created by chenh on 2017/6/20.
 */
public class HasSelfPrivateNum {
    private int num = 0;

    //锁住当前对象
    synchronized public void addI(String userName){
        try {
            if(userName.equals("a")){
                num = 100;
                System.out.println("a set over!");
                Thread.sleep(2000);
            }else{
                num = 200;
                System.out.println("b set over!");
            }
            System.out.println(userName + " num=" + num);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
