package com.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;

public class DateValidations {
	private static SimpleDateFormat sim = new SimpleDateFormat("dd/MM/yyyy");

	public static void main(String[] args) throws ParseException {
		
		Date d=new Date();
		 d = sim.parse(sim.format(d));
		 System.out.println(d);
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		System.out.println(cal.getTime());
		int year = cal.get(Calendar.YEAR);
		System.out.println("      "+year);
		
		
		
	
		String dateOfBirth = "123";
		String startDate = "24/01/2014";
		Date startDateObject = sim.parse(startDate);
		String endDate = "31/10/2019";
		Date endDateObject = sim.parse(endDate);
		Date dateOfBirthOf18 = get18AgeDateFromDateOfBirth(dateOfBirth);
		System.out.println("dateOfBirthOf18(************"+dateOfBirthOf18);
		boolean flag = startDateObject.before(endDateObject);
		if (!flag) {
			System.out.println("wrong start end should be before end date ");
		} else {
			boolean checkFlag = checkForEndAnd18AgeDate(dateOfBirthOf18, endDateObject);
			if (checkFlag) {
				System.out.println("Proceed ");
			} else {
				System.out.println(" Very bad ......endDate should be before 18th birthday of Person");
			}

		}
		System.out.println("*****************************************************************************");
		String dob="30/06/2001";
		
		Date dat14=getDate(dob,sim,14);
		Date dat18=getDate(dob,sim,18);
	Date a=new Date();
		System.out.println(a);
		System.out.println(dat14);
		System.out.println(dat18);
		checkBetweenAgeForDOB(a,dat14,dat18);
		
		
		
		
		System.out.println("******************************************");
		Date sysDate=new Date();
		String startDateStr = "20/06/2019";
		Date strtDateObj = sim.parse(startDateStr);
		
		Date todayWithZeroTime = sim.parse(sim.format(sysDate));
		System.out.println(todayWithZeroTime);
		
		System.out.println(strtDateObj);
		System.out.println(sysDate);
		System.out.println(todayWithZeroTime.equals(strtDateObj));
		
		System.out.println(todayWithZeroTime.compareTo(strtDateObj));
		
		
		
	}

	private static Date getDate(String dob, SimpleDateFormat sim2, int i) throws ParseException {
		Date dat=sim.parse(dob);
		Calendar cal=Calendar.getInstance();
		cal.setTime(dat);
		cal.add(Calendar.YEAR, i);
		Date dat14yearold=cal.getTime();
		
		return dat14yearold;
	}
	private static void checkBetweenAgeForDOB(Date todayDate, Date dobDate14, Date dobDate18) throws ParseException {

		boolean flagFor14Date = todayDate.before(dobDate14);
		if (flagFor14Date) {
			System.out.println("not in between 14 to 18");
		} else {
			boolean flagFor18Date = todayDate.after(dobDate18);
			if (flagFor18Date) {
				System.out.println("not in between 14 to 18");
			}
		}
	}
	private static boolean checkForEndAnd18AgeDate(Date dateOfBirthOf18, Date endDateObject) {
		if (endDateObject.before(dateOfBirthOf18)) {
			return true;
		}
		return false;
	}

	private static Date get18AgeDateFromDateOfBirth(String dateOfBirth) {

		Date dd = null;
		try {
			Date d = sim.parse(dateOfBirth);
			Calendar cal = Calendar.getInstance();
			cal.setTime(d);
			cal.add(Calendar.YEAR, 18);
			dd = cal.getTime();

		} catch (ParseException e) {
			System.out.println("exception " + e.getMessage());
		}

		return dd;
	}

}
