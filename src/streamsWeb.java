import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class streamsWeb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chocolatey\\bin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		List<WebElement> fruits= driver.findElements(By.xpath("//tr/td[1]"));
		
		List<String> originalList = fruits.stream().map(s->s.getText()).collect(Collectors.toList());
		
		List<String> sortedString = originalList.stream().sorted().collect(Collectors.toList());
		
		Assert.assertTrue(originalList.equals(sortedString));
		List<String> price;
		
		do
		{
			List<WebElement> rows= driver.findElements(By.xpath("//tr/td[1]"));
			price = rows.stream().filter(s->s.getText().contains("Rice")).map(s->getPriceVeggie(s)).collect(Collectors.toList());
			price.forEach(s->System.out.println(s));
			if(price.size()<1)
			{
				driver.findElement(By.cssSelector("[aria-label='Next']")).click();
			}
			
		}while(price.size()<1);
		
		
	}
	
	private static String getPriceVeggie(WebElement ele)
	{
		return ele.findElement(By.xpath("following-sibling::td[1]")).getText();
		
	}

}
