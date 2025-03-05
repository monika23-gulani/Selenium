import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String year = "2025";
		String month = "10";
		String date = "23";
		String[] expectedList= {month,date,year};

		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chocolatey\\bin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		driver.findElement(By.xpath("//button[text()='" + year + "']")).click();
		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month"))
				.get(Integer.parseInt(month) - 1).click();
		driver.findElement(By.xpath("//abbr[text()='" + date + "']")).click();
		
		List<WebElement> els= driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
		for(int i=0;i<els.size();i++)
		{
			System.out.println(els.get(i).getAttribute("value"));
			Assert.assertEquals(els.get(i).getAttribute("value"), expectedList[i]);
		}
		driver.close();
	}

}
