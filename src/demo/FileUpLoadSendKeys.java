package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpLoadSendKeys {
	public static void main(String[] args) throws Exception  {
		   // TODO Auto-generated method stub
		 
		   WebDriver d = new ChromeDriver();
		   d.manage().window().maximize(); //always write wait code after this
		   //d.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS); //for page load
		   d.get("https://www.monsterindia.com/seeker/registration"); //Testing webpage
		   //d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //for Implicit wait
		 
		   JavascriptExecutor js = (JavascriptExecutor)d; //Scrolling using JavascriptExecutor
		   js.executeScript("window.scrollBy(0,380)");//Scroll Down to file upload button (+ve)
		   Thread.sleep(3000);
		 
		   // FILE UPLOADING USING SENDKEYS ....
		   Thread.sleep(3000);
		   WebElement browse = d.findElement(By.xpath("//div[@class='contentTitle']"));
		   //click on ‘Choose file’ to upload the desired file
		   Actions action = new Actions(d);
		   action.click(browse).build().perform();
		   browse.sendKeys("C:\\Users\\Admin\\Downloads\\BaseClass.java"); //Uploading the file using sendKeys
		   System.out.println("File is Uploaded Successfully");
		 
		   }
}
