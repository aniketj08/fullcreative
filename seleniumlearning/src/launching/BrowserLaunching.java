package launching;

    import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	public class BrowserLaunching {
	static WebDriver driver;

	public static void main(String[] args)  {

	System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver_win32 (105)\\\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.flipkart.com");
	driver.manage().window().maximize();
	driver.quit();
	}
}