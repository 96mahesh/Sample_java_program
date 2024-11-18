package demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateMethods {

	public static void main(String[] args) throws ParseException {
		
		DateTimeFormatter date = DateTimeFormatter.ofPattern("dd MM yyyy hh:mm:ss ");
		LocalDateTime localdatetime = LocalDateTime.now();
		String newdate = localdatetime.format(date);
//		System.out.println(newdate);
//		System.out.println(localdatetime.getDayOfMonth());
//		System.out.println(localdatetime.getMonthValue());
//		System.out.println(localdatetime.getYear());
//		System.out.println(localdatetime.getHour());
//		System.out.println(localdatetime.getMinute());
//		System.out.println(localdatetime.getSecond());
//		long timestamp = System.currentTimeMillis();
//		System.err.println(timestamp);
		
		
		DateTimeFormatter date1 = DateTimeFormatter.ofPattern("dd MM yyyy hh:mm:ss ");
		LocalDateTime localdatetime1 = LocalDateTime.now();
		String newdate1 = localdatetime1.format(date1);
		System.out.println(newdate);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy hh:mm:ss ");
		System.out.println(sdf.parse(newdate).before(sdf.parse(newdate1)));
		
//		ZoneId z = ZoneId.of( "America/Montreal" );
//		LocalDate today = LocalDate.now( z );
//		System.out.println(today);
		
		
	}
}
