import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class scrollDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chocolatey\\bin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//To scroll browser window
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		
		// To scroll page component ex: table on the web page
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		List<WebElement> values=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum=0;
		for(WebElement s:values)
		{	
			sum= sum+Integer.parseInt(s.getText());
			
		}
		
		System.out.println(sum);
		
		System.out.println(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		int total= Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		Assert.assertEquals(sum, total);
		
	}

}
