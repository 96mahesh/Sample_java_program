package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleVerify {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Google")) {
			System.out.println("Verifid");
		}
		else {
			System.out.println("faild");
		}
		
		String p = driver.getPageSource();
		System.out.println(p);
	}
}
