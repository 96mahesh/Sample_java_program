package selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorMethods {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(5000);
		js.executeScript("location.reload()");
		
		//js.executeAsyncScript("window.scrollBy(100,document.body.scrollHeight)");
		
		
		
	}
}
