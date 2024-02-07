package Assignments_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//Launch grotechminds registration form and locate dropdowns skills,country 
//and religion perform action on them
public class Assignment_123 {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://grotechminds.com/registration/");
	driver.manage().window().maximize();
	WebElement element= driver.findElement(By.id("Skills"));
	Select s1 = new Select(element);
	s1.selectByVisibleText("Non-Technical Skills");
	WebElement element2=driver.findElement(By.name("Country"));
	Select s2 = new Select(element2);
	s2.selectByVisibleText("India ");	
}
}