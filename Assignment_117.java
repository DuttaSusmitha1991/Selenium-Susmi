package Assignments_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_117 {
public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/dsusm/OneDrive/Desktop/learningHTML1.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Dutta Susmitha");
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("Susmi");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("Susmi@1991");
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("SUSMITHA");
		driver.findElement(By.xpath("((/html/body/form)[2]/input)[1]")).click();
		driver.findElement(By.xpath("((/html/body/form)[2]/input)[2]")).click();
		driver.findElement(By.xpath("((/html/body/form)[2]/input)[3]")).click();
		driver.findElement(By.xpath("//input[@type='radio'][1]")).click();
		driver.findElement(By.xpath("//input[@type='radio'][2]")).click();
	}

}
