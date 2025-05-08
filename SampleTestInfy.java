import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTestInfy {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\subham.saha 09-12-2024\\RESTORED FILES\\SELENIUM\\chromedriver\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("");
		
		
		
		driver.quit();
		
	}

}
