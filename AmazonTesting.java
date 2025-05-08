import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTesting {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		WebElement searchbar = driver.findElement(By.id("twotabsearchtextbox"));
		
		searchbar.sendKeys("iphone 15 pro max");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		driver.get("https://www.amazon.in/Apple-iPhone-Pro-Max-256/dp/B0CHX1K2ZC/ref=sr_1_1?crid=34I0KE6E4X40U&keywords=iphone+15+pro+max&qid=1707548709&sprefix=iphone+15+pro+max%2Caps%2C237&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1");
		
		//String price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		
		double phone_price = Double.valueOf(driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText());
		
		System.out.println("The phone price is: "+phone_price);
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]")).click();
		
		//String c_price = driver.findElement(By.id("attach-accessory-cart-subtotal")).getText();
		
		double cart_price = Double.valueOf(driver.findElement(By.id("attach-accessory-cart-subtotal")).getText());
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		if(phone_price==cart_price) {
			System.out.println("The cart price is: "+cart_price);
		}
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.quit();
		
	}

}
