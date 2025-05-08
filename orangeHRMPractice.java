import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class orangeHRMPractice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\subham.saha\\\\Documents\\\\SELENIUM\\\\BrowserDrivers\\\\ChromeDriver\\\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement resources = driver.findElement(By.linkText("Resources"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(resources).perform();
		
		driver.findElement(By.linkText("eBooks")).click();
		
		driver.quit();
		
	}

}
