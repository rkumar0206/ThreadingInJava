package com.rohitthebest.main;

class Task extends Thread {
	
	String name = "";
	
	public Task() {
	}
	
	public Task(String name) {
		
		this.name = name;
	}
	
	public void run() {

		Thread.currentThread().setName(name);

		for (int i = 0; i <= 500; i++) {

			System.out.println("number : " + i + " started by - " + Thread.currentThread().getName());
		}
	}
}
