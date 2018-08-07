package call;

public class myRunable implements Runnable {
	String name="";
	public  myRunable(String name) {
		this.name=name;
	}	
	@Override
	public synchronized void run() {
		for(int i=0;i<5;i++){
			System.out.println(name+" "+Thread.currentThread().getName()+"----"+i);
			if ("myRunable1".equals(this.name)) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
