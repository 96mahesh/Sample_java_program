package selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenEmailJavaScript {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
JavascriptExecutor js = (JavascriptExecutor)driver;
//js.executeScript("document.getElementById('identifierId').value='krishna@gmail.com'");
String text = js.executeScript("return document.getElementById('identifierId').innerHTML").toString();
System.out.println("Text Method : "+text);
//js.executeScript("window.history.back()");
//js.executeScript("window.history.forward()");
	}
}
