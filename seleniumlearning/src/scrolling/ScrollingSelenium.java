package scrolling;

    import java.util.List;
	import org.openqa.selenium.By;
    import org.openqa.selenium.JavascriptExecutor;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;

    public class ScrollingSelenium {
			
		static WebDriver driver;
		public static <WebElement> void main(String[] args)throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\\\Selenium\\\\chromedriver_win32 (105)\\\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		 driver.manage().window().maximize();
				
		 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		 driver.findElement(By.id("txtPassword")).sendKeys("Admin");
		 driver.findElement(By.id("btnlLogin")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		 driver.findElement(By.id("menu_admin_UserManagement")).click();
		 
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy' (0,800)");// to scroll it in downword side
         Thread.sleep(2000);
         js.executeScript("window.scrollBy(0,-600)"); //to scroll it upward side
		}
    }