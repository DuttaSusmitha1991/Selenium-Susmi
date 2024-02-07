package Assignments_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

//Login to facebook.com using xpath locator(Relative xpath)
public class Assignment_118 {
public static void main(String[] args) throws InterruptedException {
	EdgeDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	WebElement ee =driver.findElement(By.xpath("//input[@id='email']"));
	ee.sendKeys("d.susmithaa@gmail.com");
	ee.sendKeys(Keys.CONTROL+"a");
	ee.sendKeys(Keys.CONTROL+"c");
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(Keys.CONTROL+"v");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(3000);
	driver.quit();	
	}

}
