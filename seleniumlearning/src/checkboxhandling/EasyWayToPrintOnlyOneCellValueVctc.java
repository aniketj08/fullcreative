package checkboxhandling;

	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class EasyWayToPrintOnlyOneCellValueVctc {
	
		public static void main(String[] args)
		{
			System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver_win32 (105)\\\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://vctcpune.com/selenium/practice.html");
			
			List<WebElement> RowValue = driver.findElements(By.xpath("//table//tbody//tr//td"));
			System.out.println(RowValue.get(28).getText());
		}


}
