package selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class LetcodeWindowHandles {

	@Test
	public void setUp() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver() ;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://letcode.in/windows");
	    driver.findElement(By.id("multi")).click();
	    
	    String parrentwin = driver.getWindowHandle();
	    System.out.println("Parrent window is :"+parrentwin);
	    
	    Set<String> win = driver.getWindowHandles();
	    List<String> newwin = new ArrayList<>(win);
	    for (String nwin : newwin) {
			System.out.println(nwin);
			if(!parrentwin.equals(nwin)) {
			driver.switchTo().window(nwin);
			String title = driver.getCurrentUrl();
			System.out.println(title);
			if(title.equals("https://letcode.in/dropdowns")) {
			driver.manage().window().maximize();
			Thread.sleep(2000);
			WebElement ele = driver.findElement(By.id("fruits"));
			Select select = new Select(ele);
			select.selectByIndex(5);
		    driver.close();
		    Thread.sleep(3000);	
			}
			
			else {
				Thread.sleep(2000);
				driver.findElement(By.id("accept")).click();
				Alert alert = driver.switchTo().alert();
				alert.accept();
				driver.close();
			}
			
			}
			
			
		}
	    driver.switchTo().window(parrentwin);
	    driver.close();
	}
}
