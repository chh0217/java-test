package my.ch.thread.excutor_test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.*;

/**
 * Created by chenh on 2017/6/22.
 */
public class Test {
    ExecutorService executorService1 = Executors.newSingleThreadExecutor();

    ExecutorService executorService2 = Executors.newFixedThreadPool(10);

    ExecutorService executorService3 = Executors.newScheduledThreadPool(10);

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //第一种方式 无法获取结果
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(new Runnable() {
            public void run() {
                System.out.println("Asynchronous task");
            }
        });
        executorService.shutdown();

        //通过future获取返回值
        Future future = executorService.submit(new Runnable() {
            public void run() {
                System.out.println("Asynchronous task");
            }
        });
        future.get();  //returns null if the task has finished correctly.

        //callabale
        Future future1 = executorService.submit(new Callable(){
            public Object call() throws Exception {
                System.out.println("Asynchronous Callable");
                return "Callable Result";
            }
        });

        System.out.println("future.get() = " + future1.get());


        //
        ExecutorService executorService1 = Executors.newSingleThreadExecutor();

        Set<Callable<String>> callables = new HashSet<Callable<String>>();

        callables.add(new Callable<String>() {
            public String call() throws Exception {
                return "Task 1";
            }
        });
        callables.add(new Callable<String>() {
            public String call() throws Exception {
                return "Task 2";
            }
        });
        callables.add(new Callable<String>() {
            public String call() throws Exception {
                return "Task 3";
            }
        });

        List<Future<String>> futures = executorService1.invokeAll(callables);

        for(Future<String> f : futures){
            System.out.println("future.get = " + f.get());
        }

        executorService.shutdown();
    }
}
