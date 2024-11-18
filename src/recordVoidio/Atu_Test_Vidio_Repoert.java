package recordVoidio;

	import java.io.File;
	import java.text.DateFormat;
	import java.text.SimpleDateFormat;
	import java.util.Date;
	import java.util.concurrent.TimeUnit; 
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;
	 
	import atu.testrecorder.ATUTestRecorder;
	 
	public class Atu_Test_Vidio_Repoert {
	 
	 
	    static WebDriver driver;
	    static ATUTestRecorder recorder;
	    static DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	    static Date date = new Date();
	    static String videoName = "TC_ATU_Test_Video" + df.format(date);
	     
	    public String getFilePath()
	    {
	        File destination = new File("Video-Recording");
	        String filepath = destination.getAbsolutePath();
	         
	        System.out.println("------file path--------" +filepath);
	        return filepath;
	        
	    }
	 
	    @BeforeTest
	    public void setup() throws Exception {
	         
	         
	        String videoDir = getFilePath();
	         
	        recorder = new ATUTestRecorder(videoDir,videoName,false);
	        //To start video recording.
	        recorder.start();  
	         
	 
	       // System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	         
	    }
	 
	    @Test
	    public void getAppURL() throws Exception {  
	         
	        driver.get("https://www.yatra.com/");
	        System.out.println(" get title ---" +driver.getTitle());
	        if(driver.getTitle().contains("Yatra.com"))
	        {
	            System.out.println("expected application title is matched");
	 
	        }
	        else
	        {
	            System.out.println("expected application title is not matched");
	        }   
	         
	         
	        driver.findElement(By.xpath("//a[@title='Offers']")).click();
	        driver.findElement(By.xpath("//ul[@id='offer-box-shadow']//a[contains(text(),'International Flights')]")).click();
	      
	    } 
	 
	    @AfterTest
	    public void Close() throws Exception {
	        driver.quit();
	        //To stop video recording.
	        recorder.stop();
	    }
	}

