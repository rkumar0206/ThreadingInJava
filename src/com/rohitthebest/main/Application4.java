package com.rohitthebest.main;

public class Application4 {

	/**
	 * Threading simply means that running a block of code on another thread, In
	 * other words, doing a job without affecting the others job. It maintains the
	 * flow of the program
	 */

	public static void main(String[] args) {

		System.out.println("Started Thread A");

		// using anonymous class
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {

				for (int i = 0; i <= 500; i++) {

					System.out.println("number : " + i + " started by - " + Thread.currentThread().getName());
				}
			}
		});
		
		t1.start();

		System.out.println("Started Thread B");
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {

				for (int i = 0; i <= 500; i++) {

					System.out.println("number : " + i + " started by - " + Thread.currentThread().getName());
				}
			}
		});
		
		t2.start();

		
	}
}
