package Assignments_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_124 {
public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/x-path/#1");
		WebElement ss=driver.findElement(By.xpath("//span[@class='folder'][1]"));
		ss.click();
		driver.findElement(By.xpath("(//span[@class='folder'][1]")).click();
		
		//driver.quit();
}

}
