package com.cg.multithreading;
//thread is predefined class in java
public class Example1  extends Thread
{
	public void run()
	{
		System.out.println("Thread is going to run");
	}
	public static void main(String[] args) {
		Example1 e= new Example1();
		e.start();
	}

}