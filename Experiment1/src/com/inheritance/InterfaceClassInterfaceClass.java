package com.inheritance;

 class InterfaceClass implements InterfaceC
{

	@Override
	public void m1() {
		System.out.println("m1");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		System.out.println("m2");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m3() {
		System.out.println("m3");
		// TODO Auto-generated method stub
		
	}
	
	
}
 public class InterfaceClassInterfaceClass{
	public static void main(String agrs[]) {
		InterfaceClass interfaceClass=new InterfaceClass();	
		interfaceClass.m1();
		interfaceClass.m2();
		interfaceClass.m3();
	}
}

