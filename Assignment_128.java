package Assignments_Selenium;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//Launch amazon india search for shoes,select 30th shoe 
//and add it to the cart inspect shoes using xpath
public class Assignment_128 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement element =driver.findElement(By.id("twotabsearchtextbox"));
		element.sendKeys("Shoes");
		element.sendKeys(Keys.ENTER);
		WebElement shoe =driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[30]"));
		shoe.click();
		Set<String> window =driver.getWindowHandles();
		Iterator<String>  ite =window.iterator();
		String Parent =ite.next();
		String Child =ite.next();
		driver.switchTo().window(Child);
		WebElement ele =driver.findElement(By.id("add-to-cart-button"));
		ele.click();
	    
		
	}

}
