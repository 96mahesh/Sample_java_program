package selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDown {
	 
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://playwright.dev/dotnet/docs/api/class-locator");
		
		driver.manage().window().maximize();
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='dropdown__menu']"));
		List<String> value = new ArrayList<String>();
		
		for (WebElement ele : list) {
			Actions action = new Actions(driver);
			action.moveToElement(ele).build().perform();
		   System.out.println(ele.getText());
		 
		}
		
	}
}
