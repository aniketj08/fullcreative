package getwinhandle;

	import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;
    public class CurrentScreenWinID {
			
		static WebDriver driver;
		public static void main(String[] args)throws InterruptedException {
			
		 System.setProperty("webdriver.chrome.driver","C:\\\\Selenium\\\\chromedriver_win32 (105)\\\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		 Thread.sleep(1000);
		 String winIdOfPrimaryScreen = driver.getWindowHandle();
		 System.out.println(winIdOfPrimaryScreen);

}
}