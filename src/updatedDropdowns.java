import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class updatedDropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chocolatey\\bin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']/div[2]")).click();
		Thread.sleep(1000);
		for (int i = 1; i < 5; i++) {
			driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
		}

		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers-done-cta']")).click();

		System.out.println(driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']/div[2]")).getText());
	}

}
