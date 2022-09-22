package handlingdropdown;


	import java.util.List;
    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

       public class Dropdown {
		static WebDriver driver;
		
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver_win32 (105)\\\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://mbasic.facebook.com/");
			driver.manage().window().maximize();
			
			driver.findElement(By.cssSelector("#signup-button input")).click();
			Thread.sleep(1000);
			
			List<WebElement> days = driver.findElements(By.id("day"));
			for(WebElement day:days) {
				System.out.println(day.getText());
			}
			driver.quit();
			}
		}


