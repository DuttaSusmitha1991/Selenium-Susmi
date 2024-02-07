package Assignments_Selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//"Count the number of 
//links we have in amazon web
//page,locate using tag
//name"
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_126 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		List<WebElement> element =driver.findElements(By.tagName("a"));
		int links =element.size();
	
	}

}
