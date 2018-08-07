package call;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
	String name="";
	
	public MyCallable(String name) {
		this.name=name;
	}
	@Override
	public synchronized String call() throws Exception {
		if("myCallable1".equals(this.name)){
			throw new Exception("testException");
		}
		for(int i=0;i<5;i++){
			System.out.println(name+" "+Thread.currentThread().getName()+"------"+i);
			if("myCallable3".equals(this.name)){
                Thread.sleep(100);
            }
		}
		return this.name;
	}
	
}
