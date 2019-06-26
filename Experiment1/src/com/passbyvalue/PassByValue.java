package com.passbyvalue;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PassByValue {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		String s1 = "Reshma";
		String s2 = "Reshma1";
		try (BufferedReader br = new BufferedReader(new FileReader("C:\\journaldev.txt"))) {
			System.out.println(br.readLine());
		} 

	}

}
