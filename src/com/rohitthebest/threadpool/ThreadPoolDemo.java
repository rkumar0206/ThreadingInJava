package com.rohitthebest.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * 
 * @author Rohit
 * 
 *         Thread pool is something like a container which contains number of
 *         threads and we don't need to run the threads one by one, The thread
 *         pool takes care of it.
 */

public class ThreadPoolDemo {

	public static void main(String[] args) {

		// Executors.newFixedThreadPool() takes an argument which allows the
		// thread pool to use only that number of threads which specified in the
		// argument
		// It also recycles the thread, by using the same thread which has complted
		// it's work to do another task
		ExecutorService executor = Executors.newFixedThreadPool(2);

		Runnable processor = new MessageProcessor(1);
		executor.execute(processor);

		Runnable processor2 = new MessageProcessor(2);
		executor.execute(processor2);

		Runnable processor3 = new MessageProcessor(3);
		executor.execute(processor3);

		Runnable processor4 = new MessageProcessor(4);
		executor.execute(processor4);

		// Basically the thread pool never stops it's execution until a method
		// shutdown() is called, which rejects any new task from
		// being submitted. Gracefully shuts down the service
		executor.shutdown();
		
		// this method terminates all tasks irrespective of the thread is running
		// executor.shutdownNow();
		
		 
		try {
			
			// this method waits for the time specified and then executes the 
			// further lines
			executor.awaitTermination(2, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("All tasks submitted....");
	}
}
