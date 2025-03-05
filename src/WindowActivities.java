import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chocolatey\\bin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//This get method will wait by default until complete page is loaded
		driver.get("http://google.com");
		//This navigate method will not wait for the complete page load
		driver.navigate().to("https://rahulshettyacademy.com/");
		// Click on back button
		driver.navigate().back();
		//Click on forward button
		driver.navigate().forward();
	}

}
