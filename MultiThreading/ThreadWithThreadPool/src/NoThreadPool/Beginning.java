package NoThreadPool;

public class Beginning {

	public static void main(String[] args) {

		Thread t1 = new FirstThread();
		Thread t2 = new SecondThread();
		Thread t3 = new ThirdThread();
		Thread t4 = new FourthThread();
		Thread t5 = new FifthThread();

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

	}

}
