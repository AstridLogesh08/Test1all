package ep12;

import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchChrome {

	public static void main(String[] args) {

		// Chrome
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

	}

}
