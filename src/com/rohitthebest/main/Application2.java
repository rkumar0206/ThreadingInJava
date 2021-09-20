package com.rohitthebest.main;

public class Application2 {

	/**
	 * Threading simply means that running a block of code on another thread, In
	 * other words, doing a job without affecting the others job. It maintains the
	 * flow of the program
	 */

	public static void main(String[] args) {

		System.out.println("Started Thread A");

		Task taskRunner = new Task("Thread - A");
		taskRunner.start();

		System.out.println("Started Thread B");
		Task taskRunner2 = new Task("Thread - B");
		taskRunner2.start();
		
		
	}
}
