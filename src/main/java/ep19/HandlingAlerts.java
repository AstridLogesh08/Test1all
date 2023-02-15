package ep19;

import java.sql.Driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/alert");
		// Simple alert
		//driver.switchTo().alert().accept();
		//2. trying to handle the alert without calling the alert
		driver.findElementById("accept").click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println("Simple alert text " + text);
		alert.accept();
		// Confirm alert
		driver.findElementById("confirm").click();
		Alert alert1 = driver.switchTo().alert();
		String txt = alert.getText();
		System.out.println("Confirm Alert " + txt);
		alert.dismiss();
		// Prompt Alert
		driver.findElementById("prompt").click();
		// System.out.println(driver.getCurrentUrl()); // 1. trying to get the url or
		// Doing something
		// without Accepting the Alert MEssage will get an error
		driver.switchTo().alert();
		alert.sendKeys("Astrid Welcome Vro!!");
		alert.accept();
		String name = driver.findElementById("myName").getText();
		System.out.println(name);

	}
}

// Notes:
// Alert => 1. accept 2.Dismiss 3.Send keys 4. Get text
// Exception handling => 1 Unhandled Error Exception
// 2 No Alert present Exception
