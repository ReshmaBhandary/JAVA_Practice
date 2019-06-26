package com.serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class AccountTest {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectOutputStream objOutPut=new ObjectOutputStream(new FileOutputStream("C:\\Users\\r.bhandary\\Desktop\\in.ser"));
		Account acc=new Account("Savings", 1234,new Type("reshmatype", "12"));
		objOutPut.writeObject(acc);
		objOutPut.close();
		System.out.println("Serializable done");
		
		
		
		ObjectInputStream objIntput=new ObjectInputStream(new FileInputStream("C:\\Users\\r.bhandary\\Desktop\\in.ser"));
		Account bcc=(Account) objIntput.readObject();
		objIntput.close();
		System.out.println(bcc.getAccountName() +  "  " + bcc.getAccountNumber());
		System.out.println(bcc.getId());
		System.out.println(bcc.getName());
	//	System.out.println(" "+bcc.getType().getId());
		
	}

}
