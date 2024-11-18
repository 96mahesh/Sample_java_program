package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Patasala {
	@Test
	public void setUp()throws Exception {	
		WebDriver driver = new ChromeDriver();
		driver.get(" https://testperform.patasala.co/");
		
		driver.findElement(By.xpath("//input[@data-placeholder='Email address']")).sendKeys("prasad@testperform");
		driver.findElement(By.xpath("//input[@data-placeholder='Password']")).sendKeys("password");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("//a[text()='Admit']"));
		Actions action = new Actions(driver);
		action.click(ele).build().perform();
		driver.findElement(By.xpath("//button[@id='Applicants']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Add applicant']")).click();
		
	}
}
