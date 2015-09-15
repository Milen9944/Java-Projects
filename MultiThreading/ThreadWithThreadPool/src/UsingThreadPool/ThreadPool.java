package UsingThreadPool;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class ThreadPool {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(7);

		for (int i = 1; i <= 5; i++) {
			MyThread worker = new MyThread(i * 2000, i);
			executor.execute(worker);
		}

		executor.shutdown();
		while (!executor.isTerminated()) {
		}

	}

}
