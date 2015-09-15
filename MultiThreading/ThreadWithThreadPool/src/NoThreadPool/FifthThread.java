package NoThreadPool;

public class FifthThread extends Thread {
	
	public void run() {
		System.out.println("The thread started!");
		this.setName("Fifth thread");
		System.out.println("I am " + this.getName() + "!");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println(e);
			e.printStackTrace();
		}		
		System.out.println("The " + this.getName() + " completed!");
	}
}
