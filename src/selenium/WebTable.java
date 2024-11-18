package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebTable {

	public static void main(String[] args) {
		
		
		   WebDriver driver = new EdgeDriver();
		   driver.get("https://demo.guru99.com/test/web-table-element.php");
			
			
			By RowL =By.xpath("//table[@class='dataTable']/tbody/tr");
			List<WebElement> Row = driver.findElements(RowL);
			for (WebElement ele : Row) {
				String actualdata = ele.getText();
				//System.out.println(actualdata);
			}
			System.err.println("RowSize Size = : " +Row.size()+"  ");
			
			By ColL =By.xpath("//table[@class='dataTable']/thead/tr/th");
			List<WebElement> col = driver.findElements(ColL);
	        String value = "Group";
			int culnum = 0;
			for (int i=0;i<col.size();i++) {
				 if( col.get(i).getText().equals(value)) {
				culnum = i;
				 }
				
			}
			By singleColL =By.xpath("//table[@class='dataTable']//tbody//td");
			List<WebElement> singlecol = driver.findElements(singleColL);
			for (int j=culnum;j<singlecol.size();j=j+col.size()) {
				String data = singlecol.get(j).getText();
				
				System.out.println(data);
				
			}
			System.err.println(culnum);
			System.err.println("Columun Size = : " +col.size());
			System.out.println(singlecol.size());
			
			
			
			//driver.close();
	}
}
