import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findRatingPriceOfProductAmazon {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:/Users/subham.saha/Documents/SELENIUM/BrowserDrivers/ChromeDriver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 15 pro max");
		driver.findElement(By.xpath("(//div[contains(text(),'iphone 15 pro max')])[1]")).click();
		
		/*Storing all the product names into a list*/
		List <WebElement> produtLists = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		/*Storing all the ratings and prices of products into a two different lists*/
		List <WebElement> ratingLists = driver.findElements(By.xpath("//span[@class='a-size-base s-underline-text']"));
		List <WebElement> priceLists = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		String givenproductName = "Apple iPhone 15 Pro (128 GB) - Natural Titanium";
		
		for (WebElement product : produtLists){
	           String productName = product.getText();
	           if(productName.equalsIgnoreCase(givenproductName)){
	        	   int reqindex = produtLists.indexOf(product);
	        	   System.out.println("The rating of the given product is: "+ratingLists.get(reqindex).getText());
	        	   System.out.println("The price of the given product is: "+priceLists.get(reqindex).getText());
	        	   break;
	        }
		}
		
		driver.close();

	}

}
