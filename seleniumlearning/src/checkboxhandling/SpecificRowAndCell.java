package checkboxhandling;

	import java.text.ParseException;
	import java.util.List;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import java.util.concurrent.TimeUnit;

	public class SpecificRowAndCell {

	    public static void main(String[] args) throws ParseException {
	    	WebDriver driver;
			System.setProperty("webdriver.chrome.driver","C:\\\\Selenium\\\\chromedriver_win32 (105)\\\\chromedriver.exe");
			driver= new ChromeDriver();
			 driver.get("http://demo.guru99.com/test/web-table-element.php"); 
			 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			 WebElement baseTable = driver.findElement(By.tagName("table"));
			  
			 //To find third row of table
			 WebElement tableRow = baseTable.findElement(By.xpath("//table/tbody/tr[3]"));
	         String rowtext = tableRow.getText();
			 System.out.println("Third row of table : "+rowtext);
			    
			    //to get 3rd row's 3rd column data
			    WebElement cellIneed = tableRow.findElement(By.xpath("//table/tbody/tr[3]/td[3]"));
			    String valueIneed = cellIneed.getText();
			    System.out.println("Cell value is : " + valueIneed); 
			    driver.quit();
	    }

}
