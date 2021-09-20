package com.rohitthebest.main;

public class Application3 {

	/**
	 * Threading simply means that running a block of code on another thread, In
	 * other words, doing a job without affecting the others job. It maintains the
	 * flow of the program
	 */

	public static void main(String[] args) {

		System.out.println("Started Thread A");

		Thread t1 = new Thread(new TaskRunnable("Thread - A"));
		t1.start();

		System.out.println("Started Thread B");
		
		Thread t2 = new Thread(new TaskRunnable("Thread - B"));
		t2.start();

		
	}
}

// using runnable interface
class TaskRunnable implements Runnable {
	
String name = "";
	

	public TaskRunnable(String name) {
		
		this.name = name;
	}
	
	public void run() {

		Thread.currentThread().setName(name);

		for (int i = 0; i <= 500; i++) {

			System.out.println("number : " + i + " started by - " + Thread.currentThread().getName());
		}
	}
}