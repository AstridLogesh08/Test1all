package ep22;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestDrag {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/dropable");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement source = driver.findElementByXPath("//div[contains(@class,'ui-widget-content ui-draggable')]");
		WebElement desti = driver.findElementById("droppable");
		Actions act = new Actions(driver);
		act.dragAndDrop(source, desti).perform();
		
		
		
		
		
		
		
	}

}
