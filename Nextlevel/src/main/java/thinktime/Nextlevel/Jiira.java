package thinktime.Nextlevel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jiira {

	public static void main(String[] args) {
		
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("Webdriver.Chrome.Driver", "D:\\priya");
			WebDriver driver = new ChromeDriver();
			driver.get("https://thinktime.in/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,800)");
			driver.findElement(By.className("wpr-button-text")).click();
			js.executeScript("window.scrollBy(0,800)");
			driver.findElement(By.name("names[first_name]")).sendKeys("Priyadharshini");
			driver.findElement(By.name("names[last_name]")).sendKeys("1117");
			driver.findElement(By.id("ff_6_email")).sendKeys("priya@thinktime.in");
			driver.findElement(By.id("ff_6_numeric-field")).sendKeys("8012296989");
			//driver.findElement(By.id("ff_6_country-list")).click();
			driver.findElement(By.id("ff_6_country-list")).sendKeys("India");
			driver.findElement(By.id("ff_6_dropdown")).sendKeys("auto");
			driver.findElement(By.id("ff_6_message")).sendKeys("Hi Team!");
			driver.findElement(By.className("ff-btn-submit")).click();
			Thread.sleep(3000);
			driver.findElement(By.className("fa-twitter")).click(); 
	    	driver.navigate().back();
	    	driver.findElement(By.className("fa-facebook")).click();
	    	driver.navigate().back();
	    	driver.findElement(By.className("fa-linkedin")).click();
	    	driver.navigate().back();
	    	driver.findElement(By.className("fa-instagram")).click();
	    	driver.navigate().back();
	    	driver.findElement(By.className("icon-phone-call2")).click();
	    	driver.navigate().back();
	    	driver.findElement(By.className("hm-map-marker")).click();
	    	driver.navigate().back();
	    	driver.findElement(By.className("icon-email")).click();
	     	driver.navigate().back();
	     	driver.findElement(By.className("fa-phone-alt")).click();
		}
	
		// TODO Auto-generated method stub

	}

}
