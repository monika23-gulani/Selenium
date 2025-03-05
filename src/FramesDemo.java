import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chocolatey\\bin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://jqueryui.com/droppable/");
		
		// 3 ways to switch to frame, b
		// index, id and webelement under frame
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		// Switch to frame attribute as id not present in DOM
		
		WebElement frameEle = driver.findElement(By.cssSelector("iframe.demo-frame"));
		
		driver.switchTo().frame(frameEle);
		
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement destination = driver.findElement(By.id("droppable"));
		
		// ACtions for drag and drop
		Actions a = new Actions(driver);
		a.dragAndDrop(src, destination).build().perform();
		
		// to return in normal page view or to come out of frame
		driver.switchTo().defaultContent();
		
	}

}
