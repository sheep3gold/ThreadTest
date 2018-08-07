package ThreadTest;

public class test extends Thread{
	String string="";
	public test (String str){
		string=str;
	}
	public static void main(String[] args) {
		Thread t1=new test("1号");
		Thread t2=new test("2号");
		Thread t3=new test("3号");
		
		t1.start();
		t2.start();
		t3.start();
	}
	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(string+"开始运行");
		}
	}
	
}
