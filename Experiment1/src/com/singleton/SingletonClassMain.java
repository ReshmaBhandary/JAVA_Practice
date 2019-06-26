package com.singleton;

import java.io.ObjectStreamException;

public class SingletonClassMain {
	public static void main(String args[]) {
		SingletonClass obj = SingletonClass.getInstance();

	}

}

class SingletonClass implements Cloneable {
	private static int i = 10;
	private static SingletonClass singletonClass;

	private SingletonClass() {

	}

	public static SingletonClass getInstance() {
		if (null == singletonClass) {
			synchronized (SingletonClass.class) {
				if (null == singletonClass) {
					singletonClass = new SingletonClass();
					System.out.println(i);
				}
			}
		}
		return singletonClass;

	}

	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();

	}

	private Object readResolve() throws ObjectStreamException {
		return singletonClass;
	}

	private Object writeReplace() throws ObjectStreamException {
		return singletonClass;
	}

}
