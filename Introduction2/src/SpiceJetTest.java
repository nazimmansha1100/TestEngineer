import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJetTest {

	public static void main(String[] args) {
		// SpiceJet testing
		
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://spicejet.com");
		
		//a[value='MAA']
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		
	}

}
