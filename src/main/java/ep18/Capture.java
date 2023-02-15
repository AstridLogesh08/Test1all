package ep18;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Capture {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver(); 
	driver.get("https://letcode.in/buttons");
	File firstSrc = driver.getScreenshotAs(OutputType.FILE);
	File desti = new File("./snaps/img.png");
	FileHandler.copy(firstSrc, desti);
	
	WebElement ele = driver.findElementById("home");
	File elesrc = ele.getScreenshotAs(OutputType.FILE);
	File eledesti = new File("./snaps/img2.png");
	FileHandler.copy(elesrc, eledesti);
	
	WebElement info = driver.findElementByClassName("footer");
	elesrc = info.getScreenshotAs(OutputType.FILE);
	eledesti = new File("./snaps/img3.png");
	FileHandler.copy(elesrc, eledesti);
	
	
	driver.quit();
	
}
}
