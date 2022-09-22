package gettextmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckingGetText {
	
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Selenium\\\\chromedriver_win32 (105)\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		 WebElement textWeWant = driver.findElement(By.xpath("//*[(text()='LOGIN Panel"
		 		+ "')]"));
	/////*[contains(text(),'Lo')]
		 String checkText = textWeWant.getText();
		 System.out.println(checkText);
		 if(checkText.equals("Login Panel"))
			 System.out.println("text is as excepted");
		 driver.quit();
	}

}
