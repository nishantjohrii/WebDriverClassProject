package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		List<WebElement> tbrows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println("Total rows are: " + tbrows.size());

		List<WebElement> tbcols = driver.findElements(By.xpath("//table[@id='customers']//tr[1]//th"));
		System.out.println("Total columns are: " + tbcols.size());
		
		List<WebElement> thirdCol = driver.findElements(By.xpath("//table[@id='customers']//tr[4]/td"));
		
		for (WebElement thirdColumn:thirdCol) {
			System.out.print(thirdColumn.getText() +"  ");
		}
		
		System.out.println("  ");
		List<WebElement> firstCol = driver.findElements(By.xpath("//table[@id='customers']//td[1]"));
		
		for (WebElement firstColumn:firstCol) {
			System.out.println(firstColumn.getText());
		}

	}

}
