package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Truegreen2 {

	WebDriver driver;
	
	@Test
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		driver.get("https://trugreen-qa.truboardpartners.com/trugreen");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("userSite", Keys.TAB, "password", Keys.TAB, Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Procurement']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='RFP']")).click();
		Thread.sleep(3000);
		
		WebElement ele = driver.findElement(By.xpath("(//input[@type='search'])[1]"));
		System.out.println(ele.getDomAttribute("ele"));
		System.out.println(ele.getText());
		ele.click();
		
	 //System.out.println(driver.getPageSource());
		//String page_source = driver.getPageSource();
		
//		 String formattedPageSource = "<pre>" + page_source + "</pre>";
//	        System.out.println(formattedPageSource);
		
		
		List<WebElement> list = driver.findElements(By.xpath("//div[contains(@class,' mantine-Select-item')]"));
		Thread.sleep(3000);
		for(WebElement e : list) {
			String text = e.getText();
			System.out.println(text);
			//e.click();
		}
		
		driver.findElement(By.xpath("//div[contains(@class, 'mantine-Select-item') and not(contains(@class, 'mantine-Select-itemsWrapper')) and contains(string(), 'Client Alpha')]")).click();
		
		System.out.println("==========================");
		

		driver.findElement(By.xpath("(//input[@type='search'])[2]")).click();
		
		List<WebElement> list1 = driver.findElements(By.xpath("//div[contains(@class,' mantine-Select-item')]"));
		Thread.sleep(3000);
		for(WebElement e : list1) {
			String text = e.getText();
			System.out.println(text);
			//e.click();
		}
		
		driver.findElement(By.xpath("//div[contains(@class, 'mantine-Select-item') and not(contains(@class, 'mantine-Select-itemsWrapper')) and contains(string(), 'Alpha Three')]")).click();

		

	}
}

//for(int i=0;i<20;i++) {
//client.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
//client.click();
//String attributevalue=client.getAttribute("value");
//if(attributevalue.equals("Client Alpha")) {
//	client.sendKeys(Keys.ENTER);
//	//ExtentReportManager.logInfo("selected client alpha from client dropdown");
//	break;
//}
//}
