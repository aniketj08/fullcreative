package launching;

    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	public class AmazonBrowserLaunch {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver_win32 (105)\\\\chromedriver.exe");
    driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();


	driver.findElement(By.xpath("//*[@href='/Books/b/?ie=UTF8&node=976389031&ref_=nav_cs_books']")).click();
	Thread.sleep(2000);

	driver.quit();
     }
	}
