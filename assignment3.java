package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment3 {
		
		
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\subham.saha\\\\Documents\\\\SELENIUM\\\\chromedriver\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#search.aspx?mode=search");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		
		//Adding 5 adults
		for(int i=0;i<4;i++) {
			WebElement adult = driver.findElement(By.xpath("//span[@id='hrefIncAdt']"));
			adult.click();
		}
		
		//Adding 1 child
		driver.findElement(By.xpath("//span[@id='hrefIncChd']")).click();
		
		//Adding 1 infant
		driver.findElement(By.xpath("//span[@id='hrefIncInf']")).click();
		
		driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();
		
		String passengers = driver.findElement(By.id("divpaxinfo")).getText();
		
		System.out.println(passengers);
		
		driver.quit();
		
	}

}
