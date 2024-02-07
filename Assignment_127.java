package Assignments_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Launch www.flipkart.com page,search for books and click on 
//second autosuggestion use xpath to locate autosuggestions.
public class Assignment_127 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement search =driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		search.sendKeys("Books");
		List<WebElement> list =driver.findElements(By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']/li"));
		int count =list.size();
		System.out.println(count);
		
		 Thread.sleep(2000);
		 list.get(count-7).click();
		 
		
	}

}
