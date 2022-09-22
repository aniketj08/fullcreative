import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FullCreativeTask {public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32 (105)\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.get("https://trello.com/login");
	driver.manage().window().maximize();
	
	 WebElement EnterEmail =
			 driver.findElement(By.xpath("//input[@id='user']"));
	       EnterEmail.sendKeys("aniketjadhao08@gmail.com");
	       Thread.sleep(1000);
	       
	    	 WebElement Login =
		  	 driver.findElement(By.xpath("//input[@id='login']"));
		  	 Login.click();
		  	 Thread.sleep(1000); 				 
		WebElement EnterPassward =
		  	 driver.findElement(By.xpath("//input[@id='password']"));
		  	  EnterPassward.sendKeys("Trello@123");
		   WebElement Login1 =
		 	 driver.findElement(By.xpath("//button[@id='login-submit']//span[contains(text(),'Log in')]"));
		 	 Login1.click();
		 	 Thread.sleep(3000); 
		 	 
		 	 WebElement openBoard1 = driver.findElement(By.xpath("//div[@title='Board1']"));
		 	  openBoard1.click();
		 	  
		 	  Actions act=new Actions(driver);
		 	  
		 	 WebElement ListA=
		 	 driver.findElement(By.xpath("//*[@id=\"board\"]/div[1]/div/div[2]/a[1]/div[3]/span"));
		 			 
		 	 WebElement dest=
		 	 driver.findElement(By.xpath("//*[@id=\"board\"]/div[2]/div/div[3]/a"));
		 	 
		 	 System.out.println(ListA.getText());
		 	 System.out.println(dest.getText());
		 	 
		 	 act.dragAndDrop(ListA, dest).perform();
	 
//		 	 act.clickAndHold(ListA).moveToElement(dest).build().perform();
		 	 
}}
