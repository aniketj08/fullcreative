package screenshot;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot4 {
	static WebDriver driver;
	 public static void main(String[] args) throws InterruptedException,IOException {
	  System.setProperty("webdriver.chrome.driver","C:\\\\Selenium\\\\chromedriver_win32 (105)\\\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://meesho.com");
	  driver.manage().window().maximize();
	  
	  TakesScreenshot screnshot = (TakesScreenshot)driver;
	  File source = screnshot.getScreenshotAs(OutputType.FILE);
	  File destination = new File("C:\\Users\\anike\\OneDrive\\Pictures\\Saved Pictures\\aniket213.png");
	  FileHandler.copy(source, destination);
	  Thread.sleep(1000);
	  driver.quit();

}}
