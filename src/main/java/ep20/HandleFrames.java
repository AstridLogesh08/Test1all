package ep20;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://letcode.in/frame");
	WebElement myFrame = driver.findElementByXPath("//iframe[@src='frameUI']");
	driver.switchTo().frame(myFrame);
	driver.findElementByName("fname").sendKeys("Astrid");
	driver.findElementByName("lname").sendKeys("Toothless");
	driver.switchTo().frame(0);
	driver.findElementByName("email").sendKeys("astrid@mail.com");
	driver.switchTo().parentFrame();
	driver.findElementByName("lname").sendKeys("/Night Fury");
	driver.switchTo().defaultContent();
	driver.findElementByXPath("//a[contains(text(),'Watch tutorial')]").click();
}
	
	
	
	
}
// iframe is used to embedd the html within the html
//Switchto function is used to Jump to the next html tag