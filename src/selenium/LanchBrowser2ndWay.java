package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LanchBrowser2ndWay {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://gmail.com");
		
		By emailL = By.xpath("//*[@name='hiddenPassword']");
		WebElement e = driver.findElement(emailL);
		//elemet.sendKeys("functionalhead@texila.org",Keys.TAB, "Texila@123",Keys.ENTER);
		
		if(e.isDisplayed()) {
		System.out.println("Element is Dispalye");	
		if(e.isEnabled()) {
			System.out.println("Element is enable");
		}
		else {
			System.out.println("Element is Not Dispaled");
		}
		}
		
		else {
			System.out.println("Hidden Element");
		}
	
	}
}
