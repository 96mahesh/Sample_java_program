
package selenium;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrokenLinks {

	@Test
	public void verifyLinkResponce() throws  IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		int count = 0;
		
		By LinksL = By.tagName("a");
		List<WebElement> info =  driver.findElements(LinksL);
		for (WebElement ele : info) {
			String url = ele.getAttribute("href");
			System.out.println(url);
			
			if(url==null || url.isEmpty() || url.isBlank()) {
				count++;
				System.out.println("Is Blank Url : "+url+"Count :"+count);
				continue;
			}
			
			if(!url.contains("https://www.amazon.in/")) {
				System.out.println("Not Having Base Url : "+url);
			}
			
            HttpsURLConnection httpurl = (HttpsURLConnection)(new URL(url).openConnection());
			httpurl.setRequestMethod("HEAD");
			httpurl.connect();
			int responcecode = httpurl.getResponseCode();
			
			if(responcecode>=500) {
				System.out.println("Responce Code "+responcecode+"App is doen because of server down : " + url);
			}
			else if(responcecode>=400 && responcecode<500) {
				System.out.println("Responce Code "+responcecode+"App is doen because of client issue : " + url);
			}
			else if(responcecode>=300 && responcecode<400) {
				System.out.println("Responce Code "+responcecode+"Responce Code : " + url);
			}
			else if(responcecode>=200 && responcecode<300) {
				System.err.println("Responce Code "+responcecode+"SuccessMsg : " + url);
			}
			
			else  {
				System.out.println("Responce Code "+responcecode+"Information msg : " + url);
			}
		}
	}
}
