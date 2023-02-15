package ep16;

import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Exit;

public class DriverNavi {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.youtube.com/");
		Thread.sleep(2000);
		driver.get("https://letcode.in/buttons");
		String url = driver.getCurrentUrl();
		System.out.println("Current page Url " + url);
		Thread.sleep(3000);
		driver.findElementById("home").click();
		String homeurl = driver.getCurrentUrl();
		System.out.println("Home page Url " + homeurl);
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		System.out.println("Return to Buttons page " + driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().to("https://www.youtube.com/");
		driver.close();

		// Navigation is used in the sense of history, to go back, forward, refresh, to;

	}

}
