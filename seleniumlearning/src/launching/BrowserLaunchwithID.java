package launching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunchwithID {

	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Selenium\\\\chromedriver_win32 (105)\\\\chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
	 
	    driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		WebElement userName =driver.findElement(By.id("txtUsername"));
		userName.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");
		
		WebElement btnLogin =driver.findElement(By.id("btnLogin"));
		btnLogin.click();
		
	}
}
