import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class orangeHrmResourcesList {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\subham.saha\\Documents\\SELENIUM\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();

		Actions action = new Actions(driver);
		
		String tabs[] = {"eBooks","Blog","Product Overview","The HR Dictionary","Other Resources","Certification Program"};
		
		for(int i =0;i<6;i++) {
			
			WebElement res = driver.findElement(By.xpath("(//a[contains(text(),'Resources')])[1]"));
			action.moveToElement(res).perform();
			
//			try {
//				WebElement res = driver.findElement(By.xpath("(//a[contains(text(),'Resources')])[1]"));
//				action.moveToElement(res).perform();
//				System.out.println("Working "+(i+1));
//			}catch(StaleElementReferenceException e) {
//				driver.navigate().refresh();
//				WebElement res = driver.findElement(By.xpath("(//a[contains(text(),'Resources')])[1]"));
//				action.moveToElement(res).perform();
//				System.out.println("Working "+(i+2));
//			}
			
			if(tabs[i]=="eBooks") {
				WebElement ebooks = driver.findElement(By.xpath("(//a[contains(text(),'eBooks')])[1]"));
				ebooks.click();
				Thread.sleep(3000);
				driver.navigate().back();
				Thread.sleep(2000);
			}
			
			else if(tabs[i]=="Blog") {
				WebElement blog = driver.findElement(By.xpath("(//a[contains(text(),'Blog')])[1]"));
				blog.click();
				Thread.sleep(3000);
				driver.navigate().back();
				Thread.sleep(2000);
			}
			
			else if(tabs[i]=="Product Overview") {
				WebElement productOverview = driver.findElement(By.xpath("(//a[contains(text(),'Product Overview')])[1]"));
				action.moveToElement(productOverview).perform();
				driver.findElement(By.xpath("(//a[contains(text(),'OrangeHRM ROI')])[1]")).click();
				driver.navigate().back();
				Thread.sleep(2000);
			}
			
			else if(tabs[i]=="The HR Dictionary") {
				WebElement hrDirectory = driver.findElement(By.xpath("(//a[contains(text(),'The HR Dictionary')])[1]"));
				hrDirectory.click();
				Thread.sleep(3000);
				driver.navigate().back();
				Thread.sleep(2000);
			}
			
			else if(tabs[i]=="Other Resources") {
				WebElement otherresources = driver.findElement(By.xpath("(//a[contains(text(),'Other Resources')])[1]"));
				action.moveToElement(otherresources).perform();
				driver.findElement(By.xpath("(//a[contains(text(),'OrangeHRM API')])[1]")).click();
				driver.navigate().back();
				Thread.sleep(2000);
			}
			
			else if(tabs[i]=="Certification Program") {
				WebElement certificationProgram = driver.findElement(By.xpath("(//a[contains(text(),'Certification Program')])[1]"));
				certificationProgram.click();
				Thread.sleep(3000);
				driver.navigate().back();
				Thread.sleep(2000);
			}
			
		}
		
		driver.quit();

	}

}


