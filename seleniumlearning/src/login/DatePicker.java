package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Selenium\\\\chromedriver_win32 (105)\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='datepicker2']")).click();
		driver.findElement(By.xpath("//*[@title='Change the year']//option")).click();
		Thread.sleep(2000);
		
		// to select year
		driver.findElement(By.xpath("//select[@title='Change the year']//option[@value='4/1993']")).click();
		//to select month
		driver.findElement(By.xpath("//select[@title='change the month']//option[@value='6/1993']")).click();
		//to select Day
		driver.findElement(By.xpath("//select[@title='select Friday,jun 18,1993']")).click();
		
		// to select year
		driver.findElement(By.xpath("//select[@title='Change the year']//option[contains(text(),'1993']")).click();
		//to select month
		driver.findElement(By.xpath("//select[@title='change the month']//option[contains(text(),'June']")).click();
		//to select Day
		driver.findElement(By.xpath("//select[@title='select Friday,jun 18,1993']")).click();
				
		
	}
	

}
