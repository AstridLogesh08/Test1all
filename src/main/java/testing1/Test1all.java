package testing1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;


public class Test1all {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	
	
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/");
	WebElement user = driver.findElementById("user-name");
	user.sendKeys("standard_user");
	WebElement pass = driver.findElementById("password");
	pass.sendKeys("secret_sauce");
	driver.findElementById("login-button").click();
	String url = driver.getCurrentUrl();
	System.out.println(url);
	Thread.sleep(3000);
	driver.findElementById("item_0_img_link").click();
	Thread.sleep(3000);
	driver.findElementById("add-to-cart-sauce-labs-bike-light").click();
	Thread.sleep(3000);
	driver.findElementByClassName("shopping_cart_link").click();
	Thread.sleep(2000);
	driver.findElementById("checkout").click();
	Thread.sleep(1000);
	WebElement firstname = driver.findElementById("first-name");
	firstname.sendKeys("ASTRID");
	Thread.sleep(2000);
	WebElement lastname = driver.findElementById("last-name");
	lastname.sendKeys("NIGHTFURY");
	Thread.sleep(2000);
	WebElement post = driver.findElementById("postal-code");
	post.sendKeys("6000010");
	Thread.sleep(2000);
	driver.findElementById("continue").click();
	Thread.sleep(2000);
	driver.findElementById("finish").click();
	Thread.sleep(2000);
	driver.findElementById("react-burger-menu-btn").click();
	Thread.sleep(2000);
	driver.findElementByXPath("//a[contains(text(),'Logout')]").click();
	
	
}
}