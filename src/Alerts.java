import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chocolatey\\bin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("name")).sendKeys("hello monika");
		driver.findElement(By.id("alertbtn")).click();
		
		String alertText = driver.switchTo().alert().getText();
		
		System.out.println(alertText);
		driver.switchTo().alert().accept();
		
		Thread.sleep(1000);
		driver.findElement(By.id("confirmbtn")).click();
		String alertText2 = driver.switchTo().alert().getText();
		System.out.println(alertText2);
		Alert a = driver.switchTo().alert();
		a.dismiss();
		
	}

}
