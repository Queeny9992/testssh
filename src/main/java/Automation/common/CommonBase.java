package Automation.common;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public class CommonBase {
	 public static void main(String[] args) throws InterruptedException {

	        //Khởi tạo browser với Chrome
	        System.setProperty("webdriver.chrome.driver", "/Users/quynh/Downloads/chromedriver-mac-arm64 2/chromedriver");
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        //Mở trang anhtester.com
	        driver.navigate().to("https://anhtester.com/");
	        Thread.sleep(5000);

	        //Click nút Login
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement loginButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn-login")));
	        loginButton.click();

	        //Tắt browser
	        driver.quit();
	    }
}
