import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazontest1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 15");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(5000);
		String price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText().replaceAll("[^\\d.]","");
		System.out.println("The price of the phone is: "+price);
		
		driver.quit();
	}

}
