package thinktime.Nextlevel;

import org.openqa.selenium.WebDriver;

public class Openingpage {
	WebDriver driver;
	public Openingpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public void thinktimes() {
		 driver.get("https://thinktime.in/");
	 }
}
