package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleWindowHandles {

	@Test
	public void handleWindows() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html#google_vignette");
		
		driver.findElement(By.id("newWindowBtn")).click();
		
		String parrentwin = driver.getWindowHandle();
		System.out.println(parrentwin);
		Set<String> window = driver.getWindowHandles();
		for (String win : window) {
			System.out.println(win);
			if(!parrentwin.equals(win)) {
				driver.switchTo().window(win);
				driver.manage().window().maximize();
				driver.findElement(By.xpath("//input[@placeholder='Enter First Name']")).sendKeys("mahesh babu");
				Thread.sleep(3000);
				driver.close();
			}
		}
		
		driver.switchTo().window(parrentwin);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='text' and @id ='name']")).sendKeys("rampatruni");
		driver.close();
	}
	
	
	@Test
	public void handleTabs() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html#google_vignette");
		
		driver.findElement(By.id("newTabBtn")).click();
		
		String parrentwin = driver.getWindowHandle();
		System.out.println(parrentwin);
		Set<String> window = driver.getWindowHandles();
		for (String win : window) {
			System.out.println(win);
			if(!parrentwin.equals(win)) {
				driver.switchTo().window(win);
				driver.manage().window().maximize();
				driver.findElement(By.xpath("//button[@onclick='alertFunction()']")).click();
			    driver.switchTo().alert().accept();
				Thread.sleep(3000);
				driver.close();
			}
		}
		
		driver.switchTo().window(parrentwin);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='text' and @id ='name']")).sendKeys("rampatruni");
		driver.close();
	}
	
	
}
