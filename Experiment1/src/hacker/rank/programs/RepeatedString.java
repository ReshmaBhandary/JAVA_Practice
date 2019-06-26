package hacker.rank.programs;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RepeatedString {

	// Complete the repeatedString function below.
	static long repeatedString(String s, long n) {
		int countOfLetterA=0;
		//how many times ans should be multiplied
		long ans=n/s.length();
		//count number of a's in given string
		for(int i=0;i<s.length();i++){
			if('a'==(s.charAt(i))){
				countOfLetterA++;
			}
		}
		long totalCount=countOfLetterA*ans;
		long remainder=n-ans*s.length();
		for(int i=0;i<remainder;i++){
			if('a'==(s.charAt(i))){
				totalCount++;
			}	
		}
		
		

		return totalCount;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		/*
		 * BufferedWriter bufferedWriter = new BufferedWriter(new
		 * FileWriter(System.getenv("OUTPUT_PATH")));
		 * 
		 * String s = scanner.nextLine();
		 * 
		 * long n = scanner.nextLong();
		 * scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		 */
		long n = 1000000000000L;
		String s = "a";

		long result = repeatedString(s, n);
		System.out.println("result " + result);

		// bufferedWriter.write(String.valueOf(result));
		// bufferedWriter.newLine();
		//
		// bufferedWriter.close();

		scanner.close();
	}
}
