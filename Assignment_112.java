package Assignments_Selenium;
//Login to Facebook using id,name locator
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_112 {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.findElement(By.id("email")).sendKeys("d.susmitha@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("Susmi@1");
	driver.findElement(By.name("login")).click();

	}

}
