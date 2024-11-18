package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Truegreen {

	WebDriver driver;
	
	@Test
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		driver.get("https://trugreen-qa.truboardpartners.com/trugreen");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("userSite", Keys.TAB, "password", Keys.TAB, Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Procurement']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='RFP']")).click();
		Thread.sleep(3000);
		
		List<WebElement> ele = driver.findElements(By.xpath("//div[contains(@class,' mantine-Select-item')]"));
		for(WebElement e : ele) {
			String text = e.getText();
			System.out.println(text);
			e.click();
		}
		System.out.println("==========================");
//		WebElement ele = driver.findElement(By.xpath("//input[@type='search'])[2]"));
//		((JavascriptExecutor) driver).executeScript("arguments[0].value'Client Alpha'", ele);
//		Thread.sleep(2000);
		
//		WebElement ele = driver.findElement(By.xpath("(//div[@class='mantine-1qj7q0z mantine-Input-rightSection mantine-Select-rightSection'])[1]"));
////		el.click();
//		String data = ele.getAttribute("value");
//		System.out.println(data);
//		for(int i=1;i<=15;i++) {
//			 driver.findElement(By.xpath("(//div[@class='mantine-1qj7q0z mantine-Input-rightSection mantine-Select-rightSection'])[1]"));
//			ele.sendKeys(Keys.ARROW_DOWN );
//		}
//		ele.sendKeys(Keys.ENTER);
//		
//		
//		
//		WebElement el = driver.findElement(By.xpath("(//input[@type='search'])[2]"));
////		el.click();
//		for(int i=1;i<2;i++) {
//			 driver.findElement(By.xpath("(//input[@type='search'])[2]"));
//			el.sendKeys(Keys.ARROW_DOWN );
//		}
//		ele.sendKeys(Keys.ENTER);
//		for(int i=1; i<=15; i++)
//		{
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("(//input[@value='Client Theta - Th'])[2]")).sendKeys(Keys.ARROW_DOWN);
//			if(i==12)
//			{
//				driver.findElement(By.xpath("(//input[@value='Client Theta - Th'])[2]")).sendKeys(Keys.ENTER);
//				break;
//			}
//		}
		
//		String value="";
//		for(int i=1; i<=15; i++)
//		{
//			if(i==1)
//			{
//			Thread.sleep(1000);
//			WebElement ele=driver.findElement(By.xpath("(//input[@value='Client Theta - Th'])[2]"));
//			ele.sendKeys(Keys.ARROW_DOWN);
//			ele.sendKeys(Keys.ENTER);
//			value=ele.getAttribute("value");
//			System.out.println("Value is : "+value);
//			}
//			else
//			{
//				Thread.sleep(1000);
//				WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
//				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@value='"+value+"'])[2]")));
//				WebElement ele=driver.findElement(By.xpath("(//input[@value='"+value+"'])[2]"));
//				ele.click();
//				ele.sendKeys(Keys.ARROW_DOWN);
//				ele.sendKeys(Keys.ENTER);
//				value=ele.getAttribute("value");
//				System.out.println("Value is : "+value);
//				
//				if(value.equalsIgnoreCase("Client Alpha"))
//				{
//					Thread.sleep(1000);
//					ele.sendKeys(Keys.ENTER);
//					break;
//				}
//			}
//			
//			
//		}
//		
//		driver.findElement(By.xpath("(//input[@value='Alpha Four'])[2]")).click();
//		String val="";
//		for(int  i=1;i<=2;i++) {
//			
//			if(i==1) {	
//				Thread.sleep(1000);
//				WebElement el = driver.findElement(By.xpath("(//input[@value='Alpha Four'])[2]"));
//				el.sendKeys(Keys.ARROW_DOWN);
//				el.sendKeys(Keys.ENTER);
//			    val = el.getAttribute("value");
//				System.out.println(val);
//			}
//			
//			else {
//				Thread.sleep(1000);
////				WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
////				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@value='"+val+"'])[2]")));
//				WebElement el=driver.findElement(By.xpath("(//input[@value='"+val+"'])[2]"));
//				el.click();
//				el.sendKeys(Keys.ARROW_DOWN);
//				el.sendKeys(Keys.ENTER);
//				value=el.getAttribute("value");
//				System.out.println("Value is : "+val);
//				
//				if(value.equalsIgnoreCase("Alpha Three"))
//				{
//					Thread.sleep(1000);
//					el.sendKeys(Keys.ENTER);
//					break;
//				}
//			}
//		}
		
		


	}
}
