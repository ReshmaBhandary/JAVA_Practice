package com.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-YY");
		String date = sdf.format(new Date());
		System.out.println(date);
		System.out.println("*************************************");
		
		
		String dateInString = "31-08-1982 10:20:56";
		Date date1 = sdf.parse(dateInString);
		System.out.println(date1); //Tue Aug 31 10:20:56 SGT 1982
		
		
		Date d=new Date();
		sdf.format(d);
		System.out.println(	sdf.format(d));

	}

}
