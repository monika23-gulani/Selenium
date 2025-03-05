import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chocolatey\\bin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

		driver.findElement(By.className("blinkingText")).click();

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> w = windows.iterator();
		String parentWindow = w.next();
		String childWindow = w.next();

		driver.switchTo().window(childWindow);

		String useremail = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		// split this text and get email : Please email us at
		// mentor@rahulshettyacademy.com with below template to receive response
		driver.switchTo().window(parentWindow);
		driver.findElement(By.id("username")).sendKeys(useremail);

	}

}
