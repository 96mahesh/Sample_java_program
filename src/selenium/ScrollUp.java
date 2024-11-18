package selenium;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ScrollUp {

	@Test
    public void scrollDown() throws InterruptedException

 {
     //System.setProperty("webdriver.gecko.driver","D://Selenium Environment//Drivers//geckodriver.exe");

     WebDriver driver = new ChromeDriver();
     driver.get("https://jqueryui.com/datepicker/"); // Specify the website URL

      //to perform Scroll on application using Selenium
//      JavascriptExecutor js = (JavascriptExecutor) driver;
//      js.executeScript("scrollBy(0,350)", "");
//      Thread.sleep(30000);
//      
//      JavascriptExecutor js1 = (JavascriptExecutor) driver;
//      js1.executeScript("window.scrollBy(0,-350)", "");
     
     Actions action = new Actions(driver);
     action.sendKeys(Keys.PAGE_DOWN).build().perform();
     Thread.sleep(20000);
     action.sendKeys(Keys.PAGE_UP).build().perform();
  }
}
