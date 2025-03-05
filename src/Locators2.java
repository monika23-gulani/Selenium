import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		String name = "rahul";
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chocolatey\\bin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String pwd = getPassword(driver);
		//Implicit wait of 5s. It will tell selenium to wait for 5 sec
		//Implicit wait is a global wait and applicable for all the web elements 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(pwd);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		String successlog= driver.findElement(By.tagName("p")).getText();
		Assert.assertEquals(successlog, "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText(), "Hello "+name+",");
		
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		driver.close();
	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordarray = driver.findElement(By.cssSelector("form p")).getText(); 
		String password = passwordarray.split("'")[1].split("'")[0];
		System.out.println(password);
		return password;
		
	}

}
