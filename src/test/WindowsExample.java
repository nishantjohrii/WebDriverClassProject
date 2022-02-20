package test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String parentWin = driver.getWindowHandle();

		WebElement newWindow = driver.findElement(By.xpath("//button[@id='windowButton']"));
		newWindow.click();

		/*
		 * Set<String> handles = driver.getWindowHandles(); Iterator<String> itr =
		 * handles.iterator();
		 * 
		 * while(itr.hasNext()) {
		 * 
		 * String currentval = itr.next();
		 * 
		 * if(!currentval.equals(parentWin)) { driver.switchTo().window(currentval); } }
		 */

		Set<String> winHandles = driver.getWindowHandles();

		for (String winHandle : winHandles) {

			driver.switchTo().window(winHandle);
		}

		WebElement findtext = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		System.out.println(findtext.getText());
		
		driver.switchTo().window(parentWin);
		System.out.println("Back to parent window");
		driver.close();
	}

}
