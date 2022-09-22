package launching;

import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Selenium\\\\chromedriver_win32 (105)\\\\chromedriver.exe");
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
	}

}
