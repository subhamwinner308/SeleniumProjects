package assignment;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flightsAssignment4 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\subham.saha\\Documents\\SELENIUM\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#search.aspx?mode=search");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT' and @value='Departure City']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),' Bengaluru (BLR)')]")).click();
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT' and @value='Arrival City']")).click();
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[contains(text(),' Chennai (MAA)')]")).click();
		
		driver.findElement(By.xpath("(//tr/td/a[contains(text(),'27')])[1]")).click();
		
		driver.findElement(By.xpath("(//input[@value='Search'])[1]")).click();
		
		System.out.println("Successful");
		
		driver.quit();

	}

}
