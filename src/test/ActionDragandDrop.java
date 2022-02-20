package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDragandDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		WebElement source = driver.findElement(By.xpath("//li[@id='credit2']/a"));
		
		WebElement target = driver.findElement(By.xpath("//ol[@id='bank']/li"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(source, target).build().perform();
		
		WebElement anotherTarget = driver.findElement(By.xpath("//ol[@id='amt7']/li"));
		WebElement amount = driver.findElement(By.xpath("//li[@data-id='2']/a[text()=' 5000']"));

		action.dragAndDrop(amount, anotherTarget).build().perform();
		

	}

}
