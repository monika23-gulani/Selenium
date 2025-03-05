import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnchorLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chocolatey\\bin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// Calculate total no of links present on page
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//Calculate the total no of links present under footer
		WebElement elefooter = driver.findElement(By.id("gf-BIG"));
		System.out.println(elefooter.findElements(By.tagName("a")).size());
		
		// click on each link of first column in footer
		WebElement columndriver = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		List<WebElement> linksOfColumn = columndriver.findElements(By.tagName("a"));
		System.out.println(linksOfColumn.size());
		for(int i=1;i<linksOfColumn.size();i++)
		{
			String clickOnlink = Keys.chord(Keys.CONTROL,Keys.ENTER);
			linksOfColumn.get(i).sendKeys(clickOnlink);
			System.out.println(driver.getTitle());
		}
		
		
	}

}
