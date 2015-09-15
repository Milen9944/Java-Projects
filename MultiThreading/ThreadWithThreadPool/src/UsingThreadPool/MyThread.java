package UsingThreadPool;

import java.util.Random;

public class MyThread extends Thread {
	private int time;
	private int name;
	
	public MyThread(int time, int name) {
		this.time = time;
		this.name = name;
	}

	public void run() {
		System.out.println(Thread.currentThread().getName() + " started!");
		Thread.currentThread().setName("Thread " +  name);
		processMessage(time);				
		System.out.println(Thread.currentThread().getName() + " completed!");
	}
	
	private void processMessage(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


}