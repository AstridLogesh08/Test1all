package ep20;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		WebElement myframe = driver.findElementByXPath("//div[@id='iframewrapper']//iframe[1]");
		driver.switchTo().frame(myframe);
		driver.findElementByXPath("//button[text()='Try it']").click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Astrid Welcome vro!!");
		alert.accept();
		String name = driver.findElementById("demo").getText();
		System.out.println(name);

	}

}
