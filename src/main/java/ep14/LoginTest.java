package ep14;
import org.openqa.selenium.chrome.ChromeDriver;
public class LoginTest {

	public static void main(String[] args) {
		//Launch browser
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//load the url
		driver.get("https://letcode.in/");
		//click login button
		driver.findElementByLinkText("Log in").click();
		//enter email
		driver.findElementByName("email")
		.sendKeys("hbkloges8@gmail.com");
		//enter pass
		driver.findElementByName("password")
		.sendKeys("pass1234$");
		//click login button
		driver.findElementByXPath("//button[.='LOGIN']").click();
	}
	
	
	
}
