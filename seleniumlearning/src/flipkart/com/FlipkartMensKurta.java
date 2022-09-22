package flipkart.com;
    import java.util.Set;
    import java.util.Set;
    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;
    import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.firefox.FirefoxOptions;
	import org.openqa.selenium.interactions.Actions;
    public class FlipkartMensKurta {
		static WebDriver driver;
		
			    public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win321\\chromedriver.exe" );
				
				driver = new ChromeDriver();
				driver.get("https://www.flipkart.com");
				driver.manage().window().maximize();
				
				String PriWinID = driver.getWindowHandle();
				System.out.println(PriWinID);
				Set<String> allWinID = driver.getWindowHandles();
				System.out.println(allWinID);
				for(String SingleID:allWinID)  {
					if(!SingleID.equals(PriWinID));
					driver.switchTo().window(SingleID);
				}
					Thread.sleep(2000);
					driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("7507097842");
					driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("7507097842AJ");
					driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
					
					driver.switchTo().window(PriWinID);
				
				    WebElement moveTo = driver.findElement(By.xpath("(//div[@class='xtXmba'])[5]"));
				    Actions acn = new Actions(driver);
				    acn.moveToElement(moveTo).build().perform();
				    driver.findElement(By.xpath("(//a[@class=\"_6WOcW9 _3YpNQe\"])[5]")).click();
				    Thread.sleep(8000);
				    driver.quit();
				
			}
			
	}


