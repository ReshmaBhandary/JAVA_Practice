package com.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CountDays {

	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		System.out.println("Date in type "+d);
		SimpleDateFormat smpdf=new SimpleDateFormat("dd-MM-yyyy");
		String date=smpdf.format(d);
		System.out.println("String date in dd-MM-yyyy "+date);
		System.out.println("Back to date without timestamp "+smpdf.parse(date));
		String strDate="06-04-2019 10:20:56";
		System.out.println("****************************");
		
		
		Date dat=smpdf.parse(strDate);
		System.out.println("String to date "+dat);
		//SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Calendar c = Calendar.getInstance();
		c.setTime(dat); // Now use today date.
		c.add(Calendar.DATE, 90); // Adding 5 days
		String output = smpdf.format(c.getTime());
		System.out.println("String date in dd-MM-yyyy "+output);
		
		
		
		

	}

}
