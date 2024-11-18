package selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MultiSelectedDropDown {

	@Test
	public void setUp() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");
		
		WebElement dropdownlist = driver.findElement(By.id("superheros"));
		Select select = new Select(dropdownlist);
		List<WebElement> alloptions = select.getOptions();
		List<String> droplist = new ArrayList<>();
		for (WebElement ele : alloptions) {
			String alltext = ele.getText();
			droplist.add(alltext);
		}
		System.out.println(droplist);
		System.out.println(droplist.size());
		
		for (String e : droplist) {
			if(e.equalsIgnoreCase("Batman") || e.equalsIgnoreCase("Black Panther")) {
				select.selectByVisibleText(e);
			}
		}
		
		System.out.println("all selected options");
		List<WebElement> allselectedOptions = select.getAllSelectedOptions();
		List<String> alloptlist = new ArrayList<>();
		for (WebElement selectedOptions : allselectedOptions) {
			String selectedtext = selectedOptions.getText();
			alloptlist.add(selectedtext);
		}
		
		System.out.println(alloptlist);
		List<String> allnonselectedoptions = new ArrayList<>();
		for (WebElement ele : alloptions) {
			if(!ele.isSelected()) {
			String alltext = ele.getText();
			allnonselectedoptions.add(alltext);
			}
			
			
		}
		System.out.println(allnonselectedoptions);
		System.out.println(allnonselectedoptions.size());
		
		driver.close();
	}
}
