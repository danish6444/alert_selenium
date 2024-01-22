package automation;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws Exception {
	// setting the poperty chrome browser and passing chromedriver path
	System.setProperty("webdriver.chrome.driver", "D:\\Training Materials\\workspace\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     driver.get("https://demoqa.com/alerts");
     //alert handling
     Thread.sleep(2000);
     driver.findElement(By.id("confirmButton")).click();
     Thread.sleep(2000);
     //verify alert text
     String alertText = driver.switchTo().alert().getText();
     String expAlertText = "Do you confirm action?";
     Assert.assertEquals(alertText, expAlertText);
     System.out.println("Alert text verified");
     

	}
}
