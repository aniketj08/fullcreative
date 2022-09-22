package checkboxhandling;

	
	import java.util.List;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class ThirdRowDataPrintSql {

		
				static WebDriver driver;
				public static void main(String[] args)throws InterruptedException {
					System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver_win32 (105)\\\\chromedriver.exe");
					
					driver = new ChromeDriver();
					
					driver.get("https://www.w3schools.com/sql/sql_case.asp");
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
					
					List<WebElement> rowelements = driver.findElements(By.xpath("//table//tbody//tr"));
					int rowsize = rowelements.size();
					System.out.println(rowelements.size());
				  
				    
					List<WebElement> columnelements = driver.findElements(By.xpath("//table//tbody//th"));
					int columnsize = columnelements.size();
					System.out.println(columnelements.size());
					
					List<WebElement> cellData  = driver.findElements(By.xpath("//table//tbody//tr//td"));
					int cellvalue = cellData.size();
					System.out.println(cellData.size());
			
				    for(int i=0;i<columnelements.size();i++)
				    {
				    	System.out.println(columnelements.get(i).getText());
				    }
				    
				    for(int j=8;j<cellData.size()-8;j++)
			    	{
			    		System.out.println(cellData.get(j).getText());
			    	}
			  

}}


