package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest
{	
	
public static void main(String args[]) throws InterruptedException
{

//System.setProperty("webdriver.chrome.driver","C:\\Users\\avina\\chromedriver.exe");
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
//System.setProperty("webdriver.chrome.driver", "C:\\Users\\avina\\chromedriver.exe");

}
}

