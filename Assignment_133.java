package Assignments_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//Launch grotechminds registration page and handle drop down print
//all the option names present in drop downs 
public class Assignment_133 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement drag =driver.findElement(By.id("drag2"));
		
		WebElement drop =driver.findElement(By.id("div2"));
		
		Actions a1 = new Actions(driver);
		a1.dragAndDrop(drag, drop).perform();
		
		
		
		
		
		
	}
	

}
