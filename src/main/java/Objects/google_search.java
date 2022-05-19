package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class google_search {
	
	WebDriver driver;
	public google_search(WebDriver driver) {
		this.driver=driver;
	}
	public void search_page() {
		
		/*WebElement root=driver.findElement(By.cssSelector("ntp-app"));
		SearchContext shadowroot1=(SearchContext) ((JavascriptExecutor)driver).executeScript("return arguments[0].shadowRoot", root);
		
		WebElement root2=shadowroot1.findElement(By.cssSelector("ntp-realbox"));
		SearchContext shadowRoot2=(SearchContext) ((JavascriptExecutor)driver).executeScript("return arguments[0].shadowRoot", root2);
		
		shadowRoot2.findElement(By.cssSelector("#input")).sendKeys("selenium");;
		*/
		
		JavascriptExecutor jse=((JavascriptExecutor)driver);
		
		WebElement search=(WebElement)jse.executeScript("return document.querySelector('ntp-app').shadowRoot.querySelector('ntp-realbox').shadowRoot.querySelector('input')");
		
		String js="arguments[0].setAttribute('value','NaveenAutomationLabs')";
		
		((JavascriptExecutor)driver).executeScript(js, search);	
	}
	

}
