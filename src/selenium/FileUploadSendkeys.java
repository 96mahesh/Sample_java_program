package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadSendkeys {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.xpath("//a[text()='File Upload']")).click();
		driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Users\\Admin\\Downloads\\My resume.pdf");
		driver.findElement(By.id("file-submit")).click();
		
		
		
		
	}
}
