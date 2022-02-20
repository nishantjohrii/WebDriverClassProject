package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		//alert accept
	WebElement alertAccept = driver.findElement(By.xpath("//*[@id='alertButton']"));
		alertAccept.click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		
		//alert dismiss
		WebElement alertDismiss = driver.findElement(By.xpath("//*[@id='confirmButton']"));
		alertDismiss.click();
		Alert alert1 = driver.switchTo().alert();
		System.out.println(alert.getText()); 
		alert1.dismiss();      
		
		//enter text in alert
		WebElement enterTextandAccept = driver.findElement(By.xpath("//button[@id='promtButton']"));
		enterTextandAccept.click();
		Alert alert2 = driver.switchTo().alert();
		System.out.println(alert2.getText());
		alert2.sendKeys("This is a test text");
		alert2.accept();
		

	}

}
