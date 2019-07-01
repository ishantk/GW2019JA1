package com.auribises;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class UtilAPIs {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println("Today is: "+date);
		
		SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat format2 = new SimpleDateFormat("dd/MM/yyyy | hh:mm:ss");
		String formattedDate1 = format1.format(date);
		String formattedDate2 = format2.format(date);
		System.out.println(">> formattedDate1: "+formattedDate1);
		System.out.println(">> formattedDate2: "+formattedDate2);

		Calendar calendar = Calendar.getInstance();
		int dd = calendar.get(Calendar.DAY_OF_MONTH);
		int mm = calendar.get(Calendar.MONTH);
		int yy = calendar.get(Calendar.YEAR);
		
		// Time can also be extracted
		
		System.out.println(">> "+dd+" / "+(mm+1)+" / "+yy);
		
	}

}
