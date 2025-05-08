import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
		
public class sampletest {
		
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/subham.saha/Documents/SELENIUM/BrowserDrivers/ChromeDriver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//input[@name='name'])[1]")).sendKeys("Subham");
		driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys("subham.saha@gmail.com");
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("subham@123");
		driver.findElement(By.xpath("//label[contains(text(),'Employed')]")).click();
		driver.findElement(By.xpath("(//input[@name='bday'])[1]")).sendKeys("10-12-2020");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(5000);
//		driver.findElement(By.name("bday")).sendKeys("02");
//		driver.findElement(By.name("bday")).sendKeys("2020");
		
		driver.close();
		
	}

}
