package getwinhandle;

    import java.util.Set;

    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;

    public class SwitchingOfScreens {
	static WebDriver driver;
		public static void main(String[] args)throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\\\Selenium\\\\chromedriver_win32 (105)\\\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 driver.manage().window().maximize();
		 
		 String primaryScreen = driver.getWindowHandle(); //current window id
		 System.out.println(primaryScreen); 
		 Thread.sleep(2000);
		
		 driver.findElement(By.xpath("//*[text()='OrangeHRM,Inc']")).click();
		  
		 Set<String> AllScreen = driver.getWindowHandles();
		 for(String eachId : AllScreen) {
			 driver.switchTo().window(eachId);
			 if(driver.getTitle().contains("OrangeHRM HR Software"));
			 driver.findElement(By.xpath("//*[text()='Contact Sales']")).click();
			 
		 }
		}	
	   }
	  
