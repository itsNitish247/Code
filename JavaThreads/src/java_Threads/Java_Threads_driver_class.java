package java_Threads;

public class Java_Threads_driver_class {
	
	public static void main(String[] args) {
		Java_Threads_Using_Extends Thread1= new Java_Threads_Using_Extends();
		
		Thread1.start();
		
		
		
		Java_Threads_Using_Runnable Thread2=new Java_Threads_Using_Runnable();
		Thread2.run();
	}

}
