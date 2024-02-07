package Assignments_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//Launch Flipkart hover over fashion and click on men's T-shirt
public class Assignment_131 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement element =driver.findElement(By.xpath("(//span[.='Fashion'])[2]"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(element).perform();
		WebElement shirts =driver.findElement(By.linkText("Men's T-Shirts"));
		shirts.click();
		
	}

}
