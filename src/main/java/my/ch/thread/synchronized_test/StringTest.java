package my.ch.thread.synchronized_test;

/**
 * Created by chenh on 2017/6/20.
 */
public class StringTest {

    public static void test(String t) throws InterruptedException {
        synchronized (t){
            System.out.println("asdasd");
            Thread.sleep(5000);
            System.out.println("end");
        }
    }

    public static void test1(String t) throws InterruptedException {
        String c = "c";
        synchronized (c){
            System.out.println("asdasd");
            Thread.sleep(5000);
            System.out.println("end");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        String a = "a";
        String b = "b";
        test1(a);
        test1(b);
    }
}
