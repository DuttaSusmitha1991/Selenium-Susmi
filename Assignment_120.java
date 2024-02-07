package Assignments_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Launch GrowTechminds registration form,for firstname textfield 
//enter name as Manish Kumar Tiwari,remove Tiwari from it using Keys option
public class Assignment_120 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.name("fname"));
		element.sendKeys("Manish Kumar Tiwari");
		for(int i=0;i<=6;i++) {
			element.sendKeys(Keys.BACK_SPACE);
		}	
	}
}
