package concurrent;

import java.util.concurrent.RecursiveTask;

/**
 * Created by khaitq
 * Date: 22/03/2019
 * Github:  https://github.com/quangkhai88
 */

public class CalculRecursive extends RecursiveTask<Integer> {

    private int n;

    public CalculRecursive(int n) {
        this.n = n;
    }

    @Override
    protected Integer compute() {
        if (n <=1)
            return   n;

        System.out.println("Thread : " + Thread.currentThread().getName());
        CalculRecursive c1 =  new CalculRecursive(n-1);
        c1.fork();
        CalculRecursive c2 =  new CalculRecursive(n-2);

        return  c2.compute() +  c1.join();
    }

}
