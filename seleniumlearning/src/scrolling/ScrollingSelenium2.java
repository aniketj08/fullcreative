package scrolling;

    import org.openqa.selenium.By;
    import org.openqa.selenium.JavascriptExecutor;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;

    public class ScrollingSelenium2 {
			
		static WebDriver driver;
		public static  void main(String[] args)throws InterruptedException {
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
		 
		 WebElement expectedCheckBox = driver.findElement(By.xpath("//table//td//a[contains(text(),'Linda.Anderson')]//ancestor::tr//input"));
		 JavascriptExecutor Js = (JavascriptExecutor) driver;
		 Js.executeScript("argument[0].scrollIntoView();",expectedCheckBox); //to scroll it in downword side
		 Js.executeScript("arguments[0]",expectedCheckBox);
		}
}
