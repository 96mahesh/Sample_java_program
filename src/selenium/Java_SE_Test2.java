package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_SE_Test2 {

	public static void main(String[] args) throws Exception {
		
		 WebDriver driver= new ChromeDriver();			

		 JavascriptExecutor obj = (JavascriptExecutor)driver;
		 
		// Maximize the browser
		driver.manage().window().maximize();
		 
		// Launch Website
		driver.get("https://www.softwaretestinghelp.com/");
		//obj.executeScript("document.getElementById('enter element id').checked=false;");
//		String sText =  obj.executeScript("return document.documentElement.innerText;").toString();
//		System.err.println("java sub menu = :"+sText);
//		String submenu = obj.executeScript("$('ul.menus.menu-secondary.sf-js-enabled.sub-menu li').hover()").toString();
//		 System.err.println("java sub menu = : "+submenu);
		obj.executeScript("history.go(0)");
		//Declare and set the start time 
		System.out.println(System.currentTimeMillis());
		long start_time = System.currentTimeMillis();
		System.out.println(start_time);
		 
		obj.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);"); 
		System.out.println("Passed time: " + (System.currentTimeMillis() - start_time)); 
	
	  Thread.sleep(5000);
	  driver.close();
	  
	}
}
