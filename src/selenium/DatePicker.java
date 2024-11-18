package selenium;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DatePicker {
   
	@Test
   public void setup() {
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://jqueryui.com/datepicker/");
		
		WebElement example = driver.findElement(By.xpath("//h2[text()='Examples']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView()", example);
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.cssSelector("[class='hasDatepicker']")).click();
					
		DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss a");
		LocalDateTime localdatetime = LocalDateTime.now();
		String newdate = localdatetime.format(date);
		System.out.println(newdate);
		int currentdate = localdatetime.getDayOfMonth();
		System.out.println("Current date :"+currentdate);
		
		By dateL = By.xpath("//*[text()='"+currentdate+"']");
		WebElement sysdate = driver.findElement(dateL);
		Assert.assertTrue(sysdate.isDisplayed(), "TestSriptFailed");
   }
}
