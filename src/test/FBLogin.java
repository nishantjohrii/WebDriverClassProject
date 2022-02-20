package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLogin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement Email = driver.findElement(By.xpath("//*[@id='email']"));
		WebElement Password = driver.findElement(By.xpath("//*[@id='pass']"));
		//WebElement LoginBtn = driver.findElement(By.xpath("//*[@name='login']"));
		
		Email.sendKeys("xyz@gmail.com");
		Password.sendKeys("abcd@123");
	//	LoginBtn.click();

	}

}
