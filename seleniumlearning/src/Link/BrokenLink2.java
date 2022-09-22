package Link;


	import java.io.IOException;
	import java.net.HttpURLConnection;
	import java.net.MalformedURLException;
	import java.net.URL;
	import java.util.List;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
    public class BrokenLink2 {
		@SuppressWarnings("deprecation")
		public static void main(String[] args) throws InterruptedException, IOException {
			System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver_win32 (105)\\\\chromedriver.exe");
			
		    WebDriver driver = new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		    driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			
			//1.Click on links
		    Thread.sleep(3000);
		   List<WebElement> Links= driver.findElements(By.tagName("a"));	   
		     System.out.println(Links.size());
		     int brokenLinks =0;
		    
		     for(WebElement elemet :Links) {
		    String url=elemet.getAttribute("href");
		    	if(url== null || url.isEmpty()) {
		    	System.out.println("URL is empty");
		    		continue;
		    	}
		    	URL link =new URL(url);
		    	HttpURLConnection httpcode = (HttpURLConnection) link.openConnection();
		    	httpcode.connect();
		    	
		    	if(httpcode.getResponseCode()>=400) {
		    		System.out.println(httpcode.getResponseCode()+"--->"+url+" is --->"+"Broken Links");
		    		brokenLinks++;
		    	}
		    	else {
		    		System.out.println(httpcode.getResponseCode()+"--->"+url+" is --->"+"Valide Links");
		    	}	 	    	
		    }
		    System.out.println("Number of broken Links :"+brokenLinks);
		    driver.quit();
		}}

