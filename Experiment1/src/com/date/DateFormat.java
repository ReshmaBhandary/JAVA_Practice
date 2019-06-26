package com.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormat {

	public static void main(String[] args) throws ParseException {
		//String anme="REshma";
		//System.out.println(anme.replace("E", "e"));
	/*	SimpleDateFormat sim = new SimpleDateFormat("dd/MM/yyyy");
		String date = "8/5/0019";
		Date d = sim.parse(date);
		System.out.println(d);
		System.out.println("************************************");
		// input format: MM/yy

		String expireDate = "22/5/19";
		SimpleDateFormat parser = new SimpleDateFormat("MM/dd/yy");
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		formatter.parse(expireDate);
		System.out.println(formatter.format(formatter.parse(expireDate)));

		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");*/

		// System.out.println(formatter.format(parser.parse("5/22/19")));

		//System.out.println("isValid - dd/MM/yyyy with 20130925 = " + isValidFormat("dd/MM/yyyy", "20130925"));
	//	System.out.println("isValid - dd/MM/yyyy with 25/09/2013 = " + isValidFormat("dd/MM/yyyy", "25/09/13"));
		/*System.out.println("isValid - dd/MM/yyyy with 25/09/2013 12:13:50 = "
				+ isValidFormat("dd/MM/yyyy", "25/09/2013  12:13:50"));*/
		
		//System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		String inputDate="22/05/29";
	boolean	correctDate=checkDate(inputDate);
	/*String a="0028";
	System.out.println(a.length());
	//System.out.println(correctDate);
*/	getFormattedDate(inputDate, correctDate);
System.out.println("***********************************************************************************");
SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
String dd="14/06/2018";
Date a1=formatter.parse(dd);
Date d=new Date();
System.out.println(a1);
System.out.println(d);
System.out.println(d.equals(a1));
System.out.println(d.before(a1));

	}

	private static void getFormattedDate(String inputDate, boolean correctDate) throws ParseException {
		if(!correctDate) {
				SimpleDateFormat parser = new SimpleDateFormat("dd/MM/yy");
				SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
				//System.out.println(parser.parse(inputDate));
				/*Date d=parser.parse(inputDate);
			
				Calendar cal = Calendar.getInstance();
				cal.setTime(d);*/
				/*int year = cal.get(Calendar.YEAR);
				System.out.println("      "+year);*/
				
				
				
				//System.out.println(formatter.format(parser.parse(inputDate)));
				inputDate=formatter.format(parser.parse(inputDate));
				//inputDate=formatter.format(d);
				System.out.println(inputDate);
			}
	}

	private static boolean checkDate(String inputDate) throws ParseException {
		SimpleDateFormat sfd=new SimpleDateFormat("dd/MM/yyyy");
		Date parsedDate=sfd.parse(inputDate);
		//System.out.println("parsedDate "+ parsedDate);
		String formateDate=sfd.format(parsedDate);
		System.out.println("formateDate "+formateDate);
		if(!inputDate.equals(formateDate)) {
			return false;
		}
		
		return true;
	}

	

}
