package NoThreadPool;

public class SecondThread extends Thread {
	
	public void run() {
		System.out.println("The thread started!");
		this.setName("Second thread");
		System.out.println("I am " + this.getName() + "!");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(e);
			e.printStackTrace();
		}		
		System.out.println("The " + this.getName() + " completed!");
	}

}
