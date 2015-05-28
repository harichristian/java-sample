package moba.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("dd");

		// Get the date today using Calendar object.
		Date today = Calendar.getInstance().getTime();        
		// Using DateFormat format method we can create a string 
		// representation of a date with the defined format.
		String reportDate = df.format(today);

		// Print what date is today!
		System.out.println("Report Date: " + reportDate);
		
		
		df = new SimpleDateFormat("HH");
		Date date = Calendar.getInstance().getTime();        
		int hh = Integer.parseInt(df.format(date));
		System.out.println("HH = " + hh);
		
	}
}