package gettextmethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BlankChromeBrowser {
	static WebDriver driver;
	public static void main(String[] args) {
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32 (105)\\chromedriver.exe");
		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		/*driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		driver.switchTo().newWindow(WindowType.TAB);*/
		
	}
	
	 
	

}
