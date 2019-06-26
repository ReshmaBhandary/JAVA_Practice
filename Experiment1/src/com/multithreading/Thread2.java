package com.multithreading;

public class Thread2 implements Runnable{
	MultiClass  multiClass=new MultiClass();

	@Override
	public void run() {
		
		System.out.println("Thread2");
		multiClass.m2();
		
	}

}
