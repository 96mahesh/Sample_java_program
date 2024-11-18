package selenium;

import java.awt.image.BufferedImage;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class Barcode_Qrcode_Read_DemoTest {

	@Test
	public void qrCodeDemo() throws MalformedURLException, Exception {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cognex.com/resources/interactive-tools/free-barcode-generator");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Accept All Cookies']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='2D Codes']/..")).click();
		WebElement ele = driver.findElement(By.xpath("//input[@name='data']"));
		ele.clear();
		ele.sendKeys("Learning with leo");

		Thread.sleep(3000);
		WebElement clickele = driver.findElement(By.xpath("//input[@value='Generate Barcode']"));
		Actions action = new Actions(driver);
		action.click(clickele).build().perform();
		String barcodeUrl = driver.findElement(By.xpath("//img[@id='barcode-image']")).getAttribute("src");
		System.out.println(barcodeUrl);
		
	    driver.findElement(By.xpath("//span[text()='×']")).click();
	    Thread.sleep(5000);
		URL url = new URL(barcodeUrl);

		BufferedImage befferimg = ImageIO.read(url);

		LuminanceSource luminancesource = new BufferedImageLuminanceSource(befferimg);
		BinaryBitmap binarybitmap = new BinaryBitmap(new HybridBinarizer(luminancesource));

		Result result = new MultiFormatReader().decode(binarybitmap);
		System.out.println(result.getText());

		
	}
}
