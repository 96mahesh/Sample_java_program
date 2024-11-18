package selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ThreadLocalBrowser {
	public static WebDriver doBrowserSetup(String browserName){

        WebDriver driver = null;
        if (browserName.equalsIgnoreCase("chrome")){
            //steup chrome browser
           
            //Add options for --headed or --headless browser launch
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("-headed");
            
            //initialize driver for chrome
            driver = new ChromeDriver(chromeOptions);

            //maximize window
            driver.manage().window().maximize();

            //add implicit timeout
            driver.manage()
           .timeouts()
           .implicitlyWait(Duration.ofSeconds(30));

        }
   return driver;
}
}
