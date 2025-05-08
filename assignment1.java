package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment1 {
		
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\subham.saha 09-12-2024\\RESTORED FILES\\SELENIUM\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(5000);
		
//		String parent = driver.getWindowHandle();
//		
//		Set<String>s = driver.getWindowHandles();
//		
//		Iterator<String> I1 = s.iterator();
//		
//		while(I1.hasNext()) {
//			
//			String child_window = I1.next();
//			
//			if(!parent.equals(child_window)) {
//				driver.switchTo().window(child_window);
//				driver.close();
//			}
//		}
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Subham Saha");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("subhamsaha@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9741251705");
		driver.findElement(By.xpath("//button[contains(text(),'Reset Login')]")).click();
		
		String msg = driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
		
		//String[] elements = msg.split(" ");
		
		String[] elements = msg.split("'");
		
		String pwd= elements[1];
		
		//System.out.println(pwd);
		
//		for(int i=0;i<elements.length;i++) {
//			if(elements[i].startsWith("'")) {
//				pwd = elements[i].substring(1, elements[i].length()-1);
//			}
//		}
		
		driver.findElement(By.xpath("//button[contains(text(),'Go to Login')]")).click();
		//driver.switchTo().window(parent);
		
		driver.findElement(By.id("inputUsername")).sendKeys("Subham Saha");
		
		driver.findElement(By.name("inputPassword")).sendKeys(pwd);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//label[contains(text(),' Remember my username')]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//label[contains(text(),' I agree to the ')]")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
		
		Thread.sleep(5000);
		
		//System.out.println("New password is: "+pwd);
		
		driver.quit();
		
	}

}
