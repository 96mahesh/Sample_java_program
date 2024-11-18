package selenium;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {

	WebDriver driver;
	static String repData;
	public LoginPage(WebDriver driver) {
		 this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//input[@placeholder='Username']")WebElement email;
	@FindBy(xpath="//input[@placeholder='Password']") WebElement password;
	@FindBy(xpath="//span[text()='Submit']")WebElement login;
	@FindBy(xpath="//div[@class='mantine-hzudtq']") WebElement leftSaidBar;
	@FindBy(xpath="//span[text()='Procurement']") WebElement procupment;
	@FindBy(xpath="//*[text()='RFP']") WebElement rfp;
	@FindBy(xpath="(//*[@type='search'])[1]") WebElement client;
	@FindBy(xpath="(//*[@type='search'])[2]") WebElement site;
	@FindBy(xpath="(//*[@type='search'])[2]") WebElement AssindTo;
	@FindBy(xpath="//span[text()='New']") WebElement newL;
	@FindBy(xpath="//textarea[@placeholder='Description']") WebElement description;
	@FindBy(xpath="//textarea[@placeholder='Justification']") WebElement jestification;
	@FindBy(xpath="//span[text()='Send for Approval']") WebElement sendforAproval;
	@FindBy(xpath="//h2[text()='Confirm Create']") WebElement confornmsg;
	@FindBy(xpath="//div[text()='Are you sure you want to create an RFP for the following?']") WebElement textmsg;
	@FindBy(xpath="//strong[text()='I want pens']") WebElement desm;
	@FindBy(xpath="//span[text()='Confirm']") WebElement confrm;
	@FindBy(xpath="//div[text()='RFP has been created']") WebElement success;
	@FindBy(xpath="//span[text()='Logout']") WebElement logout;
	@FindBy(xpath="//div[text()='Version : ']") WebElement version;
	@FindBy(xpath="//h5[text()='All RFPs']//following::table[@class='mantine-Table-root vTable mantine-122x5ex']//tbody//tr[1]//td[2]") WebElement repno;
	@FindBy(xpath="//div[text()='Site Executive']") WebElement siteExecutive;
	
    public void emailTextBox(String seemail) {
    	email.sendKeys(seemail);
    }
    
    public void passwordTextBox(String pass) {
    	password.sendKeys(pass);
    }
     
    public void clickOnLogin() {
    	login.click();
    }
    
    public void verifytheLeftSaidBar() {
    	Assert.assertTrue(leftSaidBar.isDisplayed(),"Test script fail");
    }
    
    public void clickOnProcupMent() {
    	procupment.click();
    }
    
    public void clickOnrfp() {
    	rfp.click();
    }
    
    public void clickOnclient() {
    	client.click();
    	for(int i=0;i<=11;i++) {
    		 client.sendKeys(Keys.ARROW_DOWN);
    		 client.sendKeys(Keys.ENTER);
    		client.click();
    		String str = client.getAttribute("value");
    		//System.out.println(str);
    		if(str.equalsIgnoreCase("Client Alpha")) {
    			client.sendKeys(Keys.ENTER);
    			break;
    		}
    	}
    } 
    
    public void clickOnAssigndToDropDown() throws Exception {
    	AssindTo.click();
    	for(int i=0;i<=105;i++) {
    		AssindTo.sendKeys(Keys.ARROW_DOWN);
    		AssindTo.sendKeys(Keys.ENTER);
    		AssindTo.click();
   		String str = AssindTo.getAttribute("value");
   		System.out.println(str);
   		if(str.equalsIgnoreCase("operManager1")) {
   			AssindTo.sendKeys(Keys.ENTER);
   			break;
   		}
   	}
    }
      
    public void clickOnNew() {
    	newL.click();
    }
        		
    public void clickOnSite() throws InterruptedException {
    	site.click();
    	for(int i=0;i<=105;i++) {
    		site.sendKeys(Keys.ARROW_DOWN);
    		site.sendKeys(Keys.ENTER);
    		site.click();
   		String str = site.getAttribute("value");
   		System.out.println(str);
   		if(str.equalsIgnoreCase("Alpha Three")) {
   			site.sendKeys(Keys.ENTER);
   			break;
   		}
   	}
    }
    
    
    public void veryfyBgColor() {
    	String backgroundcolor = newL.getCssValue("background-color");
    	System.out.println(backgroundcolor);
    	Assert.assertEquals(backgroundcolor, "rgba(0, 0, 0, 0)");
    	String actualcolour = Color.fromString(backgroundcolor).asHex();
    	System.out.println(actualcolour);
    	Assert.assertEquals(actualcolour, "#000000");
    }
    
    public void userEnterTheDescriptionTextBox(String keys) {
    	description.sendKeys(keys);
    }	
    
    public void userEnterJestificationTextBox(String keys) {
    	jestification.sendKeys(keys);
    }
    
    public void verifyColorSendForAproval() {
    	String bgcolor = sendforAproval.getCssValue("background-color");
    	System.out.println(bgcolor);
    	Assert.assertEquals(bgcolor, "rgba(0, 0, 0, 0)");
    	String actualcolour = Color.fromString(bgcolor).asHex();
    	System.out.println(actualcolour);
    	Assert.assertEquals(actualcolour, "#000000");
    }
    
    public void clickOnSendForAproval() {
    	sendforAproval.click();
    }
    
    public String getConfomMsg() {
    	return  confornmsg.getText();
    }
    
    public String verifyTextMsg() {
    	return textmsg.getText();
    }
  
    public String verifydescMsg() {
    	return desm.getText();
    }
    
    public void clickOnConform() {
    	confrm.click();
    }
    
    public void veryfySuccessMsg() {
    	String data = success.getText();
    	//Assert.assertEquals(data, DataConfigConsTent.successmsg,"Test Script Pass");
    }
    
    
    
     public void clickOnlogOut() {
    	 logout.click();
     }
     
     public void verifyVersion() {
    	 String vers = version.getText();
    	 System.out.println(vers);
    	 //Assert.assertEquals(vers, DataConfigConsTent.version);
     }
     
     public void verifyReffernceNo() {
	        repData =  repno.getText();
	    	System.err.println(repData);
	    	
	    	
     }
     
     public void verifySiteExecutive() {
    	String siteExecutiveText =  siteExecutive.getText();
    	System.out.println(siteExecutiveText);
    	//Assert.assertEquals(siteExecutiveText, DataConfigConsTent.siteExcutive);
     }
    
    
}
	

