import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Radiobuttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chocolatey\\bin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.spicejet.com/");
		String styledetails = driver.findElement(By.xpath("//div[@data-testid='return-date-dropdown-label-test-id']")).getAttribute("style");

		System.out.println(styledetails);
		System.out.println(driver.findElement(By.xpath("//div[@data-testid='return-date-dropdown-label-test-id']/div[1]")).getAttribute("style"));
		//round trip enabled and return field is also enabled
		driver.findElement(By.xpath("//div[@data-testid='round-trip-radio-button']/div[1]")).click();
		System.out.println(driver.findElement(By.xpath("//div[@data-testid='return-date-dropdown-label-test-id']/div[1]")).getAttribute("style"));
		
		String opacity = driver.findElement(By.xpath("//div[@data-testid='return-date-dropdown-label-test-id']/div[1]")).getAttribute("style");
		
		if(opacity.contains("1"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}

}
