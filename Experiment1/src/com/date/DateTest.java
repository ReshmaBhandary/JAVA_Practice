package com.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-YYYY");
		sdf.setLenient(false);
		String date = sdf.format(new Date());
		System.out.println(date);
		System.out.println("*************************************");
		
		
		String dateInString = "31-08-1982 10:20:56";
		Date date1 = sdf.parse(dateInString);
		System.out.println(date1); //Tue Aug 31 10:20:56 SGT 1982
		
		
		Date d=new Date();
		sdf.format(d);
		System.out.println(	sdf.format(d));
		
		System.out.println("*************************************");
		String ad="13-19-2019";
		Date ddd=sdf.parse(ad);
		System.out.println(ddd);
		System.out.println("*************************************");
		
		/* DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		 format.setLenient(false);
		 String q = "29/18/2017";
	        try {
	            format.parse(q);
	            System.out.println("hi");
	        } catch (ParseException e) {
	            System.out.println("Date " + q + " is not valid according to " +
	                ((SimpleDateFormat) format).toPattern() + " pattern.");
	        }
*/
	}

}
