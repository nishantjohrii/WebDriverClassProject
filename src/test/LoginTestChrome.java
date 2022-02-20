package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestChrome {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.simplilearn.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement Login = driver.findElement(By.xpath("//a[@class='login']"));
		Login.click();

		WebElement EmailAddress = driver.findElement(By.xpath("//input[@name='user_login']"));
		WebElement Password = driver.findElement(By.id("password"));
		WebElement RememberMe = driver.findElement(By.xpath("//*[@class='rememberMe']"));
		WebElement LoginBtn = driver.findElement(By.xpath("//*[@name='btn_login']"));

		EmailAddress.sendKeys("abcxyz@gmail.com");
		Password.sendKeys("Abcd@1234");
		RememberMe.click();
		LoginBtn.click();

		WebElement ErrorMsg = driver.findElement(By.id("msg_box"));

		String ActualMsg = ErrorMsg.getText();
		String ExpectedMsg = "The email or password you have entered is invalid.";

		if (ActualMsg.equals(ExpectedMsg)) {
			System.out.println("TC Passed");
		} else {
			System.out.println("TC Failed");
		}

		List<WebElement> lists = driver.findElements(By.tagName("a"));
		System.out.println("Total links are: " + lists.size());

		for (WebElement list : lists) {
			System.out.println(list.getAttribute("href")); // print the attribute of all links
		}

		// driver.close();
	}

}
