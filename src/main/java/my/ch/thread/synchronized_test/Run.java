package my.ch.thread.synchronized_test;

/**
 * Created by chenh on 2017/6/20.
 */
public class Run {
    public static void main(String[] args) {
        test3();
    }

    //多个对象多个锁
    public static void test1(){
        HasSelfPrivateNum numRef1 = new HasSelfPrivateNum();
        HasSelfPrivateNum numRef2 = new HasSelfPrivateNum();
        Thread a = new Thread(new ThreadA(numRef1));
        a.start();
        Thread b = new Thread(new ThreadB(numRef2));
        b.start();
    }

    //方法与锁对象  脏读
    public static void test2(){
        MyObject object = new MyObject();
        ThreadMyObjectA a = new ThreadMyObjectA(object);
        a.setName("A");
        ThreadMyObjectB b = new ThreadMyObjectB(object);
        b.setName("B");
        a.start();
        b.start();
    }
    //可重入锁 支持父子继承 无法继承同步
    //异常释放锁
    public static void test3(){
        try {
            Service service = new Service();
            ThreadC c = new ThreadC(service);
            c.setName("c");
            c.start();
            Thread.sleep(500);
            ThreadD d = new ThreadD(service);
            d.setName("d");
            d.start();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

}
