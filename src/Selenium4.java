import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class Selenium4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chocolatey\\bin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement nameEditBox =driver.findElement(By.cssSelector("[name='name']"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());
		
		WebElement lblDOB= driver.findElement(By.cssSelector("[for='dateofBirth']"));
		driver.findElement(with(By.tagName("input")).below(lblDOB)).click();
		
		WebElement lblIcrecream = driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(lblIcrecream)).click();
		
		WebElement radiobtn = driver.findElement(By.id("inlineRadio1"));
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(radiobtn)).getText());
	}

}
