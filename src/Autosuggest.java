import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chocolatey\\bin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("ind");
		Thread.sleep(1000);
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for(WebElement ele : options)
		{
			if(ele.getText().equalsIgnoreCase("India"))
			{
				ele.click();
				break;
			}
		}
	}

}
