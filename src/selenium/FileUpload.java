package selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload {
	
	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.sejda.com/en/index.html");
		 
		 driver.findElement(By.id("heroHomepageBtn")).click();
		 WebElement ele = driver.findElement(By.xpath("//span[text()='Upload PDF file']"));
		 Actions action = new Actions(driver);
		 action.click(ele).build().perform();
		 
	}

}
