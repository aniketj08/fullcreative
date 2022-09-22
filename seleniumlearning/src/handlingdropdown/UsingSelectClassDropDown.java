package handlingdropdown;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

	public class UsingSelectClassDropDown {
		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\\\Selenium\\\\chromedriver_win32 (105)\\\\chromedriver.exe");
			
			driver = new ChromeDriver();
			driver.get("https://mbasic.facebook.com/");
			driver.manage().window().maximize();
			//click on create new account
			driver.findElement(By.cssSelector("#signup-button input")).click();
			Thread.sleep(1000);
			WebElement day = driver.findElement(By.cssSelector("#day"));
			WebElement month = driver.findElement(By.cssSelector("#month"));
			WebElement year = driver.findElement(By.cssSelector("#year"));
			Select selDay = new  Select(day);
			selDay.selectByVisibleText("18");
			
			Select selMonth = new  Select(month);
			selMonth.selectByValue("6");
			
			Select selYear = new  Select(year);
			selYear.deselectByVisibleText("1993");

		}
}
