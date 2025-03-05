import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddElementsToCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chocolatey\\bin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		// Expected items
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot", "Carrot" };

		Thread.sleep(3000);
		
		addItems(driver,itemsNeeded);
	}
	
	public static void addItems(WebDriver driver,String[] itemsNeeded)
	{
		int j = 0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {
			// actual on page - name looks like Brocolli - 1 kg
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();

			List expectedItems = Arrays.asList(itemsNeeded);
			if (expectedItems.contains(formattedName)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == expectedItems.size()) {
					break;
				}
			}

		}
	}

}
