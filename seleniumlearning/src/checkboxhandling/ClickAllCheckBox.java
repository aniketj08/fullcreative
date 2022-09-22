package checkboxhandling;
    import java.util.List;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;

		public class ClickAllCheckBox {
			
		static WebDriver driver;
		public static  void main(String[] args)throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\\\Selenium\\\\chromedriver_win32 (105)\\\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 driver.manage().window().maximize();
				
		 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		 driver.findElement(By.id("txtPassword")).sendKeys("Admin");
		 driver.findElement(By.id("btnlLogin")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		 driver.findElement(By.id("menu_admin_UserManagement")).click();
		 
		WebElement checkSpecificChkBox = driver.findElement(By.xpath("//table//tr//td//a[text()='Anthony.Nolan']//ancestor::tr//td//input"));
		 checkSpecificChkBox.click();
				 
		}
}
