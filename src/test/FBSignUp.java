package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBSignUp {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
		WebElement firstName = driver.findElement(By.xpath("//*[@name='firstname']"));
		WebElement lastName = driver.findElement(By.xpath("//*[@name='lastname']"));
		WebElement mobileNo = driver.findElement(By.xpath("//*[@name='reg_email__']"));
		WebElement password = driver.findElement(By.xpath("//*[@id='password_step_input']"));

		firstName.sendKeys("Nishant");
		lastName.sendKeys("Johri");
		mobileNo.sendKeys("9986676876");
		password.sendKeys("1234567890");

		// dynamic xpath
		String strGender = "Male";
		String genXpath = "//label[text()='" + strGender + "']/following-sibling::input";
		WebElement gen = driver.findElement(By.xpath(genXpath));
		gen.click();

		List<WebElement> month = driver.findElements(By.xpath("//*[@id='month']/option"));

		for (WebElement months : month) {

			System.out.println(months.getText());
		}

		System.out.println("  ");

		List<WebElement> date = driver.findElements(By.xpath("//*[@id='day']/option"));
		
		for (WebElement dates : date) {
			System.out.println(dates.getText());
		}
		
		//finding the current month
		WebElement currentMonth = driver.findElement(By.xpath("//*[@title='Month']/option[@selected=1]"));
		System.out.println("Current Month: "+currentMonth.getText());
		
		
		//select value from dropdown
		WebElement Day = driver.findElement(By.xpath("//select[@id='day']"));
		Select ddDay = new Select(Day);
		ddDay.selectByVisibleText("21");
		
		WebElement Month = driver.findElement(By.xpath("//select[@id='month']"));
		Select ddMonth = new Select(Month);
		ddMonth.selectByVisibleText("Dec");
		
		WebElement Year = driver.findElement(By.xpath("//select[@id='year']"));
		Select ddyear = new Select(Year);
		ddyear.selectByVisibleText("1995");
	}

}
