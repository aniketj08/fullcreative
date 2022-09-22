package checkboxhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfRowsAndColmn {
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver_win32 (105)\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		
		// No of Columns
		
		List<WebElement> col = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
	    System.out.println("No Of Colmns are : " +col.size());
	    
	    //No Of Rows
	    
	    List<WebElement> Rows = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
	    
	    System.out.println("No Of rows are " + Rows.size());
	    
	    driver.close();
	
	
	
	
	}
	
	
	
	

}
