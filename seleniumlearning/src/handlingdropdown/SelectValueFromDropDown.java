package handlingdropdown;

	import java.util.List;

    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
   public class SelectValueFromDropDown {
		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\\\Selenium\\\\chromedriver_win32 (105)\\\\chromedriver.exe");
			
			driver = new ChromeDriver();
			driver.get("https://mbasic.facebook.com/");
			driver.manage().window().maximize();
			
			driver.findElement(By.cssSelector("#signup-button input")).click();
			Thread.sleep(1000);
			
			//print all the option from drop down
			List<WebElement> days =  driver.findElements(By.cssSelector("#day option"));
			for(WebElement day:days) {
				if(day.getText().equals("18"))
					day.click();}
			//select month
			List<WebElement> months = driver.findElements(By.cssSelector("#month option"));
			for(WebElement month:months) {
				if(month.getText().equalsIgnoreCase("jun"))
					month.click();
			}
			List<WebElement> years = driver.findElements(By.xpath("//*[@id='year']//option"));
			for(WebElement year:years) {
				if(year.getText().equals("1993"))
					year.click();
				}
			driver.quit();
	}
}