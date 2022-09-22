package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderProgram2 {
     static WebDriver driver;
     public static void main(String[] args) throws InterruptedException {
    	 System.setProperty("webdriver.chrome.driver","C:\\\\Selenium\\\\chromedriver_win32 (105)\\\\chromedriver.exe");
    	 
    	 driver = new ChromeDriver();
    	 driver.get("https://jquery.com/slider/");
    	 driver.manage().window().maximize();
    	 WebElement iframe = driver .findElement(By.xpath("//iframe[@class='demo-frame']"));
    	 
    	 driver.switchTo().frame(iframe);
    	 WebElement slider = driver.findElement(By.xpath("//div[@id='slider']//span"));
    	 
    	 Actions act = new Actions(driver);
    	 act.clickAndHold(slider).moveToElement(slider,550,0).release().build().perform();
    	 Thread.sleep(1000);
    	 
    	 driver.switchTo().parentFrame();
    	 driver.findElement(By.xpath("//a[text()='Download']")).click();
		
	}
}
