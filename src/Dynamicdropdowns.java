import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicdropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chocolatey\\bin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']/div[1]/div")).click();

		driver.findElement(By.xpath("//div[contains(text(),'IXB')]")).click();
		Thread.sleep(2000);
		// because from and to both contain same cities so it will try to look from 1st
		// dropdown which was closed after selecting f7rom city
		//driver.findElement(By.xpath("(//div[contains(text(),'BLR')])[1]")).click();
		driver.findElement(By.xpath("//div[@data-testid='to-testID-destination'] //div[contains(text(),'DEL')]")).click();
		
		
	}

}
