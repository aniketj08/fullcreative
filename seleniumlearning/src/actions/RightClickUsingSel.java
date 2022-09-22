package actions;

	
	import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;
    import org.openqa.selenium.interactions.Actions;
    
    public class RightClickUsingSel {
		
		static WebDriver driver;
		public static  void main(String[] args)throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\\\Selenium\\\\chromedriver_win32 (105)\\\\chromedriver.exe");
		 driver = new ChromeDriver();
		 
		 driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		 driver.manage().window().maximize();
		 
		 WebElement targetElement =  driver.findElement(By.xpath("//*[text()='right click me']"));
		 Actions act = new Actions(driver);
		 act.contextClick(targetElement).perform();

}
}