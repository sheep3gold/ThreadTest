package ThreadTest;

import call.myRunable;

public class runableMain {

	public static void main(String[] args) {
		myRunable myRunable1=new myRunable("myRunable1");
		myRunable myRunable2=new myRunable("myRunable2");
		myRunable myRunable3=new myRunable("myRunable3");
		
		new Thread(myRunable1).start();
		new Thread(myRunable2).start();
		new Thread(myRunable3).start();
	}

}
