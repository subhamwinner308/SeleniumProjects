import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class orangeHrmValidateText {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\subham.saha\\Documents\\SELENIUM\\BrowserDrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver,10);//Explicit wait to wait before visibility of Resources element
		
		WebElement resources = driver.findElement(By.xpath("//div[@id='navbarSupportedContent']/ul/li/a[contains(text(),'Resources')]"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(resources).perform();
		
		wait.until(ExpectedConditions.visibilityOf(resources));
		
		driver.findElement(By.xpath("//div[@id='navbarSupportedContent']/ul/li[a[contains(text(),'Resources')]]//a[contains(text(),'Certification Program')]")).click();
		
		WebElement lang1 = driver.findElement(By.xpath("//div[@class='lan-1']/a[contains(text(),'EN')]"));
		
//		actions.moveToElement(lang).perform();
//		
//		lang.click();
		
		//driver.findElement(By.xpath("//div[@class='lan-1']/a[contains(text(),'EN')]")).click();
		
		actions.moveToElement(lang1).perform();
		lang1.click();
		
		if(driver.getCurrentUrl().contains("en")) {
			driver.findElement(By.xpath("//a/button[contains(text(),'Book a Free Demo')][1]")).getText().equals("Book a Free Demo");
		}
		
		WebElement lang2 = driver.findElement(By.xpath("//div[@class='lan-1']/a[contains(text(),'EN')]"));
		
		actions.moveToElement(lang2).perform();
		
		driver.findElement(By.xpath("//div[@class='lan-2']/a[contains(text(),'ES')]")).click();

		if(driver.getCurrentUrl().contains("es")) {
			driver.findElement(By.xpath("//a/button[contains(text(),'Agenda una Demo Gratis')][1]")).getText().equals("Agenda una Demo Gratis");
			System.out.println("Working");
		}
		
		driver.quit();
		
	}

}
