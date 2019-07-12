package concurrent;

import java.util.concurrent.*;

/**
 * Created by khaitq
 * Date: 11/03/2019
 * Github:  https://github.com/quangkhai88
 */

public class Concurrent {


    public static void main(String ...args) throws InterruptedException {


        calculRecursiveTest();

    }

    public static void calculRecursiveTest() {

        int poolSize = Runtime.getRuntime().availableProcessors();

        System.out.println(poolSize);

        ForkJoinPool pool = new ForkJoinPool(poolSize);

        int result =    pool.invoke(new CalculRecursive(5));

        System.out.println("result : " +result);
    }

    public static void blockingQueueTest() throws InterruptedException {

        BlockingQueue<Integer> blocks = new LinkedBlockingQueue<>(2);

        blocks.offer(20);

        blocks.offer(3, 2, TimeUnit.SECONDS);

        System.out.println(blocks.poll());

        System.out.println(blocks.poll(1, TimeUnit.MILLISECONDS));


    }

}
