package testScripts;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test9 {
@Test
public void tc() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	WebElement ele1 = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
	Actions a=new Actions(driver);
	a.moveToElement(ele1).perform();
	driver.close();
}
}
