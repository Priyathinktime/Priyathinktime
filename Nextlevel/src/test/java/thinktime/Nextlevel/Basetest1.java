package thinktime.Nextlevel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Basetest1 {
	WebDriver driver;
	@Test
	public WebDriver intialiser() {
		System.setProperty("Webdriver.Chrome.Driver","D:\\priya");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		return driver;
		


}
}