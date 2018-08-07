package ThreadTest;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

import call.MyCallable;

public class CallableMain {

	public static void main(String[] args) {
		MyCallable myCallable1=new MyCallable("myCallable1");
		MyCallable myCallable2=new MyCallable("myCallable2");
		MyCallable myCallable3=new MyCallable("myCallable3");
		
		FutureTask<String> futureTask1=new FutureTask<>(myCallable1);
		FutureTask<String> futureTask2=new FutureTask<>(myCallable2);
		FutureTask<String> futureTask3=new FutureTask<>(myCallable3);
		
		new Thread(futureTask1).start();
		new Thread(futureTask2).start();
		new Thread(futureTask3).start();
		try {
			System.out.println(futureTask1.get());
		} catch (InterruptedException | ExecutionException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			
			System.out.println(futureTask2.get());
			System.out.println(futureTask3.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
