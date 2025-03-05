import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleWindow {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chocolatey\\bin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		
		// Open new tab or window
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.WINDOW);

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parent = it.next();
		String child = it.next();

		driver.switchTo().window(child);
		driver.get("https://rahulshettyacademy.com/#/practiceproject");
		String coursename = driver.findElements(By.cssSelector("[href*='https://courses.rahulshettyacademy.com/p']"))
				.get(1).getText();
		driver.switchTo().window(parent);
		WebElement ele = driver.findElement(By.cssSelector("[name='name']"));
		// Get Webelement dimension
		System.out.println(ele.getRect().getDimension().getHeight());
		System.out.println(ele.getRect().getDimension().getWidth());
		
		ele.sendKeys(coursename);
		//Partial screenshot
		File src = ele.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("logo.png"));
		driver.quit();
		
		
		//Get Height and Window
		
		
		

	}

}
