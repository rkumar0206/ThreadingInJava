package com.rohitthebest.main;

public class ApplicationSynchronized {

	public static void main(String[] args) {

		Sequence sequence = new Sequence();

		Worker worker1 = new Worker(sequence);
		worker1.start();

		Worker worker2 = new Worker(sequence);
		worker2.start();

	}
}

/**
 * synchronized :
 * 
 * Let's say we have an instance of a class and it has a variable called value,
 * which is incremented whenever getNext() method is called. If we run it in
 * main thread then it will print the in the incrementing order, But... if we
 * use this instance of the class in multi-thread (used by more than one
 * thread), then it is going to print the value in any order and sometimes print
 * the duplicate values, which is therefore not thread safe. To make this thread
 * safe, we use a keyword called 'synchronized' which ensures that only the
 * latest value is assigned to a thread.
 */

class Sequence {

	private int value = 0;

	// making this method as synchronized so that it only returns the latest value
	// of the variable value
	public synchronized int getNext() {

		synchronized (this) {

			value++;
			return value;

		}

	}

	// The above method can also be written as
//	public synchronized int getNext() {
//
//		value++;
//		return value;
//	}

}

class Worker extends Thread {

	Sequence sequence = null;

	public Worker(Sequence sequence) {

		this.sequence = sequence;
	}

	public void run() {

		for (int i = 0; i < 100; i++) {

			System.out.println(Thread.currentThread().getName() + " got value : " + sequence.getNext());
		}

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
