package Assignments_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Handle javascript popup of growtechminds application and 
//get the title of the page
public class Assignment_129 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/dsusm/OneDrive/Desktop/PopUp.html");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		WebElement element = driver.findElement(By.id("1"));
		element.sendKeys("Dutta Susmitha");
		
		
		
	}

}
