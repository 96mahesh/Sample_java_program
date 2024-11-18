package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowRootElement {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/");
		
		Thread.sleep(1000);
		SearchContext shadow0 =  driver.findElement(By.cssSelector("hgf-c360nav[locale='in']")).getShadowRoot();
		Thread.sleep(1000);
		SearchContext shadow1 =  shadow0.findElement(By.cssSelector("hgf-button[data-tracking-type='cta-utility'][size='default']")).getShadowRoot();
		Thread.sleep(1000);
		WebElement ele = shadow1.findElement(By.cssSelector(".hgf-button"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", ele);
	}

}

