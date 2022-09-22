package actions;

	import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;
    import org.openqa.selenium.interactions.Actions;
    
    public class DoubleClickUsingAct {
		
		static WebDriver driver;
		public static  void main(String[] args)throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\\\Selenium\\\\chromedriver_win32 (105)\\\\chromedriver.exe");
		 driver = new ChromeDriver();
		 
		 driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		 driver.manage().window().maximize();
		 
		 WebElement targetElement = driver.findElement(By.xpath("//*[contains(text(),'Double')]"));
		 Actions act = new Actions(driver);
		 act.doubleClick(targetElement).perform();

}
}