package selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HyrWindowHandles {

	@Test
	public void setUp() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver() ;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html#google_vignette");
	    driver.findElement(By.id("newWindowsBtn")).click();
	    
	    String parrentwin = driver.getWindowHandle();
	    System.out.println("Parrent window is :"+parrentwin);
	    
	    Set<String> win = driver.getWindowHandles();
	    List<String> newwin = new ArrayList<>(win);
	    for (String nwin : newwin) {
			System.out.println(nwin);
			if(!parrentwin.equals(nwin)) {
			driver.switchTo().window(nwin);
			String title = driver.getTitle();
			System.out.println(title);
			if(title.equals("XPath Practice - H Y R Tutorials")) {
			driver.manage().window().maximize();
			Thread.sleep(2000);
			WebElement ele = driver.findElement(By.xpath("//input[@name='name' and @maxlength='10']"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()", ele);
			Thread.sleep(2000);
			ele.sendKeys("Mahesh Babu");
		    driver.close();
		    Thread.sleep(3000);	
			}
			
			else {
				Thread.sleep(2000);
				driver.findElement(By.id("firstName")).sendKeys("Rampatruni");
				driver.close();
			}
			
			}
			
			
		}
	    driver.switchTo().window(parrentwin);
	    driver.findElement(By.xpath("//input[@type='text' and @id ='name']")).sendKeys("Power star pawan kalyan");
	    driver.close();
	}
}
