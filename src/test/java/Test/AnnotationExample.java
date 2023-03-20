package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AnnotationExample {
   @Test
	public void HyrAnnoatation() {
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(options);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.findElement(By.name("q")).sendKeys("hyr tutorials",Keys.ENTER);
    String expectedTitle="hyr tutorials - Google Search";
    String ActualTitle=driver.getTitle();
    Assert.assertEquals(ActualTitle,expectedTitle,"Title is mismatched" );
    driver.quit();
}
}
