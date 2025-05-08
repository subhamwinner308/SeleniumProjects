package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\subham.saha\\Documents\\SELENIUM\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#search.aspx?mode=search");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")).click();
		
		//List<WebElement> curr = driver.findElements(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']/option"));
		
		WebElement curr = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select sl = new Select(curr);
		
		//sl.selectByIndex(1);
		
		for(int i=0;i<4;i++) {
			sl.selectByIndex(i);
			System.out.println(sl.getFirstSelectedOption().getText());
		}	
		
//		for(WebElement el:curr) {
//			String currency = el.getText();
//			System.out.println(currency);
//		}
		
		driver.quit();

	}

}
