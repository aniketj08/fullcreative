package actions;

	import org.openqa.selenium.By;
    import org.openqa.selenium.Keys;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;
    import org.openqa.selenium.interactions.Actions;

    public class KeyUpKeyDown {
			
		static WebDriver driver;
		public static void main(String[] args)throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\\\Selenium\\\\chromedriver_win32 (105)\\\\chromedriver.exe");
		 driver = new ChromeDriver();
		 
		 driver.get("https://m.facebook.com/reg/?cid=103&refsrc=deprecated&soft=hjk");
		 driver.manage().window().maximize();
		 WebElement txtField1 = driver.findElement(By.id("firstname_input"));
		 Actions act = new Actions(driver);
		 act.sendKeys(txtField1,"velocity").keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		 act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		 Thread.sleep(1000);
		 WebElement txtfield2 = driver.findElement(By.id("lastname_input"));
		 txtfield2.click();
		 
		 act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();		 
       }
     }