import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chocolatey\\bin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.amazon.com/");
		// To inherit driver capabilities to interact with browser, driver object needs
		// to be passed in actions class
		Actions act = new Actions(driver);
	
		WebElement moveTo = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));

		// Move to this element and perform right click
		act.moveToElement(moveTo).contextClick().build().perform();

		// move to element and click , type hello, double click to select the element
		act.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT)
				.sendKeys("hello").doubleClick().build().perform();
	}

}
