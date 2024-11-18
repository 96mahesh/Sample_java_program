package selenium;

import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
public class SampleDemo {
	    public static void main(String[] args) {
//	        // Set the path to the ChromeDriver executable
//	       // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
//
//	        // Create a WebDriver instance for Chrome
//	        WebDriver driver = new ChromeDriver();
//
//	        // Navigate to a web page
//	        driver.get("https://trugreen-qa.truboardpartners.com/trugreen/dashboard");
//
//	        // Get the page source
//	        String pageSource = driver.getPageSource();
//
//	        // Format and print the page source
//	        // You can use <pre> HTML tags to preserve formatting
//	        String formattedPageSource = "<pre>" + pageSource + "</pre>";
//	        System.out.println(formattedPageSource);
//
//	        // Close the WebDriver
//	        driver.quit();
//	    
//	}
	
	//System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");

    // Create a WebDriver instance for Chrome
    WebDriver driver = new ChromeDriver();

    // Navigate to a web page
    driver.get("https://example.com");

    // Get the page source
    String pageSource = driver.getPageSource();

    // Specify the path for the output file
    String outputPath = "page_source.html";

    try {
        // Write the page source to a file
        FileWriter writer = new FileWriter(new File(outputPath));
        writer.write(pageSource);
        writer.close();
        System.out.println("Page source saved to " + outputPath);
    } catch (IOException e) {
        e.printStackTrace();
    }

    // Close the WebDriver
    driver.quit();
}

}

