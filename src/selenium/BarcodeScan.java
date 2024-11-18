package selenium;

import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class BarcodeScan {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://barcode.tec-it.com/en/Code128?data=Pawan Kalyan");
		
		String barcodeUrl = driver.findElement(By.tagName("img")).getAttribute("src");
		System.out.println(barcodeUrl);
		
		URL url = new URL(barcodeUrl);
		
		BufferedImage befferimg  =ImageIO.read(url);
		
		LuminanceSource luminancesource = new BufferedImageLuminanceSource(befferimg);
		BinaryBitmap binarybitmap = new BinaryBitmap(new HybridBinarizer(luminancesource));
		
		Result result = new MultiFormatReader().decode(binarybitmap);
		System.out.println(result.getText());
		
		Thread.sleep(2000);
		driver.close();
		
	}
}
