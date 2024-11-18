package selenium;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DtesSelenium {
	@Test
	public void setup() throws Exception {
//	        Scanner scan = new Scanner(System.in);
		
//	        System.out.println("Enter Dates");
//	        String setDate = scan.nextLine();

//		System.setProperty("webdriver.chrome.driver", "C:/SeleniumDrivers\\SeleniumDrivers\\chromedriver.exe");

		ChromeOptions cpt = new ChromeOptions();

		cpt.addArguments("remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(cpt);

		driver.get("https://jqueryui.com/datepicker/");

		driver.manage().window().maximize();

		By ExampleL = By.xpath("//h2[text()='Examples']");

		WebElement Example = driver.findElement(ExampleL);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(true)", Example);

		By FrameL = By.xpath("//*[@class='demo-frame']");

		WebElement Frame = driver.findElement(FrameL);

		driver.switchTo().frame(Frame);

		By DateTextBoxL = By.cssSelector("input#datepicker");

		WebElement DateTextBox = driver.findElement(DateTextBoxL);

		DateTextBox.click();

		DateTimeFormatter obj = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss a");

		LocalDateTime LDT = LocalDateTime.now();

		String info = LDT.format(obj);

		System.out.println("info : " + info);

		int currentdate = LDT.getDayOfMonth();

		System.out.println("CurrentDate :" + currentdate);

		By DateL = By.xpath("//*[text()='" + currentdate + "']");

		WebElement Date = driver.findElement(DateL);

		Assert.assertTrue(Date.isDisplayed(), "Test scrript failed");

		String bgcolourL = Date.getCssValue("background-Color");

		System.out.println(bgcolourL);

		String actual_colour = Color.fromString(bgcolourL).asHex();

		System.out.println("Actual_Color :" + actual_colour);

		Assert.assertEquals(actual_colour, "#fffa90");

		Month month = LDT.getMonth();

		String Month_L = month.toString();

		Month_L = Month_L.toLowerCase();

		char ch = Month_L.charAt(0);

		String ch1 = String.valueOf(ch);

		Month_L = Month_L.replaceFirst(ch1, ch1.toUpperCase());

		System.out.println("Current Month :" + Month_L);

		By MonthL = By.xpath("//span[text()='" + Month_L + "']");

		WebElement Month = driver.findElement(MonthL);

		Assert.assertTrue(Month.isDisplayed(), "Test script failed");

		int Year = LDT.getYear();

		System.out.println("Current year :" + Year);

		By yearL = By.xpath("//span[text()='" + Year + "']");

		WebElement year = driver.findElement(yearL);

		Assert.assertTrue(year.isDisplayed(), "Test script failed");

		String setDate = "03/03/1996";

		Date d = new SimpleDateFormat("MM/dd/yyy").parse(setDate);

		System.out.println("Date to be Selectd :" + d);

		String simpleDate = d.toString();

		String MonthToBeSelectd = simpleDate.split(" ")[1];

		String DateToBeSelectd = simpleDate.split(" ")[2];

		if (DateToBeSelectd.length() == 2)

		{

			if (DateToBeSelectd.charAt(0) == '0')

			{

				DateToBeSelectd = DateToBeSelectd.substring(1);

				System.out.println("Select date :" + DateToBeSelectd);

			}

		}

		String yearToBeSelectd = simpleDate.split(" ")[5];

		System.err.println("MonthToBeSelectd :" + MonthToBeSelectd);

		System.err.println("DateToBeSelectd :" + DateToBeSelectd);

		System.err.println("yearToBeSelectd :" + yearToBeSelectd);

		int ExpectedYear = Integer.parseInt(yearToBeSelectd);

		System.out.println("ExpectedYear :" + ExpectedYear);

		if (ExpectedYear > Year)

		{

			while (true) {

				By NextBtnL = By.xpath("//span[text()='Next']");

				WebElement NextBtn = driver.findElement(NextBtnL);

				NextBtn.click();

				By DatesL = By.xpath("//div[@class='ui-datepicker-title']");

				WebElement Dates = driver.findElement(DatesL);

				String innerHtml = Dates.getAttribute("innerHTML");

				boolean status = innerHtml.contains(yearToBeSelectd) && innerHtml.contains(MonthToBeSelectd);

				if (status)

					break;

			}

			By CrrentdateL = By.xpath("//a[text()='" + DateToBeSelectd + "']");

			System.out.println("CrrentdateL :" + CrrentdateL);

			WebElement Crrentdate = driver.findElement(CrrentdateL);

			Crrentdate.click();

			By UpdatedDateL = By.xpath("//input[@id='datepicker']");

			WebElement updateDate = driver.findElement(UpdatedDateL);

			String innerHTML = updateDate.getAttribute("value");

			System.out.println("innerHTML :" + innerHTML);

			Assert.assertEquals(innerHTML, setDate);

		}

		else if (ExpectedYear < Year) {

			while (true)

			{

				By NextBtnL = By.xpath("//span[text()='Prev']");

				WebElement NextBtn = driver.findElement(NextBtnL);

				NextBtn.click();

				By DatesL = By.xpath("//div[@class='ui-datepicker-title']");

				WebElement Dates = driver.findElement(DatesL);

				String innerHtml = Dates.getAttribute("innerHTML");

				boolean status = innerHtml.contains(yearToBeSelectd) && innerHtml.contains(MonthToBeSelectd);

				if (status)

					break;

			}

			By CrrentdateL = By.xpath("//a[text()='" + DateToBeSelectd + "']");

			System.out.println("CrrentdateL :" + CrrentdateL);

			WebElement Crrentdate = driver.findElement(CrrentdateL);

			Crrentdate.click();

			By UpdatedDateL = By.xpath("//input[@id='datepicker']");

			WebElement updateDate = driver.findElement(UpdatedDateL);

			String innerHTML = updateDate.getAttribute("value");

			System.out.println("Inner Html link " + innerHTML);

			System.out.println("innerHTML :" + innerHTML);

			Assert.assertEquals(innerHTML, setDate);

		}

		else

		{

			int currentMonthInt = LDT.getMonthValue();

			System.out.println("currentMonthInt :" + currentMonthInt);

			int ExpectedMonth = Integer.parseInt(setDate.split("/")[0]);

			if (currentMonthInt < ExpectedMonth)

			{

				while (true) {

					By NextBtnL = By.xpath("//span[text()='Next']");

					WebElement NextBtn = driver.findElement(NextBtnL);

					NextBtn.click();

					By DatesL = By.xpath("//div[@class='ui-datepicker-title']");

					WebElement Dates = driver.findElement(DatesL);

					String innerHtml = Dates.getAttribute("innerHTML");

					boolean status = innerHtml.contains(yearToBeSelectd) && innerHtml.contains(MonthToBeSelectd);

					if (status)

						break;

				}

				By CrrentdateL = By.xpath("//a[text()='" + DateToBeSelectd + "']");

				System.out.println("CrrentdateL :" + CrrentdateL);

				WebElement Crrentdate = driver.findElement(CrrentdateL);

				Crrentdate.click();

				By UpdatedDateL = By.xpath("//input[@id='datepicker']");

				WebElement updateDate = driver.findElement(UpdatedDateL);

				String innerHTML = updateDate.getAttribute("value");

				System.out.println("innerHTML :" + innerHTML);

				Assert.assertEquals(innerHTML, setDate);

			}

			else if (currentMonthInt > ExpectedMonth)

			{

				while (true)

				{

					By NextBtnL = By.xpath("//span[text()='Prev']");

					WebElement NextBtn = driver.findElement(NextBtnL);

					NextBtn.click();

					By DatesL = By.xpath("//div[@class='ui-datepicker-title']");

					WebElement Dates = driver.findElement(DatesL);

					String innerHtml = Dates.getAttribute("innerHTML");

					boolean status = innerHtml.contains(yearToBeSelectd) && innerHtml.contains(MonthToBeSelectd);

					if (status)

						break;

				}

				By CrrentdateL = By.xpath("//a[text()='" + DateToBeSelectd + "']");

				System.out.println("CrrentdateL :" + CrrentdateL);

				WebElement Crrentdate = driver.findElement(CrrentdateL);

				Crrentdate.click();

				By UpdatedDateL = By.xpath("//input[@id='datepicker']");

				WebElement updateDate = driver.findElement(UpdatedDateL);

				String innerHTML = updateDate.getAttribute("value");

				System.out.println("innerHTML :" + innerHTML);

				Assert.assertEquals(innerHTML, setDate);

			}

			else

			{

				By CrrentdateL = By.xpath("//a[text()='" + DateToBeSelectd + "']");

				System.out.println("CrrentdateL :" + CrrentdateL);

				WebElement Crrentdate = driver.findElement(CrrentdateL);

				Crrentdate.click();

				By UpdatedDateL = By.xpath("//input[@id='datepicker']");

				WebElement updateDate = driver.findElement(UpdatedDateL);

				String innerHTML = updateDate.getAttribute("value");

				System.out.println("innerHTML :" + innerHTML);

				Assert.assertEquals(innerHTML, setDate);

				driver.close();

			}

		}
		
		driver.close();
		// scan.close();

	}

}
