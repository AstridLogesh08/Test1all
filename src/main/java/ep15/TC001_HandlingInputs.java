package ep15;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
public class TC001_HandlingInputs {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/edit");
		//Enter your Full Name
		driver.findElementById("fullName").sendKeys("Lakshmipathy");
		//Append a text and press keyboard tab
		driver.findElementById("join").sendKeys(" person", Keys.TAB);
		//What is inside the text box
		String myvalue = driver.findElementById("getMe").getAttribute("value");
		System.out.println(myvalue);
		//Clear the text
		driver.findElementById("clearMe").clear();
		//confirm edit field is disabled
		boolean isEdit = driver.findElementById("noEdit").isEnabled();
		System.out.println(isEdit);
		//confirm text is read only
		String isRead = driver.findElementById("dontwrite").getAttribute("readonly");
		System.out.println(isRead);
		//Quit from browser
		driver.quit();
	}
	
	
	
	
}
