package testScripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test8 {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	WebElement ele1=driver.findElement(By.id("searchDropdownBox"));
	
	Select s=new Select(ele1);
	s.selectByVisibleText("Amazon Devices");
	System.out.println(s.isMultiple());
	
	List<WebElement> list=s.getOptions();
	System.out.println(list.size());
	
	for(WebElement b:list) {
		System.out.println(b.getText());
	}
}
}
