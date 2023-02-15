package ep17;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleButtons {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/ChromeDriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/buttons");
		// Get the X & Y Co-ordinates
		// driver.findElementById("position").getLocation(); This statement is also
		// correct, its not stored
		WebElement ele = driver.findElementById("position"); // Here web element is interface, its not a class,here it
																// is stored
		Point point = ele.getLocation(); // 1st point is Class name, 2nd point is object name
		int x = point.getX();
		int y = point.getY();
		System.out.println("X => " + x + " Y => " + y);
		// Find the color of the Button
		WebElement btncolor = driver.findElementById("color");
		String color = btncolor.getCssValue("background-color");
		System.out.println(color);
		// Find the height and width of the button
		Rectangle rect = driver.findElementById("property").getRect();
		System.out.println(rect.getWidth());
		System.out.println(rect.getHeight());
		Dimension dime = rect.getDimension();
		System.out.println(dime);
		System.out.println(dime.getHeight());
		System.out.println(dime.getWidth());
		// Confirm button is disabled
		boolean isDisabled = driver.findElementById("isDisabled").isEnabled();
		System.out.println(isDisabled);

		driver.quit();

	}
}
