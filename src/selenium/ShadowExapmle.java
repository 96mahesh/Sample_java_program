package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowExapmle {

	public static void main(String[] args) throws Exception {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/");
	    driver.manage().window().maximize();	
		Thread.sleep(1000);
		SearchContext shadow0 = driver.findElement(By.cssSelector("hgf-c360nav[locale='in']")).getShadowRoot();
		Thread.sleep(1000);
		SearchContext shadow1 = shadow0.findElement(By.cssSelector("hgf-c360login[aria-haspopup='true']")).getShadowRoot();
		Thread.sleep(1000);
		SearchContext shadow2 = shadow1.findElement(By.cssSelector(".utility-button")).getShadowRoot();
		Thread.sleep(1000);
		WebElement ele = shadow2.findElement(By.cssSelector(".hgf-button"));
		((JavascriptExecutor)driver).executeScript("arguments[0].click()", ele);
}
}
