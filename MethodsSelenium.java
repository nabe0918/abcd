package welearn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import okio.Timeout;

public class MethodsSelenium {

	public static void main(String[] args) throws InterruptedException {

		//Setting WebDriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chand\\Downloads\\chromedriver_win32/chromedriver.exe");
		//Defining WEBdriver object
		WebDriver driver = new ChromeDriver();
		//Maximize browser
		driver.manage().window().maximize();
		
		//Setting URL
		//driver.get("");
		//driver.navigate().to("https://ieltsonlinetests.com/");
		//driver.navigate().back();
		//driver.navigate().refresh();
		
		driver.get("https://cdn.jotfor.ms/201235567417252");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		
		WebElement dateBox = driver.findElement(By.xpath("//input[@placeholder='mm-dd-yyyy']"));
		dateBox.sendKeys("05-09-2020");
		
		Thread.sleep(1000);
		
	}

}
