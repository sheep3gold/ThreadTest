package ThreadTest;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import call.myRunable;

public class ThreadPoolMain {

	public static void main(String[] args) {
		ThreadPoolExecutor threadPoolExecutor=new ThreadPoolExecutor(5,10,200, TimeUnit.MILLISECONDS,new ArrayBlockingQueue<Runnable>(5));

        for(int i=0;i<15;i++){
            myRunable myRunnable=new myRunable("myRunnable"+i);
            threadPoolExecutor.execute(myRunnable);

        }
        threadPoolExecutor.shutdown();

        System.out.println("线程池中线程数目："+threadPoolExecutor.getPoolSize()+",队列中等待的任务数目："+threadPoolExecutor.getQueue().size()
                +",已执行完成的任务数目："+threadPoolExecutor.getCompletedTaskCount());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("线程池中线程数目："+threadPoolExecutor.getPoolSize()+",队列中等待的任务数目："+threadPoolExecutor.getQueue().size()
                +",已执行完成的任务数目："+threadPoolExecutor.getCompletedTaskCount());
    }

}
