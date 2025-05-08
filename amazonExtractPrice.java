import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonExtractPrice {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\subham.saha 09-12-2024\\RESTORED FILES\\SELENIUM\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone 15 pro max");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//div[@class='s-suggestion s-suggestion-ellipsis-direction'])[1]")).click();
		
		Thread.sleep(3000);
		
		String price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		
		String pr= price.replaceAll("[^\\d.]", "");
		
		//String pr = price.substring(1, price.length());
		
		System.out.println("Price is: "+pr);
		
		driver.quit();

	}

}
