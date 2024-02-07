package Assignments_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//Launch Google.com and click on gmail using linkText.
public class Assignment_115 {
	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Gmail")).click();
			}

}
