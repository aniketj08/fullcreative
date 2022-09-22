package getwinhandle;

    import java.util.List;
    import java.util.Set;

    import org.openqa.selenium.By;
    import org.openqa.selenium.JavascriptExecutor;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;
    public class CurrentScreenWinID2 {

	static WebDriver driver;
		public static void main(String[] args)throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\\\Selenium\\\\chromedriver_win32 (105)\\\\chromedriver.exe");
		 
		 driver = new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		 driver.manage().window().maximize();
		 
		 String primaryWinId = driver.getWindowHandle();
		 System.out.println(primaryWinId);  ///current screen
		 driver.findElement(By.xpath("//*[text()='orangeHRM, Inc']")).click();
		 Thread.sleep(1000);
		 Set<String> allWinId = driver.getWindowHandles();
		 System.out.println(allWinId);  //all currently opened window id's
		   }
		}
