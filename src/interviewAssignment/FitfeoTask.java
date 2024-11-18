package interviewAssignment;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.testng.Assert;

public class FitfeoTask {

	public static void main(String[] args) throws Exception {
		
		// Open Browser 
		WebDriver driver = new ChromeDriver();
		
		// navigate to fitpeo home page
		driver.get("https://www.fitpeo.com/");
		
		//  Maximize window
		driver.manage().window().maximize();
		
		// click on revenue calculator or navigate to revenue calculator page
		driver.findElement(By.xpath("//div[text()='Revenue Calculator']")).click();
		Thread.sleep(3000);
		
		//validate revenue calculator page
		String actual_url = driver.getCurrentUrl();
		System.out.println("actual url is :"+actual_url);
		String expected_url = "https://fitpeo.com/revenue-calculator";
		
		if(actual_url.equals(expected_url)) {
			System.out.println("test case pass");
		}
		else {
			System.out.println("test case fail");
		}
		
		
		// scroll down to revenue calculator slider visible
		WebElement slider =driver.findElement(By.xpath("//h4[text()='Medicare Eligible Patients']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView()", slider);
		
		// adjust slider up to 996
		
		WebElement slider_adjust = driver.findElement(By.xpath("//span[@class='MuiSlider-rail css-3ndvyc']"));
		Actions action = new Actions(driver);
		
		
		//action.moveToElement(slider_adjust).clickAndHold().moveByOffset(0,350).release().perform();
		action.dragAndDropBy(slider_adjust, (int) 0.5,0).perform();
		System.out.println(slider_adjust.getLocation());
		System.out.println(slider_adjust.getSize());
		
		//coller assertion
		
		String bgcolor = slider_adjust.getCssValue("background-color");
		System.out.println(bgcolor);
		Assert.assertEquals(bgcolor, "rgba(215, 166, 109, 1)");
		String actualcolor = Color.fromString(bgcolor).asHex();
		System.out.println(actualcolor);
		Assert.assertEquals(actualcolor, "#d7a66d");
		System.out.println("assertion is done");

		// set text  560
		
		WebElement value = driver.findElement(By.xpath("//input[@id=':r0:']"));
		value.sendKeys(Keys.chord(Keys.CONTROL,"a"),"820");
		
		String text_value = value.getAttribute("value");
		System.out.println(text_value);
		String actualvalue = "820";
		Assert.assertEquals(text_value, actualvalue);
		
		// scroll feature check boxs
		
		//WebElement fscroll = driver.findElement(By.xpath("//p[contains(text(),'Total Recurring')]"));
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,450)", "");
		
		//click the fracture check boxes
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']//following-sibling::span//following::span"));
		for (WebElement ele : checkbox) {
			String txt = ele.getText();
			System.out.println(txt);
			if(txt.equals("57") || txt.equals("19.19") || txt.equals("63") || txt.equals("15"))
				ele.click();
		}
		
		// validate Total Recurring Reimbursement for all Patients Per Month:
		
		String txt = driver.findElement(By.xpath("//div[contains(@class,'MuiToolbar-root MuiToolbar')]//p[text()='110700']")).getText();
		System.out.println(txt);
		String expected_txt = "$110700";
		Assert.assertEquals(txt, expected_txt);
		
		driver.close();
		
		

	}
	
}
