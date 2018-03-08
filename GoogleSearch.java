import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GoogleSearch {

	public static void main(String[] args) {
		// Set Chrome driver Property
		System.setProperty("webdriver.chrome.driver", "C:/Users/xxxxx/Downloads/chromedriver_win32/chromedriver.exe");
		
		//Open google.com in Chrome WebDriver.
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.google.com/");
		
		// Set implicitlyWait for 20 seconds.
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// Locate the Search box and Enter Selenium to Search.
		WebElement search = driver.findElement(By.id("lst-ib"));
		search.sendKeys("Selenium");
		search.sendKeys(Keys.ENTER);
		
		// Find out the no of results 
		WebElement noOfResult = driver.findElement(By.id("resultStats"));
		System.out.println("Total No of Results: "+ noOfResult.getText());
		
		// Locate the first result and click on the link 
		WebElement firstResult = driver.findElement(By.xpath("//div[@id='ires']//div[@class='srg']/div[@class='g'][1]//a"));
		System.out.println("First Result: "+ firstResult.getText());
		firstResult.click();
		
		driver.close();
	}

}
