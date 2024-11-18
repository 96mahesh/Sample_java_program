package selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class FindLowsetPrice {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.makemytrip.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(7000);
 
		By deputureL = By.cssSelector("#departure");
		WebElement deputure = driver.findElement(deputureL);
		Actions action = new Actions(driver);
		action.click(deputure).build().perform();
		
 
		By piceL = By.cssSelector("[class=' todayPrice']");
		List<WebElement> Price = driver.findElements(piceL);
		List<String> pricelist = new ArrayList<String>();
		Thread.sleep(5000);
		for (WebElement ele : Price) {
			String data = ele.getText();
			//System.out.println(data);			
			pricelist.add(data);
		  }
		int Size = pricelist.size();
		System.out.println(Size);
		int a[] = new int[Size];
		
		for(int i=0;i<Size;i++) {
			String newstr = pricelist.get(i).replace("", "");
			System.out.println(newstr);
			try {
			a[i] = Integer.parseInt(newstr);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		
 
		int min = a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min)
			min = a[i];
			
		}
		
		System.out.println("Minimum Price : "+min);
 
		String minv = Integer.toString(min);
		
		List<String> value = new ArrayList<String>();
		value.add(minv);
		System.out.println(value);
		
	}
}
