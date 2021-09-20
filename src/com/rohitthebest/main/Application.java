package com.rohitthebest.main;

public class Application {

	/**
	 * Threading simply means that running a block of code on another thread, In
	 * other words, doing a job without affecting the others job. It maintains the
	 * flow of the program
	 */

	public static void main(String[] args) {

		// Every program starts on thread called main thread; i.e. in the main method

		System.out.println("Hello world...");

		Task taskRunner = new Task();

		taskRunner.start(); // It starts the thread

		System.out.println("this can be printed anytime.");

		// this going to raise an exception - one instance of a thread or Task can be
		// used to invoke the thread only once
		// taskRunner.start();

		Task taskRunner2 = new Task();

		taskRunner2.start(); // It starts another thread with another instance of Task

		// ** notice that the number printed in the console - it is because the
		// the two instances of the class Task as running concurrently on different
		// threads
		// and are printing the numbers at the same time

	}
}
