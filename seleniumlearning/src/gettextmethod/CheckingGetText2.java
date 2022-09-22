package gettextmethod;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class CheckingGetText2 {
		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver","C:\\\\Selenium\\\\chromedriver_win32 (105)\\\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.get("https://opensource-demo.orangehrmlive.com/");
				driver.manage().window().maximize();
				
				 WebElement textWeWant = driver.findElement(By.xpath("//*[(text()='Login Panel')]"));
			/////*[contains(text(),'Lo')]
				 String checkText = textWeWant.getText();
				 System.out.println(checkText);
				 if(checkText.equals("Login Panel"))
					 System.out.println("text is as excepted");
				 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
				 driver.findElement(By.id("txtPassword")).sendKeys("admin123");
				 driver.findElement(By.id("btnLogin")).click();
				 Thread.sleep(2000);
				 driver.findElement(By.id("welcome")).click();
				 Thread.sleep(1000);
				 driver.findElement(By.partialLinkText("Logout")).click();
				 Thread.sleep(3000);
				 driver.quit();

}
}