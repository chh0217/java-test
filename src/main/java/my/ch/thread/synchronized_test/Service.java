package my.ch.thread.synchronized_test;

/**
 * Created by chenh on 2017/6/20.
 */
public class Service {
    synchronized public void testMethod(){
        if(Thread.currentThread().getName().equals("c")){
            System.out.println("ThreadName=" + Thread.currentThread().getName()+" run beginTime=" + System.currentTimeMillis());
            int i = 1;
            while(i == 1){
                if(("" + Math.random()).substring(0,8).equals("0.123456")){
                    System.out.println("ThreadName=" + Thread.currentThread().getName() + " run exceptionTime=" + System.currentTimeMillis());
                    Integer.parseInt("c");
                }
            }
        }else{
            System.out.println("Thread D run Time=" + System.currentTimeMillis());
        }
    }
}
