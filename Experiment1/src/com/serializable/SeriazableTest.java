package com.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SeriazableTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		File outPutfile = new File("C:\\Users\\r.bhandary\\Desktop\\in.txt");
		ObjectOutputStream objectOutputStream = null;
		try {
			objectOutputStream = new ObjectOutputStream(new FileOutputStream(outPutfile));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Address a1=new Address("a", "b");
		Employee e1=new Employee("reshma", 123,"Udupi",a1);
		objectOutputStream.writeObject(e1);
		objectOutputStream.flush();
		objectOutputStream.close();
		System.out.println("done");
		
		
//--------------------------------------------
		ObjectInputStream  objectInputStream=new ObjectInputStream(new FileInputStream("C:\\Users\\r.bhandary\\Desktop\\in.txt"));
		Employee e2=(Employee) objectInputStream.readObject();
		if(null == e2) {
			System.out.println("yes null");
		}
		System.out.println(e2);
		
		
		System.out.println("****************************************************************************************");
		
		
//		Address adr=new Address("uduo", "kar");
//		Employee2 e3=new Employee2("reshma", 123,"Udupi",adr);
//		File outPutfile1 = new File("C:\\Users\\r.bhandary\\Desktop\\OutPut (3).txt");
//		ObjectOutputStream objectOutputStream1 = null;
//		try {
//			objectOutputStream1 = new ObjectOutputStream(new FileOutputStream(outPutfile1));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		objectOutputStream1.writeObject(e3);
//		objectOutputStream1.flush();
//		objectOutputStream1.close();
	}

}
