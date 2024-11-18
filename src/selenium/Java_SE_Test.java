package selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_SE_Test {

	public static void main(String[] args) {
		
		WebDriver  driver= new ChromeDriver();			
		
        //Creating the JavascriptExecutor interface object by Type casting		
        JavascriptExecutor js = (JavascriptExecutor)driver;		
        		
        //Launching the Site.		
        driver.get("https://google.com");
			
        //Fetching the Domain Name of the site. Tostring() change object to name.		
        String DomainName = (String) js.executeScript("return document.domain;");			
        System.out.println("Domain name of the site = "+DomainName);					
          		
        //Fetching the URL of the site. Tostring() change object to name		
        String url = js.executeScript("return document.URL;").toString();			
        System.out.println("URL of the site = "+url);					
          		
       //Method document.title fetch the Title name of the site. Tostring() change object to name		
       String TitleName = js.executeScript("return document.title;").toString();			
       System.out.println("Title of the page = "+TitleName);					

        		
      //Navigate to new Page i.e to generate access page. (launch new url)		
      js.executeScript("window.location = 'https://www.gmail.com'");
      
     Object domainname =  js.executeScript("return document.domain;");
     System.out.println("Domain Name : "+domainname);
     
     Object Domainurl = js.executeScript("return document.URL;");
     System.out.println("Domain url : "+Domainurl);
     
     Object DomaiTitle = js.executeScript("return document.title;");
     System.out.println("Domain url : "+DomaiTitle);
     
	}
}
