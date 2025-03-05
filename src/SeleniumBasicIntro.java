import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumBasicIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Webdriver methods+C+Chromedriver methods
	
		// Selenium manager automatically download chromedriver.exe and fetch from path , we dont need to set explicitly
		// other option we can give our own path and own chromdriver.exe
		
		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chocolatey\\bin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		/*Firefox driver
		System.setProperty("webdriver.gecko.driver", "C:\\ProgramData\\chocolatey\\bin\\gecko.exe");
		WebDriver driver1 = new FirefoxDriver();*/
		
		/*Edge driver
		System.setProperty("webdriver.edge.driver", "C:\\ProgramData\\chocolatey\\bin\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();*/
		
		driver.get("https://courses.rahulshettyacademy.com/courses/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.quit();

	}

}
