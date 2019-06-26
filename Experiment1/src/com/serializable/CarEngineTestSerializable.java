package com.serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class CarEngineTestSerializable {
	public static void main(String args[]) throws FileNotFoundException, IOException, ClassNotFoundException {
		Engine eng=new Engine("EngineType");
		int[] arrays=new int[2];
		arrays[0]=0;
		arrays[1]=1;
		Car car=new Car("Reshma",1,eng,"REshma",1234,arrays);
		System.out.println(car);
		ObjectOutputStream objOpStr =new ObjectOutputStream(new FileOutputStream("reshma.ser"));
		objOpStr.writeObject(car);
		
		System.out.println("*********************************************************");
		ObjectInputStream objIpStr=new ObjectInputStream(new FileInputStream("reshma.ser"));
		Car carDes=(Car)objIpStr.readObject();
		System.out.println(carDes);
		
		
		
		
	}

}
