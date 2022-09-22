package checkboxhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver_win32 (105)\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		
	 	List<WebElement> rowelements = driver.findElements(By.xpath("//table//tbody//tr"));
	 	int rowsize = rowelements.size();
	    System.out.println(rowelements.size());
	
		List<WebElement> columnelements = driver.findElements(By.xpath("//table//thead//tr//th"));
		int columnsize = columnelements.size();
	 	System.out.println(columnelements.size());
		
		List<WebElement> cellData  = driver.findElements(By.xpath("//table//tbody//tr//td"));
		int cellvalue = cellData.size();
		System.out.println(cellData.size());
		
		for(int i=0;i<columnelements.size();i++)
	    {
	    	System.out.println(columnelements.get(i).getText());
	    }
	    
	    for(int j=11;j<cellData.size()-23;j++)
    	{
    		System.out.println(cellData.get(j).getText());
    	}
		
		
		//List<WebElement> cellData = driver.findElements(By.xpath("//table//tbody//tr//td"));
		//System.out.println(cellData.get(16).getText());
	}


}
