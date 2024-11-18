package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Practice2 {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("incognito");
		WebDriver driver = new ChromeDriver();
		//WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(option);
		
       driver.get("https://gmail.com");
		
		By emailL = By.name("identifier");
		WebElement e = driver.findElement(emailL);
		e.sendKeys("rampatrunimaheshbabu@gmail.com", Keys.ENTER);
		
		
		
	}
}
