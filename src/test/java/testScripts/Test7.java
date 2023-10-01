package testScripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test7 {
@Test
public void tc() throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	WebElement ele1=driver.findElement(By.id("twotabsearchtextbox"));
	ele1.sendKeys("phone");
	
	
	
	List<WebElement> list= driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));
	
	System.out.println(list.size());
	for( WebElement a:list) {
		System.out.println(a.getText());
	}
	driver.close();
}






}
