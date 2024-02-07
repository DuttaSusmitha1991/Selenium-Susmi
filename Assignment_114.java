package Assignments_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

//Launch Amazon and click on mobile tab.
public class Assignment_114 {
public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
		driver.findElement(By.id("nav-search-submit-button")).click();
	}

}
