import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chocolatey\\bin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//Parent to child
		System.out.println(driver.findElement(By.xpath("//header/div/button/following-sibling::button[1]")).getText());
		
		//Child to Parent
		////header/div/button/parent::div
		System.out.println(driver.findElement(By.xpath("//header/div/button/parent::div/button[2]")).getText());
		

	}

}
