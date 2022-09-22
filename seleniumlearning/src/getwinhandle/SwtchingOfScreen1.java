package getwinhandle;
    
    import java.util.Set;

    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;

    public class SwtchingOfScreen1 {
    	static WebDriver driver;
    
		public static void main(String[] args)throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\\\Selenium\\\\chromedriver_win32 (105)\\\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 driver.manage().window().maximize();
		 
		 String primaryScrn = driver.getWindowHandle(); //current window id
		 driver.findElement(By.xpath("//*[text()='OrangeHRM,Inc']")).click();
		  
		 Set<String> allWinId = driver.getWindowHandles();
		 for(String eachId : allWinId) {
			 driver.switchTo().window(eachId);
			 if(driver.getTitle().contains("OrangeHRM Software")) {
				 driver.findElement(By.xpath("//[text()='Contact Sales']")).click();
			 }
           }
         }
       }