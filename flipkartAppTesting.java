import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartAppTesting {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\subham.saha\\Documents\\SELENIUM\\chromedriver\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		WebElement searchBox = driver.findElement(By.name("q"));
		
		searchBox.sendKeys("iphone 15 pro max",Keys.ENTER);
		
		//String price = driver.findElement(By.xpath("(//div[@class='_30jeq3 _1_WHN1'])[1]")).getText().replaceAll("[-+.^,?]", "").trim();
		
		String s[] = driver.findElement(By.xpath("(//div[@class='_30jeq3 _1_WHN1'])[1]")).getText().replaceAll("[-+.^,?]", "").split("");
		
		//double phone_price = Double.valueOf(price);
		
		//System.out.println("The phone price is: "+phone_price);
				
		driver.quit();
		
	}

}
