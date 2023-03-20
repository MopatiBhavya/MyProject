package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Testgoogle {
 @Test(priority=1)
	public void Google()
 {
	 ChromeOptions options=new ChromeOptions();
	 options.addArguments("--remote-allow-origins=*");
	 WebDriver driver=new ChromeDriver(options);
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 driver.get("https://www.google.com/");
	 driver.manage().window().maximize();
	 driver.findElement(By.name("q")).sendKeys("hyr");
	 driver.findElement(By.name("q")).submit();
	 System.out.println(driver.getTitle());
	 driver.close();
 }
		 @Test
			public void Facebook() {
			 ChromeOptions options=new ChromeOptions();
			 options.addArguments("--remote-allow-origins=*");
			 WebDriver driver=new ChromeDriver(options);
			 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			 driver.get("https://www.facebook.com/");
			 //driver.findElement(By.xpath("//input[@type='text'])[2]")).sendKeys("7815800237");
			 driver.close();


}
}
