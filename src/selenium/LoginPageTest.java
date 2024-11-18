package selenium;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest {
	WebDriver driver;
	@BeforeMethod
	public void setUp() throws Exception {
		driver = Browser.lanchBrowser("chrome");
		String url = ExcellReader.getData("config", "url");
		driver.get(url);
	}
	@AfterMethod
	public void tearDown() {
		Browser.closeBrowser();
	}
	
	@Test
	public void verifyFunctionalityOfLoginButton() throws Exception {
		LoginPage log = new LoginPage(driver);
		String email = ExcellReader.getData("config" , "executeusername");
		log.emailTextBox(email);
		String pass = ExcellReader.getData("config" , "executepassword");
		log.passwordTextBox(pass);
		log.clickOnLogin();
		log.verifytheLeftSaidBar();
		log.clickOnProcupMent();
		log.clickOnrfp();
		log.clickOnclient();
		Thread.sleep(5000);
		log.clickOnSite();
		Thread.sleep(5000);
		log.verifySiteExecutive();
		log.veryfyBgColor();
		for(int i=0;i<=200;i++) {
		log.clickOnNew();
		log.clickOnAssigndToDropDown();
		String desc = ExcellReader.getData("config" , "Descriptionkeys");
		log.userEnterTheDescriptionTextBox(desc);
		String jest = ExcellReader.getData("config" , "jestifications");
		log.userEnterJestificationTextBox(jest);
		Thread.sleep(3000);
		log.verifyColorSendForAproval();
		log.clickOnSendForAproval();
		Thread.sleep(2000);
		String actual=log.getConfomMsg();
		System.out.println(actual);
		//Assert.assertEquals(actual, DataConfigConsTent.confromMsg);
        log.clickOnConform();
        log.veryfySuccessMsg();
        Thread.sleep(15000);
        log.verifyReffernceNo();
		}
        log.clickOnlogOut();
        log.verifyVersion();
		
	}
	
}
