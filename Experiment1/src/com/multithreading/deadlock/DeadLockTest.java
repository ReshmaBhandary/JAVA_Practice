package com.multithreading.deadlock;

public class DeadLockTest {
	final public String str1="java"; 
	final public String str2="World";
	Thread t1=new Thread("My  threadt1") {
		public void run() {
			  while(true){
	                synchronized(str1){
	                	
	                    synchronized(str2){
	                        System.out.println(str1 + str2);
	                    }
	                }
	            }
		}
		
	};
	
	Thread t2=new Thread("My  threadt2") {
		public void run() {
			  while(true){
	                synchronized(str2){
	                	
	                    synchronized(str1){
	                        System.out.println(str2 + str1);
	                    }
	                }
	            }
		}
		
	};
	
	public static void main(String[] args) {
		
		DeadLockTest obj=new DeadLockTest();
		obj.t1.start();
		obj.t2.start();
		

	}

}
