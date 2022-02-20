package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	WebElement chooseFile =	driver.findElement(By.xpath("//input[@name='uploadfile_0']"));
	chooseFile.sendKeys("C:\\Users\\91998\\OneDrive\\Desktop\\web-to-case html.txt");
	
	driver.findElement(By.xpath("//input[@name='terms']")).click();
	driver.findElement(By.xpath("//button[@id='submitbutton']")).click();
		
		//C:\Users\91998\OneDrive\Desktop\web-to-case html.txt

	}

}
