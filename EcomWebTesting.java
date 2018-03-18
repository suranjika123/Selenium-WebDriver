import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class EcomWebTesting {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/Kajal/Downloads/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		// Open flipkart.com website.
		driver.get("https://www.flipkart.com/");
		
		// Search for iphone in the search box.
		WebElement search = driver.findElement(By.xpath("//input[@class='LM6RPg']"));
		search.sendKeys("Iphone");
		search.sendKeys(Keys.ENTER);
		
		// Make sure thread sleep for some time.
		Thread.sleep(5000);
		
		// get all sortby links present on search page
		List<WebElement> links = driver.findElements(By.xpath("//ul[@class = '_3fPYHw']/li"));
		
		//Print all the sortby links present on page
		System.out.println(links.size());
		for (int i = 0; i<links.size(); i=i+1)
		{
			System.out.println(links.get(i).getText());
		}
		
		// click on the Popularity Link present on search by.
		links.get(1).click();
		
		// click on the offer link present on the website
		WebElement offer = driver.findElement(By.xpath("//div[@class = '_2GQLOX']"));
		offer.click();
		
		// close the driver
		driver.quit();
	}

}
