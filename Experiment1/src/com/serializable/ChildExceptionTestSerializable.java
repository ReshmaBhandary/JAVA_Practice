package com.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ChildExceptionTestSerializable {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ChildEmployee b1 =new ChildEmployee("Rsha", 10, "udupi","childName");
		FileOutputStream fos = new FileOutputStream("abc1.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		// Method for serialization of B's class object
		oos.writeObject(b1);

		// closing streams
		oos.close();
		fos.close();

		System.out.println("Object has been serialized");

		// De-Serializing B's(subclass) object

		// Reading the object from a file
		FileInputStream fis = new FileInputStream("abc1.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);

		// Method for de-serialization of B's class object
		ChildEmployee b2 = (ChildEmployee) ois.readObject();

		// closing streamss
		ois.close();
		fis.close();

		System.out.println("Object has been deserialized");

		System.out.println("i = " + b2.getCity());
		System.out.println("j = " + b2.getEmpInt());
		System.out.println(b2.getEmpName());
		System.out.println(b2.getName());

		
	}

}
