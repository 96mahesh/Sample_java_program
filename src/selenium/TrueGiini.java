package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TrueGiini {

	@Test
	public void setup() throws Exception {
		WebDriver driver = new ChromeDriver();
	    driver.get("https://test.truboardpartners.com/NOCExternal/#/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("test1@truboardpartners.com");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Kuz16929");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		
		
		
		
	}
}
