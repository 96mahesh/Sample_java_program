package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowElement {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.salesforce.com/in/");
//		WebElement ele=driver.findElement(By.xpath("//hgf-c360nav")).getShadowRoot()
//		.findElement(By.cssSelector("hgf-button[data-tracking-type='cta-utility']"));
//		ele.click();
//		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement ele=(WebElement)js.executeScript("return document.querySelector(\"body > div.globalnav-wrapper-c360 > hgf-c360nav\").shadowRoot.querySelector(\"header > div.c360-nav__header > div.c360-nav__wrapper > div.c360-nav__header--mobile.with-cta > div.trial-container.cta-main > hgf-button\").shadowRoot.querySelector(\"a\")");
		js.executeScript("arguments[0].click()", ele);
		
		
//		
		
		
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//String cssSelectorForHost1 = "hgf-c360nav[locale='in']";
		//String cssSelectorForHost2 = " header:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(5) > hgf-button:nth-child(1)";
		//Thread.sleep(1000);
		//SearchContext shadow0 = driver.findElement(By.cssSelector("hgf-c360nav[locale='in']")).getShadowRoot();
		//Thread.sleep(1000);
		//SearchContext shadow1 = shadow0.findElement(By.cssSelector(" header:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(5) > hgf-button:nth-child(1)")).getShadowRoot();
		//Thread.sleep(5000);
		//WebElement ele = shadow1.findElement(By.cssSelector(" a:nth-child(1) > slot:nth-child(2)"));
		//js.executeScript("arguments[0].click()", ele);
		
	}
 
}


