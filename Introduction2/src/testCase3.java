import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testCase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		System.out.println("Title of page is: " + driver.getTitle());
		
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("myowncss");
		driver.findElement(By.cssSelector("input[name=reg_email__]")).sendKeys("0774164234");
		
		//driver.findElement(By.id("email")).sendKeys("This is my first code");
		//driver.findElement(By.name("pass")).sendKeys("1234");
		
		
		//System.out.println(driver.getCurrentUrl());
		
		//System.out.println(driver.getPageSource());		
	
		//driver.get("http://yahoo.com");
		
		//System.out.println("On yahoo page now");
		
		//driver.navigate().to("https://www.amazon.co.uk");
		
		//driver.close();
		//driver.quit();
	}

}
