package com.multithreading;

public class Thread1 implements Runnable{
	MultiClass  multiClass=new MultiClass();

	@Override
	public void run() {
		System.out.println("Thread1");
		try {
			multiClass.m1();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		multiClass.m2();
		multiClass.m3();
		multiClass.m4();
		
	}

}
