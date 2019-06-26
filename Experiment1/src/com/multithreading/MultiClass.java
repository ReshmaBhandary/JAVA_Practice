package com.multithreading;

public class MultiClass {
	public synchronized  void m1() throws InterruptedException {
		//synchronized (this) {
			System.out.println("m1 "+Thread.currentThread().getName());
		//	Thread.sleep(10000);
		//}
	}

	public void m2() {
			System.out.println("m2 "+Thread.currentThread().getName());
	}
	public void m3() {
		System.out.println("m3 "+Thread.currentThread().getName());
}
	public void m4() {
		System.out.println("m4 "+Thread.currentThread().getName());
}
//	
//	public   void m5() throws InterruptedException {
//		synchronized (MultiClass.class) {
//			System.out.println("m1 "+Thread.currentThread().getName());
//			Thread.sleep(10000);
//		}
//	}
	

}
