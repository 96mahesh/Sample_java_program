package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HightLightFeailds {

	@Test
	
	public void elementHighlight() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		highlightOfElement(driver, email);
		email.sendKeys("7842358565");
		
		WebElement pass = driver.findElement(By.xpath("//input[@name='pass']"));
		highlightOfElement(driver, pass);
		email.sendKeys("swapna");
		
		WebElement login = driver.findElement(By.xpath("//button[text()='Log in']"));
		highlightOfElement(driver, login);
		email.click();
		
		driver.close();
	}
	
	public static void highlightOfElement(WebDriver driver ,WebElement element ) {
		//((JavascriptExecutor)driver).executeScript("arguments[0].style.border='2px solid red';"+"arguments[0].style.backgroundColor='violet';", element);
		((JavascriptExecutor)driver).executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
	}
}
