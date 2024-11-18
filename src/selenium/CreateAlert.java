package selenium;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAlert {

	public static void main(String[] args) throws ParseException {
		
		WebDriver driver = new ChromeDriver();
		DateTimeFormatter date = DateTimeFormatter.ofPattern("dd MMM yyyy hh:mm:ss ");
		LocalDateTime localdatetime = LocalDateTime.now();
		String newdate = localdatetime.format(date);
		System.out.println(newdate);
		driver.get("https://www.google.com");
		DateTimeFormatter date1 = DateTimeFormatter.ofPattern("dd MMM yyyy hh:mm:ss ");
		LocalDateTime localdatetime1 = LocalDateTime.now();
		String newdate1 = localdatetime1.format(date1);
		System.out.println(newdate1);
		driver.findElement(By.xpath("//a[text()='Gmail']")).click();
		DateTimeFormatter date2 = DateTimeFormatter.ofPattern("dd MMM yyyy hh:mm:ss ");
		LocalDateTime localdatetime2 = LocalDateTime.now();
		String newdate2 = localdatetime2.format(date2);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		System.out.println(newdate2);
		js.executeScript("alert('Welcome google');");
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy hh:mm:ss ");
		System.out.println(sdf.parse(newdate).before(sdf.parse(newdate1)));
		
		
//		Robot robo = new Robot();
//		robo.
	
	

	}
}
