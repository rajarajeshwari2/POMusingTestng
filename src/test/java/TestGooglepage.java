import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.google_search;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestGooglepage {

	WebDriver driver;
	@BeforeTest
	public void setUp() {
	
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		

	}
	
	@Test
	public void verifyGooglepage() {
		google_search gs=new google_search(driver);
		gs.search_page();
		
		
		
	}
	@AfterTest
	public void tearDown() {
		if(driver!=null) {
			driver.quit();
		}
	}
	
}
