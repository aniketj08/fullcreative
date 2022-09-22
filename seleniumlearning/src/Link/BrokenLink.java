package Link;

import java.io.IOException;
import java.net.HttpURLConnection;

import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Selenium\\\\chromedriver_win32 (105)\\\\chromedriver.exe");
	     driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     
	     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     driver.get("https://www.flipkart.com/");
	     Thread.sleep(3000);
	     List <WebElement> Links = driver.findElements(By.tagName("a"));
	      System.out.println(Links.size());
	      int brokenLinks = 0;
	      
	      for(WebElement elemet : Links) {
	    	  String url=elemet.getAttribute("href");
	    	  if(url==null || url.isEmpty()||elemet.getAttribute("href").contains("javascript")) {
	    			 System.out.println("URL is empty");
	    			 continue;
	    		 }
	    	 URL link = new URL(url);
	    	 HttpURLConnection httpConn =( HttpURLConnection)link.openConnection();
	    	 httpConn.connect();
	    	 
	    	 if(httpConn.getResponseCode()>=400)
	    	 {
	    		 System.out.println(url+" - "+ "is broken link");
	    		 brokenLinks++;
	    	 }
	    	 else
	    	 {
	    		 System.out.println(url+" - "+ "is valid link");
	    	 }
	    	 
	        }
	    	 driver.quit();
			}
	      }
