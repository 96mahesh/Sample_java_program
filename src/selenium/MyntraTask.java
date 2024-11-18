package selenium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class MyntraTask {

	@Test
	public void setup() throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		//options.addArguments("--use-fake-ui-for-media-stream");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.Myntra.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Women' and @data-group='women']")).click();
		
		
		WebElement ele= driver.findElement(By.xpath("//h4[text()='Biggest Deals On Top Brands']"));
		Thread.sleep(10000);
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()", ele);
		
		Thread.sleep(3000);
		List<WebElement> imgLoc = driver.findElements(By.xpath("//div[@class='container-container ']//div[@class='container-container ']//a"));
		System.out.println(imgLoc.size());
		
		List<String> str = new ArrayList<>();
		for(int i=0;i<imgLoc.size();i++) {
			Thread.sleep(2000);
			String s =imgLoc.get(i).getAttribute("href");
			System.out.println(s);
			str.add(s);
//			if(str.size()==17) {
//				Thread.sleep(2000);
//				imgLoc.get(i).click();
//				break;
//			}
			
			if(s.equals("https://www.myntra.com/womens-western-wear?f=Brand%3AONLY")) {
				imgLoc.get(i).click();
			}
		}
		System.out.println(str.size());

		
	}
}
////div[@class=' column-base']//following-sibling::img[@class='image-image undefined image-hand']
//WebElement ele1= driver.findElement(By.xpath("//h4[text()='Categories To Bag']"));
//Thread.sleep(3000);
//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()", ele1);
//Thread.sleep(3000);
//List<WebElement> imgLoc1 = driver.findElements(By.xpath("//div[@class='container-container ']//div[@class='container-container ']//following-sibling::img[@class='image-image undefined image-hand']"));
//Thread.sleep(2000);
//
//WebElement ele2= driver.findElement(By.xpath("//h4[text()='Trending In Western Wear']"));
//Thread.sleep(3000);
//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()", ele2);
//Thread.sleep(3000);
//List<WebElement> imgLoc2 = driver.findElements(By.xpath("//div[@class='container-container ']//div[@class='container-container ']//following-sibling::img[@class='image-image undefined image-hand']"));
//Thread.sleep(2000);
//
//WebElement ele3= driver.findElement(By.xpath("//h4[text()='Trending In Sports Wear']"));
//Thread.sleep(3000);
//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()", ele3);
//Thread.sleep(3000);
//List<WebElement> imgLoc3 = driver.findElements(By.xpath("//div[@class='container-container ']//div[@class='container-container ']//following-sibling::img[@class='image-image undefined image-hand']"));
//Thread.sleep(2000);
//
//WebElement ele4= driver.findElement(By.xpath("//h4[text()='Trending In Accessories']"));
//Thread.sleep(3000);
//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()", ele4);
//Thread.sleep(3000);
//List<WebElement> imgLoc4 = driver.findElements(By.xpath("//div[@class='container-container ']//div[@class='container-container ']//following-sibling::img[@class='image-image undefined image-hand']"));
//Thread.sleep(2000);
//String a[] = new String[]{"imgLoc1","imgLoc2","imgLoc3","imgLoc4"};
//List<String> total = new ArrayList<>(Arrays.asList(a));
