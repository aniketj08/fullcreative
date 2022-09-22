package actions;
	
	import java.util.List;
	import org.openqa.selenium.By;
    import org.openqa.selenium.JavascriptExecutor;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;
    import org.openqa.selenium.interactions.Actions;

    public class MouseHovering {
			
		static WebDriver driver;
		public static void main(String[] args)throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\\\Selenium\\\\chromedriver_win32 (105)\\\\chromedriver.exe");
		 driver = new ChromeDriver();
		 
		 driver.get("https://amazon.in/");
		 driver.manage().window().maximize();
		 
		 WebElement targetElement = driver.findElement(By.xpath("//div[@id=\"nav-al-your-account\"]//a"));
		 Actions act = new Actions(driver);
		 act.moveToElement(targetElement).perform();
		 WebElement clickops =  driver.findElement(By.xpath("//span[text()='Your Account']"));
		 Thread.sleep(1000);
		 act.click(clickops).perform();

}
}