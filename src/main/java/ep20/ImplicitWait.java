package ep20;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
	public static void main(String[] args) {
		// Launch browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		// load the url
		driver.get("https://letcode.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// click login button
		driver.findElementByLinkText("Log in").click();
		// enter email
		driver.findElementByName("ema").sendKeys("hbkloges8@gmail.com");
		// enter pass
		driver.findElementByName("password").sendKeys("pass1234$");
		// click login button
		driver.findElementByXPath("//button[.='LOGIN']").click();
	}

	// Implicit wait is used to wait and search the element for a given time
	// Implicit wait will affect only findelementbyname, and findelementsbyname
	// Implicit wait will start to work before the finding elements
	//It is one time declaration
	//maximum time to wait for searching a element given by  user

}
